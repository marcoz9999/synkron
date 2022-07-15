package businessLogic;

import static pageObjects.PO_AboutUsPage.innovateLeftSlider;
import static pageObjects.PO_AboutUsPage.innovateRightSlider;
import static pageObjects.PO_AboutUsPage.sustainabilityLeftSlider;
import static pageObjects.PO_AboutUsPage.sustainabilityRightSlider;
import static pageObjects.PO_NutritionPage.*;


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
public class BL_NutritionPage extends BL_Page {
	public BL_NutritionPage(WebDriver driver, String tcId, ExtentTest test) {
		super(driver, tcId, test);
	}

	public BL_NutritionPage(WebDriver driver, String tcId, ExtentTest test, Map<String, String> data) {
		super(driver, tcId, test, data);
	}

	
	
	public void bodyComponentValidaiton() {
		Drex.verifyIfElementExistAndReport(nutritionProgramHeader, "Nutrition Progam Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nutritionProgramInfo, "Nutrition Program Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nutritionProgramBackgroundImage, "Nutrition Program Background Image", wait, driver, test);
		Drex.verifyIfElementExistAndReport(bookYourAppointmentButton, "Book Your Appointment Button", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(startYourNutritionFollowUpHeader, driver);
		Drex.verifyIfElementExistAndReport(startYourNutritionFollowUpHeader, "Start Your Nutrition Follow Up Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(servicesButtonEnabled, "Services Button Enabled", wait, driver, test);
		Drex.verifyIfElementExistAndReport(amenitiesButtonDisabled, "Amenities Button Disabled", wait, driver, test);
		Drex.verifyIfElementExistAndReport(conditionsButtonDisabled, "Conditions Button Disabled", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nutritionSearchField, "Nutrition Search Field", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nutritionFilterField, "Nutrition Filter Field", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nutritionCardsInfo, "Nutriton Card Info", wait, driver, test);
		Drex.click(amenitiesButtonDisabled, "Amenities Button Click", driver, test);
		Drex.verifyIfElementExistAndReport(exploreMoreAboutBoxingLessonsCard, "Explore More About Boxing Lessons Card", wait, driver, test);
		Drex.verifyIfElementExistAndReport(exploreMoreAboutBoxingCard, "Explore More about Boxing Card", wait, driver, test);
		try {
			Drex.click(boxingLessonsLeftSlider, "Explore More About Boxing Lessons Left Slider Click", driver, test);
			Thread.sleep(2000);
			Drex.click(boxingLessonsRightSlider, "Explore More About Boxing Lessons Right Slider Click", driver, test);
			Thread.sleep(2000);
			Drex.click(boxingLeftSlider, "Explore More About Boxing Left Slider Click", driver, test);
			Thread.sleep(2000);
			Drex.click(boxingRightSlider, "Explore More About Boxing Right Slider Click", driver, test);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Drex.click(conditionsButtonDisabled, "Conditions Button Click", driver, test);
		Drex.verifyIfElementExistAndReport(beforeYouVisitUsInfo, "Before You Visit Us Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(beforeYouVisitUsInfoPart1, "Before You Visit Us Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(beforeYouVisitUsInfoPart2, "Before You Visit Us Info", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(meetOurExpertsHeader, driver);
		Drex.verifyIfElementExistAndReport(meetOurExpertsHeader, "Meet With Our Experts Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(meetOurExpertsInfo, "Meet With Our Experts Info", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(nutritionThroughAllKinezisHeader, driver);
		Drex.verifyIfElementExistAndReport(nutritionThroughAllKinezisHeader, "Nutrition Throught All Kinezis Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(exploreOtherclassesHeader, "Explore Other Classes Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nutrititonPlusFitness, "Nutrition + Fitness Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nutrititonPlusEntertainment, "Nutrition + Entertainment Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nutrititonPlusWellness, "Nutrition + Wellness Button", wait, driver, test);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='//www.youtube.com/embed/4-zjQvTDnbw'])[4]")));
		Drex.scrollIntoViewWithJsExec(moviePlayerFrame, driver);
		Drex.verifyIfElementExistAndReport(moviePlayerFrame, "Movie Player Frame", wait, driver, test);
		driver.switchTo().defaultContent() ;
		Drex.verifyIfElementExistAndReport(buildDesiredBodyHeader, "Build Desired Body Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(buildDesiredBodyInfo, "Build Desired Body Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(knowMoreAboutFitnessButton, "Know More About Fitness Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(foodAndBeveragesImage, "Food And Beverage Image", wait, driver, test);
		Drex.verifyIfElementExistAndReport(foodAndBeveragesHeader, "Food And Beverage Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(foodAndBeveragesInfo, "Food And Beverage Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoImage, "Nano Image", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoHeader, "Nano Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoInfo, "Nano Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(merchandiseImage, "Merchandise Image", wait, driver, test);
		Drex.verifyIfElementExistAndReport(merchandiseHeader, "Merchandise Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(merchandiseInfo, "Merchandise Info", wait, driver, test);

	}
	
	

}

