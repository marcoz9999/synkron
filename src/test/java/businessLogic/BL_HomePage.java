package businessLogic;

import static pageObjects.PO_HomePage.*;


import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import testUtilities.Drex;
import testUtilities.ReadDatasheet;

/**
 * @author Ksquare
 *
 * @Description This Class represents the actions that can be performed in
 *              Kinezis Home page.
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
	}

	public void goToDiscover() {
		Drex.waitForPageToLoad(wait);
		Drex.click(discoverHeaderMenu, "Discover", driver, test);
		
	}
	public void goToAboutUs() {
		Drex.waitForPageToLoad(wait);
		Drex.click(aboutUsLink, "About Us Link Click", driver, test);
		
	}
	
	public void goToPartners() {
		Drex.waitForPageToLoad(wait);
		Drex.click(partnersLink, "Partners Link Click", driver, test);
		
	}

	public void goToNano() {
		Drex.waitForPageToLoad(wait);
		Drex.click(nanoLink, "Nano Link Click", driver, test);
		
	}
	
	public void goToCorporateAndSocialResponsability() {
		Drex.waitForPageToLoad(wait);
		Drex.click(corporateSocialResponsibilityLink, "Corporate and Social Responsability Link Click", driver, test);
		
	}
	
	public void goToNutrition() {
		Drex.waitForPageToLoad(wait);
		Drex.click(nutritionLink, "Nutrition Link Click", driver, test);
		
	}
	
	public void goToAmenities() {
		Drex.waitForPageToLoad(wait);
		Drex.click(amenitiesLink, "Amenities Link Click", driver, test);
		
	}
	
	public void goToThingsToDo() {
		Drex.waitForPageToLoad(wait);
		Drex.click(thingsToDoHeaderMenu, "Things To Do", driver, test);
	}

	public void goToPassesAndCombos() {
		Drex.waitForPageToLoad(wait);
		Drex.click(passesAndCombosHeaderMenu, "Passes and Combos", driver, test);

	}

	public void goToGroups() {
		Drex.waitForPageToLoad(wait);
		Drex.click(groupsHeaderMenu, "Groups", driver, test);

	}

	public void goToPlanYourVisit()
	{
		Drex.waitForPageToLoad(wait);
		Drex.click(planYourVisitHeaderMenu, "Plan Your Visit", driver, test);
	}

	public void goToLogin() {
		Drex.click(loginButton, "Groups", driver, test);
	}
	
	public void headerComponentsValidation() {
		Drex.verifyIfElementExistAndReport(kinezisLogoHeader, "Kinezis Logo", wait, driver, test);
		Drex.verifyIfElementExistAndReport(discoverHeaderMenu, "Discover Header Menu", wait, driver, test);
		Drex.click(discoverHeaderMenu, "Discover Menu Click", driver, test);
		Drex.verifyIfElementExistAndReport(aboutUsLink, "About Us Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(merchandiseLink, "Merchandise Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(photoPassLink, "Photo Pass Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(partnersLink, "Partner Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoLink, "Nano Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(corporateSocialResponsibilityLink, "Corporate Social Responsability Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(amenitiesLink, "Amenities Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nutritionLink, "Nutrition Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(latestNewsLink, "Latest News Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(thingsToDoHeaderMenu, "Things To Do Header Menu", wait, driver, test);
		Drex.click(thingsToDoHeaderMenu, "Things To Do Click", driver, test);
		Drex.verifyIfElementExistAndReport(fitnessLink, "Fitness Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(entertainmentLink, "Entertainment Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(spaLink, "Spa Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(howDoesItWork, "How Does It Work? Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(passesAndCombosHeaderMenu, "Passes and Combos Header Menu", wait, driver, test);
		Drex.click(passesAndCombosHeaderMenu, "Passes and Combos Click", driver, test);
		Drex.verifyIfElementExistAndReport(howDoesItWork, "How Does It Work? Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(passesLink, "Passes Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(combosLink, "Groups Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(groupsHeaderMenu, "Groups Header Menu", wait, driver, test);
		Drex.click(groupsHeaderMenu, "Groups Click", driver, test);
		Drex.verifyIfElementExistAndReport(groupExperiencesLink, "Groups Experience Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(groupsPassesLink, "Groups Passes Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(planYourVisitHeaderMenu, "Plan Your Visit Header Menu", wait, driver, test);
		Drex.click(planYourVisitHeaderMenu, "Plan Your Visit Click", driver, test);
		Drex.verifyIfElementExistAndReport(calendarAndTimingsLink, "Calendar And Timings Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(howToGetToKinezisLink, "How To Get To Kinezis Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(frequentlyAskedQuestionsLink, "Frequently Asked Questions Link", wait, driver, test);
		Drex.verifyIfElementExistAndReport(safetyAndSecurityMeassuresLink, "Safety And Security Meassures Link", wait, driver, test);
		
		
	}
	
	public void bodyComponentValidaiton() {
		Drex.verifyIfElementExistAndReport(backgroundVideo, "Background Video", wait, driver, test);
		Drex.verifyIfElementExistAndReport(welcomeToKinezisHeader, "Welcome To Kinezis Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(welcomeTextDescription, "Welcome Text Description", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(aboutUsButton, driver);
		Drex.verifyIfElementExistAndReport(aboutUsButton, "About Us Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(discoverOurActivitiesHeader, "Discover Our Activites Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(fitnessDescription, "Fitness Description Text", wait, driver, test);
		Drex.verifyIfElementExistAndReport(learnAboutFitnessButton, "Learn About Fitness Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(entertainmentDescription, "Entertainment Description Text", wait, driver, test);
		Drex.verifyIfElementExistAndReport(learnAboutEntertainmentButton, "Learn About Entertainment Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(wellnessDescription, "Wellness Description Text", wait, driver, test);
		Drex.verifyIfElementExistAndReport(learnAboutWellnessButton, "Learn About Wellness Button", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(passesButtonActive, driver);
		Drex.verifyIfElementExistAndReport(passesButtonActive, "Passes Button", wait, driver, test);
		//Drex.verifyIfElementExistAndReport(combosButton, "Combos Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(fitnessCard, "Fitness Card", wait, driver, test);
		Drex.verifyIfElementExistAndReport(entertainmentCard, "Entertainment Card", wait, driver, test);
		Drex.verifyIfElementExistAndReport(wellnessCard, "Wellness Card", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(aeroKinezisButton, driver);
		Drex.verifyIfElementExistAndReport(aeroKinezisButton, "Aero Kinezis Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(geoKinezisButton, "Geo Kinezis Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(hidroKinezisButton, "Hidro Kinezis Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(piroKinezisButton, "Piro Kinezis Button", wait, driver, test);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='//www.youtube.com/embed/4-zjQvTDnbw'])[4]")));
		Drex.verifyIfElementExistAndReport(moviePlayerFrame, "Movie Player Frame", wait, driver, test);
		driver.switchTo().defaultContent() ;
		Drex.verifyIfElementExistAndReport(latestNewsButtonActive, "Latest News Button", wait, driver, test);
		//Drex.verifyIfElementExistAndReport(storiesAtKinezisButton, "Stories at Kinezis Button", wait, driver, test);
		//Drex.verifyIfElementExistAndReport(thingsToDoButton, "Things to Do Button", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(getItOnPlayStoreButton, driver);
		Drex.verifyIfElementExistAndReport(getItOnPlayStoreButton, "Play Store Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(downloadOnTheAppStoreButton, "App Store Button", wait, driver, test);

	}
	
	public void goToBackgroundVideo() {
		Drex.verifyIfElementExistAndReport(backgroundVideo, "Background Video", wait, driver, test);
		
	}
	public void goToSettings() {
		Drex.waitForPageToLoad(wait);
		Drex.click(profileIcon, "Profile Icon", driver, test);
		Drex.click(settings, "Settings", driver, test);
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

