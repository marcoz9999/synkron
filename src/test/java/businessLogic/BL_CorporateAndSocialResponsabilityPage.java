package businessLogic;

import static pageObjects.PO_CorportateAndSocialResposabilityPage.*;


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
public class BL_CorporateAndSocialResponsabilityPage extends BL_Page {
	public BL_CorporateAndSocialResponsabilityPage(WebDriver driver, String tcId, ExtentTest test) {
		super(driver, tcId, test);
	}

	public BL_CorporateAndSocialResponsabilityPage(WebDriver driver, String tcId, ExtentTest test, Map<String, String> data) {
		super(driver, tcId, test, data);
	}
	
	public void bodyComponentValidation() {
		Drex.verifyIfElementExistAndReport(corporateAndSocialResponsabilityHeader, "Corportate And Social Responsability Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(corporateAndSocialResponsabilityBackgroundImage, "Get Nano Kinezis Button", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(worldNeedsHeroesHeader, driver);
		Drex.verifyIfElementExistAndReport(worldNeedsHeroesHeader, "World Needs Heroes Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(worldNeedsHeroesInfo, "World Needs Heroes Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourCommitmentForTheFutureHeader, "Our Commitment For The Future Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourCommitmentForTheFutureInfo, "Our Commitment For The Future Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourCommitmentForTheFutureImage, "Our Commitment For The Future Image", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(ourPrioritiesHeader, driver);
		Drex.verifyIfElementExistAndReport(ourPrioritiesHeader, "Our Priorities Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourPrioritiesInfo, "Our Priorities Info", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(impactThroughTheYearsHeader, driver);
		Drex.verifyIfElementExistAndReport(impactThroughTheYearsHeader, "Impact Throught The Years Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(mpactThroughTheYearsInfo, "Impact Throught The Years Info", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(socialResponsabilityHighlightsHeader, driver);
		Drex.verifyIfElementExistAndReport(socialResponsabilityHighlightsHeader, "Social Responsability Highlight Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(socialResponsabilityHighlights1, "Social Responsability Highlight 1 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(socialResponsabilityHighlights2, "Social Responsability Highlight 2 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(socialResponsabilityHighlights3, "Social Responsability Highlight 3 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(socialResponsabilityHighlights4, "Social Responsability Highlight 4 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(socialResponsabilityHighlights5, "Social Responsability Highlight 5 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(socialResponsabilityHighlights6, "Social Responsability Highlight 6 Info", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(ourSustainabilityValuesHeader, driver);
		Drex.verifyIfElementExistAndReport(ourSustainabilityValuesHeader, "Our Sustainability Values Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourSustainabilityValuesInfoPart1, "Our Sustainability Values Info Part 1", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourSustainabilityValuesInfoPart2, "Our Sustainability Values Info Part 2", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(awardsAndRecognitionHeader, driver);
		Drex.verifyIfElementExistAndReport(awardsAndRecognitionHeader, "Awards And Recognition Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(awardsAndRecognitionPart1, "Awards And Recognition Info Part 1", wait, driver, test);
		Drex.verifyIfElementExistAndReport(awardsAndRecognitionPart2, "Awards And Recognition Info Part 2", wait, driver, test);

	}

}

