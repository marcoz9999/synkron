package businessLogic;



import static pageObjects.PO_Page.assignmentSearch;
import static pageObjects.PO_Page.calendarDay;
import static pageObjects.PO_Page.close;
import static pageObjects.PO_Page.columns;
import static pageObjects.PO_Page.confDropBox;
import static pageObjects.PO_Page.cropPhotoSlider;
import static pageObjects.PO_Page.dismiss;
import static pageObjects.PO_Page.goBack;
import static pageObjects.PO_Page.logout;
import static pageObjects.PO_Page.nextMonth;
import static pageObjects.PO_Page.pictureIcon;
import static pageObjects.PO_Page.profileIcon;
import static pageObjects.PO_Page.publishedContentClose;
import static pageObjects.PO_Page.save;
import static pageObjects.PO_Page.saveImage;
import static pageObjects.PO_Page.userSearchResults;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testUtilities.Drex;
import testUtilities.ReadDatasheet;

public class BL_Page {
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest test;
	String tcId;

	Map<String, String> data;

	public BL_Page(WebDriver driver, String tcId, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		this.tcId = tcId;
		wait = new WebDriverWait(driver, 15);
	}

	public BL_Page(WebDriver driver, String tcId, ExtentTest test, Map<String, String> data) {
		this(driver, tcId, test);
		this.data = data;
	}

	public void click(String xpath, String name) {
		Drex.waitForPageToLoad(wait);
		Drex.waitForElementToBeClickable(xpath, wait);
		Drex.click(xpath, name, driver, test);
	}

	public void verifyFieldLooksOptional(String fieldName, String fieldXpath, String labelXpath) {
		String fieldNameOptional = fieldName + " (Optional)";
		Drex.waitForElementToBeVisible(fieldXpath, wait);
		Drex.verifyText(labelXpath, fieldNameOptional, driver);
		Drex.clearWebField(fieldXpath, fieldName + "input", driver, test);
	}

	public void verifyFieldLooksRequired(String fieldName, String fieldXpath, String labelXpath, String warningXpath) {
		Drex.waitForElementToBeVisible(fieldXpath, wait);
		Drex.verifyText(labelXpath, fieldName, driver);
		Drex.clearWebField(fieldXpath, fieldName + "input", driver, test);
		Drex.waitForElementToBeVisible(warningXpath, wait);
		Drex.verifyIfElementExistAndReport(warningXpath, fieldName + " empty warning", wait, driver, test);
		Drex.verifyText(warningXpath, "Field cannot be empty", driver);
	}

	public void logout() {
		Drex.waitForPageToLoad(wait);
		Drex.click(profileIcon, "Profile Icon", driver, test);
		Drex.logInfoScreenshot("Logout", test, driver);
		Drex.click(logout, "Logout", driver, test);
	}

	public void clickOnNextStep(String xpath, String elementName, WebDriver driver, ExtentTest test) {
		Drex.click(xpath, elementName, driver, test);
	}

	public void verifyUserIsAbleToScheduleEvent(String contentType) {

		Boolean expectedValue = null;

		switch (contentType) {
		case "Course":
			expectedValue = true;
			break;

		case "LT":
			expectedValue = false;
			break;
		}

		String todayXpath = String.format(calendarDay, Drex.formatTodayToSpecificPattern(tcId));

		if (Drex.verifyAttribute(todayXpath, "aria-selected", "true", wait, driver, test)) {
			Drex.report(driver, "\"Today\" is automatically selected (and enabled)", Status.PASS, test);
			Drex.verifyIfElementExistAndReport(todayXpath, "Today", wait, driver, test);
		} else if (!expectedValue) {
			Drex.verifyIfElementExistAndReport(todayXpath, "Today is enabled for selection", wait, driver, test);
		} else {
			Drex.report(driver, "\"Today\" is not selected (not enabled)", Status.FAIL, test);
		}

		if (Drex.verifyAttribute(todayXpath + "/preceding-sibling::div[1]", "aria-disabled", "true", wait, driver,
				test)) {
			// Drex.report(driver, "Prior than today is disabled for selection as
			// expected.", Status.PASS, test);
			Drex.verifyIfElementExistAndReport(todayXpath + "/preceding-sibling::div[1]",
					"Prior than today is disabled for selection as expected", wait, driver, test);
		} else
			Drex.report(driver, "Prior than today is not disabled.", Status.FAIL, test);

		String todayPlusSixMonths = Drex.addMonthsToCurrentDateAndFormatToSpecificPattern(tcId);
		String todayPlusSixMonthsXpath = String.format(calendarDay, todayPlusSixMonths);

		while (!Drex.verifyIfElementExistAndReturnBoolean(todayPlusSixMonthsXpath, driver)) {
			Drex.click(nextMonth, "Next Month", driver, test);
			Drex.waitForPageToLoad(wait);
			if (Drex.verifyIfElementExistAndReturnBoolean(todayPlusSixMonthsXpath, driver)) {
				if (Drex.verifyAttribute(todayPlusSixMonthsXpath, "aria-disabled", "false", wait, driver, test))
					Drex.verifyIfElementExistAndReport(todayPlusSixMonthsXpath,
							"Today + 6 months is enabled for selection and ", wait, driver, test);
			}
		}
	}

	public void addImageToContent() throws NumberFormatException, InterruptedException {
		Drex.click(confDropBox, "Drag your image here or browse image", driver, test);
		Drex.waitForPageToLoad(wait);
		try {
			Drex.selectFileWithRobot(ReadDatasheet.get("InputFilePath", tcId));
		} catch (AWTException e1) {
			e1.printStackTrace();
		}
		Drex.logInfoScreenshot("Picked test photo to add to Course Image", test, driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String imageMove = "//img[@class='reactEasyCrop_Image']";
		Drex.dragAndDropByOffsetWithActions(cropPhotoSlider, ReadDatasheet.get("OffsetX", tcId), driver);
		Drex.logInfoScreenshot("Dragged slider in Crop Photo component", test, driver);
		Drex.clickWithActions(imageMove, driver);
		//Drex.dragAndDropByOffsetWithActions(cropPhotoImgContainer,ReadDatasheet.get("OffsetX", tcId), driver);
		//Drex.dragAndDropByOffsetWithActions(cropPhotoImgContainer,ReadDatasheet.get("OffsetY", tcId), driver);
		Drex.logInfoScreenshot("Dragged Image in Crop Photo component", test, driver);
		Drex.click(saveImage, "Save image", driver, test);
		Drex.waitForPageToLoad(wait);
	}
	public void addImageToCrop() throws NumberFormatException, InterruptedException {
		Drex.click(confDropBox, "Drag your image here or browse image", driver, test);
		try {
			Drex.selectFileWithRobot(ReadDatasheet.get("InputFilePath", tcId));
		} catch (AWTException e1) {
			e1.printStackTrace();
		}
		Drex.logInfoScreenshot("Picked test photo to add to Course Image", test, driver);
	}

	public void addImageToCertificate() throws NumberFormatException, InterruptedException {
		try {
			Drex.selectFileWithRobot(ReadDatasheet.get("InputFilePath", tcId));
		} catch (AWTException e1) {
			e1.printStackTrace();
		}
		Drex.logInfoScreenshot("Picked test photo to add to Certificate Template", test, driver);
	}

	public void dropImageToContent() throws NumberFormatException, InterruptedException {
		Drex.click(confDropBox, "Drag your image here or browse image", driver, test);
		try {
			Drex.dropFileFromExplorerWithRobot(ReadDatasheet.get("InputFilePath", tcId), pictureIcon, "Test image",
					"Image drop zone", test, driver);
		} catch (AWTException e1) {
			e1.printStackTrace();
		}
		Drex.logWindowScreenshot("Picked test photo to add to Course Image", test);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Drex.dragAndDropByOffsetWithActions(cropPhotoSlider, ReadDatasheet.get("OffsetX", tcId), driver);

		Drex.logInfoScreenshot("Dragged slider in Crop Photo component", test, driver);
		Drex.click(saveImage, "Save image", driver, test);
		Drex.waitForPageToLoad(wait);
	}

	public void searchAndSelectFirstResult() {
		Drex.clearAndInputText(assignmentSearch, "Search", ReadDatasheet.get("Assignee", tcId), driver, test);

		Drex.waitForPageToLoad(wait);
		List<WebElement> userResults = driver.findElements(By.xpath(userSearchResults));
		WebElement firstResult = userResults.get(0).findElement(By.xpath("./div"));
		Drex.clickWebElement(firstResult, "First result", driver, test);
	}

	public void clickPublishedContentCloseButton() {
		Drex.click(publishedContentClose, "Close", driver, test);
	}

	public void clickOnGoBack() {
		Drex.click(goBack, "Go Back", driver, test);
	}

	public void clickOnClose() {
		Drex.click(close, "Close", driver, test);
	}

	public void clickOnSave() {
		Drex.click(save, "Save", driver, test);
	}

	public void clickOnColumns() {
		click(columns, "Columns");
	}

	public void closeSnackbar() {
		Drex.click(dismiss,"Snackbar" , driver, test);
	}
}

