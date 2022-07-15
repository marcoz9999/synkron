package businessLogic;

import static pageObjects.PO_PartnertsPage.*;


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
public class BL_PartnersPage extends BL_Page {
	public BL_PartnersPage(WebDriver driver, String tcId, ExtentTest test) {
		super(driver, tcId, test);
	}

	public BL_PartnersPage(WebDriver driver, String tcId, ExtentTest test, Map<String, String> data) {
		super(driver, tcId, test, data);
	}
	
	public void bodyComponentValidation() {
		Drex.verifyIfElementExistAndReport(inPartnersHeader, "In Partners We Trust Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(inPartnersBackgroundImage, "In Partners We Trust Background Image", wait, driver, test);
		Drex.verifyIfElementExistAndReport(becomeAPartnerButton1, "Become a Partner Button 1 ", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(onTheShouldersOfGiantsHeader, driver);
		Drex.verifyIfElementExistAndReport(onTheShouldersOfGiantsHeader, "On The Shoulder Of Giants Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(onTheShoulderOfGiantsInfo, "On The Shoulder of Giants Text Description", wait, driver, test);
		Drex.verifyIfElementExistAndReport(becomeAPartnerButton2, "Become a Partner Button 2 ", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(specialThanksHeader, driver);
		Drex.verifyIfElementExistAndReport(specialThanksHeader, "Special Thanks Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(specialThanksInfoPart1, "Special Thanks Info Part 1", wait, driver, test);
		Drex.verifyIfElementExistAndReport(specialThanksInfoPart2, "Special Thanks Info Part 2", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(kinezisPartnerBenefitHeader, driver);
		Drex.verifyIfElementExistAndReport(kinezisPartnerBenefitHeader, "Kinezis Partner Benefit Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(kinezisPartnerBenefitInfoPart1, "Kinezis Partner Benefit Info Part 1", wait, driver, test);
		Drex.verifyIfElementExistAndReport(kinezisPartnerBenefitInfoPart2, "Kinezis Partner Benefit Info Part 2", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(wantToKnowMoreHeader, driver);
		Drex.verifyIfElementExistAndReport(wantToKnowMoreHeader, "Want To Know More Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(contactUsHeader, "Contact Us Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(contactUsInfo, "Contact Us Info", wait, driver, test);

	}

}

