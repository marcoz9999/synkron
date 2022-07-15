package testScripts;

import static testUtilities.Constants.chromedriverFilePath;
import static testUtilities.TestRunner.report;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentTest;

import testUtilities.Drex;
import testUtilities.ReadDatasheet;

/**
 * @author Ksquare
 *
 */
public abstract class TestScript {

	public WebDriver driver;
	public String tcId;
	public ExtentTest test;

	public Map<String, String> data;

	abstract public void initializePageObjects();

	public void setInputData() {
		//Override when needed
	}

	@BeforeClass
	public void initializeTest() {
		System.setProperty("webdriver.chrome.driver", chromedriverFilePath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");

		driver = new ChromeDriver(options);
		tcId = this.getClass().getSimpleName();
		String url = ReadDatasheet.get("BaseUrl", tcId);
		driver.get(url);

		Drex.setKeyInLocalStorage(driver, "defaultLanguage", ReadDatasheet.get("defaultLanguage", tcId));

		test = Drex.initializeTest(report, tcId);

		setInputData();
		initializePageObjects();
	}

	@AfterClass
	public void terminate() {
		driver.quit();
	}

}