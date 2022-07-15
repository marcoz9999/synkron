package testUtilities;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.collect.Comparators;

/**
 * @author Diego Hernandez
 * @Description Drex stands for Driver Execute. It's an interface that helps to
 *              group Selenium instructions to the WebDriver.
 *
 */
public interface Drex {

	static ExtentReports initializeReport() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		String htmlReportName = sdf.format(timestamp);

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"src/test/resources/Reporting/HTML/SuiteRun_" + htmlReportName);
		extent.attachReporter(spark);

		return extent;
	}

	static void setKeyInLocalStorage(WebDriver driver, String key, String value) {
		try {
			((JavascriptExecutor) driver)
					.executeScript(String.format("window.localStorage.setItem('%s','%s');", key, value));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static ExtentTest initializeTest(ExtentReports extent, String tcId) {
		return extent.createTest(ReadDatasheet.get("TCID", tcId));
	}

	static void waitForPageToLoad(WebDriverWait wait) {
		ExpectedCondition<Boolean> expectation = driver1 -> ((JavascriptExecutor) driver1)
				.executeScript("return document.readyState").toString().equals("complete");

		try {
			Thread.sleep(1000);
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}

	static void waitForElementToBeClickable(String xpath, WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

	static void waitForElementToBeVisible(String xpath, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	static void click(String xpath, String elementName, WebDriver driver, ExtentTest test) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			test.info("Clicked on \"" + elementName + "\"");
		} catch (NoSuchElementException | IndexOutOfBoundsException e) {
			test.log(Status.FAIL, "Element \"" + elementName + "\" not found");
			Drex.logInfoScreenshot(elementName + " element not found", test, driver);
		}
	}

	static void clickWebElement(WebElement element, String elementName, WebDriver driver, ExtentTest test) {
		try {
			element.click();
			test.log(Status.INFO, "Clicked on \"" + elementName + "\"");
		} catch (NoSuchElementException | IndexOutOfBoundsException e) {
			test.log(Status.FAIL, "Element \"" + elementName + "\"not found");
			Drex.logInfoScreenshot(elementName + " element not found", test, driver);
		}
	}

	static void clearWebField(String xpath, String elementName, WebDriver driver, ExtentTest test) {
		WebElement element = driver.findElement(By.xpath(xpath));
		while (!element.getAttribute("value").equals("")) {
			element.sendKeys(Keys.BACK_SPACE);
		}
		test.log(Status.INFO, "Cleared \"" + elementName + "\"");
	}

	static void clickWithJsExecutor(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

	static void clickWithActions(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

	static void clearAndInputText(String xpath, String fieldName, String inputText, WebDriver driver, ExtentTest test) {
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(inputText);
		test.log(Status.INFO, "Cleared field \"" + fieldName + "\" and entered text \"" + inputText + "\"");
	}

	static void clearAndInputTextOnWebElement(WebElement element, String elementName, String inputText,
			ExtentTest test) {

		element.clear();
		element.sendKeys(inputText);
		test.log(Status.INFO, "Cleared \"" + elementName + "\" and filled with text: " + inputText);
	}

	static void hitKeys(String xpath, Keys key, WebDriver driver) {
		driver.findElement(By.xpath(xpath)).sendKeys(key);
	}

	static void pickFromSelectTag() {

	}

	static void pickFromUlTag() {

	}

	static void verifyIfElementExistAndReport(String xpath, String elementName, WebDriverWait wait, WebDriver driver,
			ExtentTest test) {
		Drex.waitForPageToLoad(wait);
		WebElement element;

		try {
			element = driver.findElement(By.xpath(xpath));
			Drex.highlightWithJsEx(element, driver);
			report(driver, elementName + " found", Status.PASS, test);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			report(driver, elementName + " not found", Status.FAIL, test);
		}
	}

	static void report(WebDriver driver, String message, Status status, ExtentTest test) {
		test.log(status, message);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Drex.logScreenshot(driver)).build());
	}

	static void verifyAsPassIfElementDoesNotExistAndReport(String xpath, String validation, WebDriver driver,
			ExtentTest test) {

		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		if (elements.size() == 0) {
			test.log(Status.PASS, validation);
		} else {
			test.log(Status.FAIL, validation);
		}
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Drex.logScreenshot(driver)).build());
	}

	static void logInfoScreenshot(String logText, ExtentTest test, WebDriver driver) {
		test.log(Status.INFO, logText);
		test.info(MediaEntityBuilder.createScreenCaptureFromPath(Drex.logScreenshot(driver)).build());
	}

	static void logWindowScreenshot(String logText, ExtentTest test) {
		test.log(Status.INFO, logText);
		test.info(MediaEntityBuilder.createScreenCaptureFromPath(Drex.logWindowScreenshot()).build());
	}

	static void logPassScreenshot(String logText, ExtentTest test, WebDriver driver) {
		test.log(Status.PASS, logText);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Drex.logScreenshot(driver)).build());
	}

	static void logFailScreenshot(String logText, ExtentTest test, WebDriver driver) {
		test.log(Status.FAIL, logText);
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(Drex.logScreenshot(driver)).build());
	}

	static void logInfo(String description, ExtentTest test) {
		test.info(description);
	}

	static String logScreenshot(WebDriver driver) {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String img = System.getProperty("user.dir") + "/src/test/resources/Reporting/Screenshots/ScreenCapture_"
				+ sdf.format(timestamp) + ".png";

		try {
			FileUtils.copyFile(screenshotFile, new File(img));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return img;
	}

	static String logWindowScreenshot() {
		BufferedImage image = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String img = System.getProperty("user.dir") + "/src/test/resources/Reporting/Screenshots/ScreenCapture_"
				+ sdf.format(timestamp) + ".png";
		try {
			image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		} catch (HeadlessException | AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ImageIO.write(image, "png", new File(img));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}

	static void dragAndDropWithRobot(String source, String target, String sourceName, String targetName,
			ExtentTest test, WebDriver driver) throws AWTException, InterruptedException {

		Robot robot = new Robot();
		robot.mouseMove(0, 0);

		WebElement from = driver.findElement(By.xpath(source));
		WebElement to = driver.findElement(By.xpath(target));

		int start_x = from.getLocation().getX();
		int start_y = from.getLocation().getY() + 127;

		int end_x = to.getLocation().getX() + 20;
		int end_y = to.getLocation().getY() + 120;

		robot.mouseMove(start_x, start_y);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(3000);

		for (int i = 0; i < 100; i++) {
			int mov_x = ((end_x * i) / 100) + (start_x * (100 - i) / 100);
			int mov_y = ((end_y * i) / 100) + (start_y * (100 - i) / 100);
			robot.mouseMove(mov_x, mov_y);
			robot.delay(5);
		}

		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		test.log(Status.INFO, "Dragging " + sourceName + " element and dropping to " + targetName + " position...");
	}

	static void dropFileFromExplorerWithRobot(String filePath, String target, String sourceName, String targetName,
			ExtentTest test, WebDriver driver) throws AWTException, InterruptedException {

		Robot robot = new Robot();

		robot.mouseMove(0, 0);
		robot.delay(1000);
		robot.mouseMove(275, 50);
		StringSelection fileFolderPath = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileFolderPath, null);

		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(250);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(250);

		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.delay(400);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_WINDOWS);

		robot.mouseMove(0, 0);

		WebElement to = driver.findElement(By.xpath(target));

		int start_x = 240;
		int start_y = 180;

		int end_x = to.getLocation().getX() + 20;
		int end_y = to.getLocation().getY() + 120;

		robot.mouseMove(start_x, start_y);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(3000);

		for (int i = 0; i < 100; i++) {
			int mov_x = ((end_x * i) / 100) + (start_x * (100 - i) / 100);
			int mov_y = ((end_y * i) / 100) + (start_y * (100 - i) / 100);
			robot.mouseMove(mov_x, mov_y);
			robot.delay(5);
		}

		Drex.logInfoScreenshot("Dropping image to Image drop zone", test, driver);

		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		test.log(Status.INFO, "Dragging " + sourceName + " element and dropping to " + targetName + " position...");

		robot.mouseMove(600, 10);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(200);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
	}

	static void selectFileWithRobot(String filePath) throws AWTException {
		Robot robot = new Robot();
		robot.mouseMove(0, 0);
		robot.delay(1000);
		//robot.mouseMove(400, 50);
		robot.mouseMove(400, 50);
		robot.mouseMove(350, 50);
		StringSelection fileFolderPath = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileFolderPath, null);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(250);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(250);
		//robot.mouseMove(320, 135);
		robot.mouseMove(225, 140);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	static void dropFileWithRobot(String filePath) throws AWTException {
		Robot robot = new Robot();
		robot.mouseMove(0, 0);
		robot.delay(1000);
		robot.mouseMove(240, 180);
		StringSelection fileFolderPath = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileFolderPath, null);

		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(250);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(250);
		robot.mouseMove(695, 450);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(250);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	static void dragAndDropByOffsetWithRobot(String sourceElement, int offset, WebDriver driver)
			throws AWTException, InterruptedException {

		WebElement source = driver.findElement(By.xpath(sourceElement));

		int source_x = source.getLocation().x + 5;
		int source_y = source.getLocation().y + 120;

		Robot robot = new Robot();
		robot.mouseMove(0, 0);
		robot.mouseMove(source_x, source_y);

		int target_x = source_x + offset;

		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1000);
		for (int i = 0; i < 100; i++) {
			int mov_x = ((target_x * i) / 100) + (source_x * (100 - i) / 100);
			robot.mouseMove(mov_x, source_y);
			robot.delay(5);
		}
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
	}

	static void waitForElementToDisappear(String xpath, WebDriverWait wait, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	static void scrollIntoViewWithJsExec(String xpath, WebDriver driver) {
		try {
			WebElement element = driver.findElement(By.xpath(xpath));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (NoSuchElementException e) {
			System.out.println("Attempted to scroll element into view. Element is not available.");
		}
	}

	static void selectAllAndDeleteWithSendKeys(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.sendKeys(Keys.CONTROL + "A");
		element.sendKeys(Keys.DELETE);
	}

	static void dragAndDropByOffsetWithActions(String xpath, String offset, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(driver.findElement(By.xpath(xpath)), Integer.parseInt(offset), 0).build().perform();
	}

	static void highlightWithJsEx(WebElement element, WebDriver driver) {
		((JavascriptExecutor) driver)
				.executeScript("arguments[0].setAttribute('style', 'border: 5px solid greenyellow;')", element);
	}

	static void highlightRedWithJsEx(WebElement element, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', 'border: 5px solid red;')",
				element);
	}

	static void waitForElementToBeVisible(String xpath, WebDriverWait wait, WebDriver driver) {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
	}

	static void zoomInOut(String zoom, WebDriver driver) {
		// Note: 1.0 = 100%, 1.5 = 150%, .5 = 50%
		((JavascriptExecutor) driver).executeScript(String.format("document.body.style.zoom = '%s'", zoom));
	}

	static void verifyText(String xpath, String expectedValue, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		String value = element.getText();

		Assert.assertEquals(value, expectedValue);
		highlightWithJsEx(element, driver);
	}

	static boolean verifyAttribute(String xpath, String attribute, String expectedValue, WebDriverWait wait,
			WebDriver driver, ExtentTest test) {
		Drex.waitForElementToBeVisible(xpath, wait);
		String value = driver.findElement(By.xpath(xpath)).getAttribute(attribute);
		try {
			Assert.assertEquals(value, expectedValue);
			return true;
		} catch (AssertionError e) {
			return false;
		}
	}

	static List<WebElement> getElementList(String xpath, WebDriver driver) {
		return driver.findElements(By.xpath(xpath));
	}

	static String formatTodayToSpecificPattern(String tcId) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(ReadDatasheet.get("DateFormat", tcId), Locale.US);
		String formattedDate = ZonedDateTime.now().format(dateFormat);
		System.out.println(formattedDate);
		return formattedDate;
	}

	static String addMonthsToCurrentDateAndFormatToSpecificPattern(String tcId) {
		LocalDateTime dateObject = LocalDateTime.now().plusMonths(Integer.parseInt(ReadDatasheet.get("Months", tcId)));
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(ReadDatasheet.get("DateFormat", tcId), Locale.US);
		String formattedDate = dateObject.format(dateFormat);
		System.out.println(formattedDate);
		return formattedDate;
	}

	static boolean checkIfCheckboxIsSelected(String xpath, WebDriver driver) {
		if (driver.findElement(By.xpath(xpath)).isSelected())
			return true;
		else
			return false;

	}

	static boolean verifyIfElementExistAndReturnBoolean(String xpath, WebDriver driver) {
		try {
			driver.findElement(By.xpath(xpath));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	static void clickFirstFromWebElementsList(String xpath, String elementName, WebDriver driver, ExtentTest test) {
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		Drex.clickWebElement(elements.get(0), "First " + elementName + " element found.", driver, test);
	}

	static void clickLastElement(String xpath, String elementName, WebDriver driver, ExtentTest test) {
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		Drex.clickWebElement(elements.get(elements.size() - 1), "#" + (elements.size() - 1) + " element found.", driver,
				test);

	}

	static boolean verifyIfElementIsEnabled(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		if (element.isEnabled())
			return true;
		else
			return false;

	}

	static boolean verifyIfElementContainsText(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		if (element.getText().isEmpty())
			return false;

		else {
			System.out.println(element.getText());
			return true;
		}
	}

	static boolean verifyIfElementHasRequiredAttribute(String xpath, WebDriver driver, ExtentTest test) {
		if (driver.findElement(By.xpath(xpath)).getAttribute("required").equalsIgnoreCase("true"))
			return true;
		else
			return false;
	}

	static void verifyIfElementIsOptional(String xpath, String elementName, WebDriverWait wait, WebDriver driver,
			ExtentTest test) {
		if (driver.findElement(By.xpath(xpath)).getAttribute("placeholder").contains("(Optional)")
				|| driver.findElement(By.xpath(xpath)).getAttribute("placeholder").contains("(Opcional)")) {
			Drex.highlightWithJsEx(driver.findElement(By.xpath(xpath)), driver);
			Drex.logPassScreenshot(elementName + " field is optional", test, driver);
		}
	}

	static boolean verifyIfErrorMessageEmptyFieldIsDisplayed(String xpath, String errorMessage, String elementName,
			WebDriverWait wait, WebDriver driver, ExtentTest test) {
		Drex.click(xpath, elementName, driver, test);
		Drex.selectAllAndDeleteWithSendKeys(xpath, driver);
		Drex.hitKeys(xpath, Keys.TAB, driver);
		if (driver.findElement(By.xpath(errorMessage)).getText().contains("empty")
				|| driver.findElement(By.xpath(errorMessage)).getText().contains("vac�o")) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isSorted(List<String> listOfStrings) {
		return Comparators.isInOrder(listOfStrings, Comparator.<String>naturalOrder());
	}

	public static boolean isSortedReverse(List<String> listOfStrings) {
		return Comparators.isInOrder(listOfStrings, Comparator.<String>reverseOrder());
	}

	static void scrollToTop(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
	}
	static boolean verifyCSSValue(String xpath, String ccsvalue, String expectedValue, WebDriverWait wait,
			WebDriver driver, ExtentTest test) {
		Drex.waitForElementToBeVisible(xpath, wait);
		String value = driver.findElement(By.xpath(xpath)).getCssValue(ccsvalue);
		try {
			Assert.assertEquals(value, expectedValue);
			return true;
		} catch (AssertionError e) {
			return false;
		}
	}
	static void clickAndHold(WebElement elementName, WebDriver driver, ExtentTest test) {
		Actions action = new Actions(driver);
	    action.clickAndHold(elementName).build().perform();
	}
	static void clickRelease(WebElement elementName, WebDriver driver, ExtentTest test) {
		Actions action = new Actions(driver);
	    //you need to release the control from the test
	    action.moveToElement(elementName).release();
	}
}
