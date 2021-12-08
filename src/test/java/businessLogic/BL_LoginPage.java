package businessLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import testUtilities.Drex;
import testUtilities.ReadDatasheet;

import java.util.Map;

import static pageObjects.PO_LoginPage.*;

/**
 * @author Ksquare
 *
 * @Description This Class represents the actions that can be performed in
 *              Zaamna Login page.
 *
 */
public class BL_LoginPage extends BL_Page {

	public BL_LoginPage(WebDriver driver, String tcId, ExtentTest test) {
		super(driver, tcId, test);
	}

	public BL_LoginPage(WebDriver driver, String tcId, ExtentTest test, Map<String, String> data) {
		super(driver, tcId, test, data);
	}

	public void login() throws InterruptedException {
		Drex.logInfo(ReadDatasheet.get("Description", tcId), test);
		Drex.waitForPageToLoad(wait);
		Thread.sleep(3000);
		Drex.clearAndInputText(username, "Username", ReadDatasheet.get("Username", tcId), driver, test);
		Drex.clearAndInputText(password, "Password", ReadDatasheet.get("Password", tcId), driver, test);
		Drex.click(loginButton, "Log In", driver, test);
	}

	public void verifySignInPhrase() {
		Drex.waitForPageToLoad(wait);
		WebElement element = driver.findElement(By.xpath(signInPhrase));
		if (!element.getText().isEmpty())
			Drex.verifyIfElementExistAndReport(signInPhrase,
					String.format("Sign In Phrase is present with text: \"%s\"", element.getText()), wait, driver, test);
		else
			Drex.logFailScreenshot("Sign In Phrase is empty", test, driver);

	}
	
	public void verifyMandatoryFields() throws InterruptedException {
		Drex.logInfo(ReadDatasheet.get("Description", tcId), test);
		Drex.waitForPageToLoad(wait);
		Thread.sleep(3000);
		Drex.hitKeys(username, Keys.TAB, driver);
		Drex.verifyIfElementExistAndReport(username,
				driver.findElement(By.xpath(username)).getAttribute("placeholder")
						.concat(" \"cannot be empty\" message"),
				wait, driver, test);
		
		Drex.hitKeys(password, Keys.TAB, driver);
		Drex.verifyIfElementExistAndReport(password,
				driver.findElement(By.xpath(password)).getAttribute("placeholder")
						.concat(" \"cannot be empty\" message"),
				wait, driver, test);
		Drex.scrollIntoViewWithJsExec(loginButton, driver);
		if(!Drex.verifyIfElementIsEnabled(loginButton, driver))
		Drex.logPassScreenshot("Login button disabled", test, driver);
		else 
		Drex.logFailScreenshot("Login button enabled", test, driver);
		Thread.sleep(2000);
		Drex.clearAndInputText(username, "Username", ReadDatasheet.get("Username", tcId), driver, test);
		Drex.clearAndInputText(password, "Password", ReadDatasheet.get("Password", tcId), driver, test);
		if(Drex.verifyIfElementIsEnabled(loginButton, driver))
			Drex.logPassScreenshot("Login button enabled", test, driver);
		else 
			Drex.logFailScreenshot("Login button disabled", test, driver);

	}
}
