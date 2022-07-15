package testUtilities;

import static testUtilities.Constants.chromedriverFilePath;
import static testUtilities.Constants.datasheetFilePath;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class TesterClass {


	public static void main(String[] args) {
		readTxtFile();
	}

	public static void setSliderValue() {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", chromedriverFilePath);

		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, 20);


		driver.get("https://crossbrowsertesting.github.io/drag-and-drop");

		Drex.waitForPageToLoad(wait);

		Drex.setKeyInLocalStorage(driver, "defaultLanguage", "en");

		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.moveToElement(from)
				.clickAndHold()
				.pause(Duration.ofSeconds(1))
				.moveToElement(to)
				.pause(Duration.ofSeconds(1))
				.release()
				.build()
				.perform();
	}

	public static ArrayList<String> getTestCasesWithFillo() {
		ArrayList<String> testCases = new ArrayList<>();

		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(datasheetFilePath);

			String strQuery = "Select * from Data where \"Execute\" = 'Y'";
			Recordset recordSet = connection.executeQuery(strQuery);

			System.out.println("Test cases to execute: ");
			while (recordSet.next()) {
				testCases.add(recordSet.getField("ClassName"));
			}
			System.out.print(testCases);

			recordSet.close();
			connection.close();

		} catch (FilloException e) {
			e.printStackTrace();
		}

		return testCases;
	}

	public static void readTxtFile()
	{
		String someString = "0006332000741807	PCTS	TEST1";
		String[] valuesList = someString.replaceAll("\t", "\\|").split("\\|");
		System.out.println(valuesList[0]);
		System.out.println("Transformed string: "+someString.replaceAll("\t", "\\|"));
	}
}
