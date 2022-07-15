package businessLogic;

import static pageObjects.PO_NanoPage.*;


import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import testUtilities.Drex;

/**
 * @author Ksquare
 *
 * @Description This Class represents the actions that can be performed in
 *              Kinezis Home page.
 *
 */
public class BL_NanoPage extends BL_Page {
	public BL_NanoPage(WebDriver driver, String tcId, ExtentTest test) {
		super(driver, tcId, test);
	}

	public BL_NanoPage(WebDriver driver, String tcId, ExtentTest test, Map<String, String> data) {
		super(driver, tcId, test, data);
	}
	
	public void bodyComponentValidation() {
		Drex.verifyIfElementExistAndReport(nanoModalityHeader, "Nano Modality Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(getNanokinezisButton, "Get Nano Kinezis Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoKinezisBackgroundImage, "Nano Kinezis Background Image", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(whatIsNanoKinezisHeader, driver);
		Drex.verifyIfElementExistAndReport(whatIsNanoKinezisHeader, "What is Nano Kinezis Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(whatIsNanoKinezisInfo, "What is Nano Kinezis Text Description", wait, driver, test);
		Drex.verifyIfElementExistAndReport(discoverNanoAmenitiesButton, "Discover Nano Amenities Button ", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoFAQButton, "Nano FAQ Button", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(conditionsHeader, driver);
		Drex.verifyIfElementExistAndReport(conditionsHeader, "Conditions Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(yearRangeCondition, "1 to 5 Year Old Condition", wait, driver, test);
		Drex.verifyIfElementExistAndReport(priceCondition, "$ 250 per hour Contidion", wait, driver, test);
		Drex.verifyIfElementExistAndReport(numberOfChildrenCondition, "Maximum 4 childs per adult Condition", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(ourCareHeader, driver);
		Drex.verifyIfElementExistAndReport(ourCareHeader, "Our Care Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourCareInfo, "Our Care Info", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(howToGetNanoKinezis, driver);
		Drex.verifyIfElementExistAndReport(howToGetNanoKinezis, "How To Get To Nano Kinezis Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoKinezisWithWellnessHeader, "Nano Kinezis Wellness Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoKinezisWithWellnessInfo, "Nano Kinezis Wellness Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(exploreWellnessButton, "Explore Wellness Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoKinezisWithWellnessImage, "Nano Kinezis Wellness Image", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(nanoKinezisWithNutritionHeader, driver);
		Drex.verifyIfElementExistAndReport(nanoKinezisWithNutritionHeader, "Nano Kinezis Nutrition Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoKinezisWithNutritionInfo, "Nano Kinezis Nutrition Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(exploreNutritionButton, "Explore Wellness Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoKinezisWithNutritionImage, "Nano Kinezis Nutrition Image", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoKinezisWithEntertainmentHeader, "Nano Kinezis Entertainment Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoKinezisWithEntertainmentInfo, "Nano Kinezis Entertainment Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(exploreEntertainment, "Explore Entertainment Button", wait, driver, test);
		Drex.verifyIfElementExistAndReport(nanoKinezisWithEntertainmentImage, "Nano Kinezis Entertainment Image", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(whatsIncludedAndWhatNotHeader, driver);
		Drex.verifyIfElementExistAndReport(whatsIncludedAndWhatNotHeader, "What's Included And What's Not Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(whatsIncludedAndWhatNotInfo, "What's Included And What's Info", wait, driver, test);

	}

}

