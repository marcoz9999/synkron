package testScripts;

import businessLogic.BL_HomePage;
import businessLogic.BL_AboutUsPage;
import businessLogic.BL_PartnersPage;
import businessLogic.BL_CorporateAndSocialResponsabilityPage;
import businessLogic.BL_NutritionPage;
import businessLogic.BL_NanoPage;
import businessLogic.BL_AmenitiesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testUtilities.ReadDatasheet;

public class LoginTest extends TestScript implements ReadDatasheet {

	BL_HomePage homePage;
	BL_AboutUsPage aboutUsPage;
	BL_PartnersPage partnersPage;
	BL_NanoPage nanoPage;
	BL_CorporateAndSocialResponsabilityPage corporateAndSocialResponsabilityPage;
	BL_NutritionPage nutritionPage;
	BL_AmenitiesPage amenitiesPage;

	@Override
	public void initializePageObjects(){
		//Initialize Page Objects
		homePage = new BL_HomePage(driver, tcId, test);
		aboutUsPage = new BL_AboutUsPage(driver, tcId, test);
		partnersPage = new BL_PartnersPage (driver, tcId, test);
	    nanoPage = new BL_NanoPage (driver, tcId, test);
	    corporateAndSocialResponsabilityPage = new BL_CorporateAndSocialResponsabilityPage (driver, tcId, test);
	    nutritionPage = new BL_NutritionPage (driver, tcId, test);
	    amenitiesPage = new BL_AmenitiesPage (driver, tcId, test);
	}
	
	@BeforeMethod
	public void beforeTest(){
	}
	
	
    @Test
	public void test(){
		// Test Steps
		try{
			//homePage.headerComponentsValidation();
			//homePage.bodyComponentValidation();
			homePage.goToDiscover();
			//homePage.goToPartners();
			//homePage.goToAboutUs();
			//homePage.goToNano();
			//homePage.goToCorporateAndSocialResponsabilityPage();
			//homePage.goToNutrition();
			homePage.goToAmenities();
			//aboutUsPage.bodyComponentValidation();
			//aboutUsPage.AboutUsClickOnSliders();
			//nanoPage.bodyComponentValidation();
			//corporateAndSocialResponsability.bodyComponentValidation();
			//nutritionPage.bodyComponentValidaiton();
			amenitiesPage.bodyComponentValidaiton();
			
		}catch (Exception e){

		}
	}

}
