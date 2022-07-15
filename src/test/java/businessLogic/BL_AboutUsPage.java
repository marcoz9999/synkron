package businessLogic;

import static pageObjects.PO_AboutUsPage.*;


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
public class BL_AboutUsPage extends BL_Page {
	public BL_AboutUsPage(WebDriver driver, String tcId, ExtentTest test) {
		super(driver, tcId, test);
	}

	public BL_AboutUsPage(WebDriver driver, String tcId, ExtentTest test, Map<String, String> data) {
		super(driver, tcId, test, data);
	}
	
	public void bodyComponentValidation() {
		Drex.verifyIfElementExistAndReport(aboutKinezisHeader, "About Kinezis Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(aboutKinezisBackgroundImage, "About Kinezis Background Image", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(aboutUsHeader, driver);
		Drex.verifyIfElementExistAndReport(aboutUsHeader, "About Us Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(aboutUsTextDescription, "About Us Text Description", wait, driver, test);
		Drex.verifyIfElementExistAndReport(funFactsHeader, "Fun Facts Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(funFacts1, "Fun Facts 1 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(funFacts2, "Fun Facts 2 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(funFacts3, "Fun Facts 3 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(funFacts4, "Fun Facts 4 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(funFacts5, "Fun Facts 5 Info", wait, driver, test);
		Drex.verifyIfElementExistAndReport(funFacts6, "Fun Facts 6 Info", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(ourStoryHeader, driver);
		Drex.verifyIfElementExistAndReport(ourStoryHeader, "Our Story Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourStoryTextDescription, "Our Story Description", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourStoryImage, "Our Story Image", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(ourTeamHeader, driver);
		Drex.verifyIfElementExistAndReport(ourTeamHeader, "Our Team Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourTeamInfo, "Our Team Info", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(ourValuesHeader, driver);
		Drex.verifyIfElementExistAndReport(ourValuesHeader, "Our Values Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourValuesInfoPart1, "Our Values Info Part 1", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourValuesInfoPart2, "Our Values Info Part 2", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(ourCultureHeader, driver);
		Drex.verifyIfElementExistAndReport(ourCultureHeader, "Our Values Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(ourCultureInfo, "Our Values Info", wait, driver, test);



	}
	
	public void AboutUsClickOnSliders() {
		try {
			Drex.click(innovateLeftSlider, "Innovate Left Slider Click", driver, test);
			Thread.sleep(2000);
			Drex.click(innovateRightSlider, "Innovate Right Slider Click", driver, test);
			Thread.sleep(2000);
			Drex.click(sustainabilityLeftSlider, "Sustainability Left Slider Click", driver, test);
			Thread.sleep(2000);
			Drex.click(sustainabilityRightSlider, "Sustainability Right Slider Click", driver, test);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

