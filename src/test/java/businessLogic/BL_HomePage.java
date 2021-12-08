package businessLogic;

import static pageObjects.PO_HomePage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

import testUtilities.Drex;
import testUtilities.ReadDatasheet;

import java.util.Map;

/**
 * @author Ksquare
 *
 * @Description This Class represents the actions that can be performed in
 *              Zaamna Home page.
 *
 */
public class BL_HomePage extends BL_Page {	
	public BL_HomePage(WebDriver driver, String tcId, ExtentTest test) {
		super(driver, tcId, test);
	}

	public BL_HomePage(WebDriver driver, String tcId, ExtentTest test, Map<String, String> data) {
		super(driver, tcId, test, data);
	}

	public void verifyUserReachedHomePage() {
		Drex.waitForPageToLoad(wait);
		Drex.waitForElementToBeVisible(profileIcon, wait);
		Drex.verifyIfElementExistAndReport(profileIcon, "Verify if user is logged in", wait, driver, test);
	}

	public void goToDashboard() {
		Drex.waitForPageToLoad(wait);
		Drex.click(dashboard, "Dashboard", driver, test);
	}
	
	public void goToCourses() {
		Drex.click(courses, "Courses", driver, test);
	}

	public void goToLearningPlans() {
		Drex.click(learningPlans, "Learning Plans", driver, test);

	}

	public void goToPrograms() {
		Drex.click(programs, "Programs", driver, test);

	}

	public void goToUsers()
	{
		Drex.click(users, "Users", driver, test);
	}

	public void goToSettings() {
		Drex.waitForPageToLoad(wait);
		Drex.click(profileIcon, "Profile Icon", driver, test);
		Drex.click(settings, "Settings", driver, test);
	}
	
	public void goToGroups() {
		Drex.click(groups, "Groups", driver, test);
	}

	public void gotoLiveTrainings() {
		Drex.click(liveTraining, "Live Trainings", driver, test);
		
	}
	
	public void verifySideMenuIsNotIntrusiveAtDashboardScreen() {
		Drex.waitForPageToLoad(wait);
		Drex.waitForElementToBeVisible(dashboardLabel, wait);
		Drex.click(dashboard, "Dashboard Side Menu Click", driver, test);
		Drex.verifyIfElementExistAndReport(dashboardLabel, "Verify if Dashboard Label is Visible", wait, driver, test);
		Drex.verifyIfElementExistAndReport(mostPopularTrainingsLabel, "Verify if Most Popular Trainings Label is Visible", wait, driver, test);
		Drex.click(sideMenuRightArrow, "Side Menu Arrow Click", driver, test);
		Drex.verifyIfElementExistAndReport(dashboardLabel, "Verify if Dashboard Label is Visible", wait, driver, test);
		Drex.verifyIfElementExistAndReport(mostPopularTrainingsLabel, "Verify if Most Popular Trainings Label is Visible", wait, driver, test);
		Drex.click(sideMenuLeftArrow, "Side Menu Arrow Click", driver, test);
	}

	public void verifySideMenuIsNotIntrusiveAtReportsScreen() {
		Drex.click(reports, "Dashboard Side Menu Click", driver, test);
		Drex.waitForPageToLoad(wait);
		Drex.waitForElementToBeVisible(reportsLabel, wait);
		Drex.verifyIfElementExistAndReport(reportsLabel, "Verify if Reports Label is Visible", wait, driver, test);
		Drex.verifyIfElementExistAndReport(exportReportsBtn, "Verify if Export Reports Button is Visible", wait, driver, test);
		Drex.click(sideMenuRightArrow, "Side Menu Arrow Click", driver, test);
		Drex.verifyIfElementExistAndReport(reportsLabel, "Verify if Reports Label is Visible", wait, driver, test);
		Drex.verifyIfElementExistAndReport(exportReportsBtn, "Verify if Export Reports Button Label is Visible", wait, driver, test);
		Drex.click(sideMenuLeftArrow, "Side Menu Arrow Click", driver, test);
	}
	
	
	public void goToReports() {
		Drex.click(reports, "Reports", driver, test);
		
	}
	
	public void goToAudits() {
		Drex.click(audits, "Audits", driver, test);
		
	}
	
	public void goToCertificates() {
		Drex.click(certificates, "Audits", driver, test);
		
	}
	
	public void goToLatestActivity() {
		Drex.click(latestActivityTab, "Latest Activity", driver, test);
	}
	
	public void verifyActionsInLatestActivity() {
		String activityCreatedXpath = String.format("//p[text()='Created %s']",ReadDatasheet.get("InsertedText", tcId));
		String activityUpdatedXpath = String.format("//p[text()='Updated %s']",ReadDatasheet.get("InsertedText", tcId));
		String activityDeletedXpath = String.format("//p[text()='Deleted %s']",ReadDatasheet.get("InsertedText", tcId));
		Drex.verifyIfElementExistAndReport(latestActivityTab, "Latest Activity Tab", wait, driver, test);
		try {
			WebElement activityCreated = driver.findElement(By.xpath(activityCreatedXpath));
			WebElement activityUpdated = driver.findElement(By.xpath(activityUpdatedXpath));
			WebElement activityDeleted = driver.findElement(By.xpath(activityDeletedXpath));
			activityDeleted.findElement(By.xpath(activityDeletedXpath));
			Drex.verifyIfElementExistAndReport(latestActivityDeleted, "Deleted Activity", wait, driver, test);
			Drex.verifyIfElementExistAndReport(activityDeletedXpath, "Deleted Action", wait, driver, test);
			activityUpdated.findElement(By.xpath(activityUpdatedXpath));
			Drex.verifyIfElementExistAndReport(latestActivityUpdated, "Updated Activity", wait, driver, test);
			Drex.verifyIfElementExistAndReport(activityUpdatedXpath, "Updated Action", wait, driver, test);
			activityCreated.findElement(By.xpath(activityCreatedXpath));
			Drex.verifyIfElementExistAndReport(latestActivityCreated, "Created Activity", wait, driver, test);
			Drex.verifyIfElementExistAndReport(activityCreatedXpath, "Created Action", wait, driver, test);
			Drex.scrollIntoViewWithJsExec(latestActivityLogin, driver);
			Drex.verifyIfElementExistAndReport(latestActivityLoginAction, "Login", wait, driver, test);
			Drex.verifyIfElementExistAndReport(latestActivityLogin, "Login", wait, driver, test);	
		} catch (ElementNotVisibleException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void verifyLatestActivityElementsMatchDesign() {
		Drex.verifyIfElementExistAndReport(latestActivityTab, "Latest Activity Tab", wait, driver, test);
		Drex.verifyIfElementExistAndReport(headerActivity, "Activity Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(headerUser, "User", wait, driver, test);
		Drex.verifyIfElementExistAndReport(headerAction, "Action Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(headerDate, "Date", wait, driver, test);
		Drex.verifyIfElementExistAndReport(latestActivityContainer, "Latest Activity Container", wait, driver, test);
		Drex.verifyIfElementExistAndReport(latestActivityRow, "Latest Activity Row", wait, driver, test);
	}
	
	public void verifyLatestActivitiesUser() {
		Drex.click(dashboard, "Dashboard", driver, test);
		Drex.waitForPageToLoad(wait);
		Drex.click(latestActivity, "Latest Activity", driver, test);
		Drex.verifyIfElementExistAndReport("//p[contains(text(),'Created "+ReadDatasheet.get("FirstName", tcId)+"')]", "Create User", wait, driver, test);
		Drex.verifyIfElementExistAndReport("//p[contains(text(),'Updated "+ReadDatasheet.get("FirstName", tcId)+"')]", "Update User", wait, driver, test);
		Drex.verifyIfElementExistAndReport("//p[contains(text(),'Deleted "+ReadDatasheet.get("FirstName", tcId)+"')]", "Delete User", wait, driver, test);

	}

	
}

