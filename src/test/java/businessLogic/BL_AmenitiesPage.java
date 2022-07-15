package businessLogic;

import static pageObjects.PO_AboutUsPage.innovateLeftSlider;
import static pageObjects.PO_AboutUsPage.innovateRightSlider;
import static pageObjects.PO_AboutUsPage.sustainabilityLeftSlider;
import static pageObjects.PO_AboutUsPage.sustainabilityRightSlider;
import static pageObjects.PO_AmenitiesPage.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
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
public class BL_AmenitiesPage extends BL_Page {
	public BL_AmenitiesPage(WebDriver driver, String tcId, ExtentTest test) {
		super(driver, tcId, test);
	}

	public BL_AmenitiesPage(WebDriver driver, String tcId, ExtentTest test, Map<String, String> data) {
		super(driver, tcId, test, data);
	}

	
	
	public void bodyComponentValidaiton() {
		Drex.verifyIfElementExistAndReport(amenitiesHeader, "Amenities Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(amenitiesBackgroudnImage, "Amenities Backgroudn Image Info", wait, driver, test);
		Drex.scrollIntoViewWithJsExec(discoverOurAmenitiesHeader, driver);
		Drex.verifyIfElementExistAndReport(discoverOurAmenitiesHeader, "Discover Our Amenities Header", wait, driver, test);
		Drex.verifyIfElementExistAndReport(allFilterEnabled, "All Filter Click", wait, driver, test);
		List<WebElement> dropdownElements = driver.findElements(By.xpath("//button[@class = 'hover:bg-grey-100 text-primary flex w-full cursor-pointer gap-4 py-3 px-0 lg:px-4']"));
		for (int d = 0; d < dropdownElements.size(); d++) {
	    	WebElement droddownElement = dropdownElements.get(d);
			int elementNumber = d + 1;
			System.out.println("Element Number " + elementNumber );
			Drex.click(filterByDropdownMenuClick, "Filter By Dropdown Menu Click", driver, test);
			Drex.click("(" + filterByDropdownMenuOption + ")["+ elementNumber + "]", "Filter By Dropdown " + droddownElement.getText() + " Option Click", driver, test);
			Drex.verifyIfElementExistAndReport(filterByDropdownMenuClick, "Filter By Dropdown " + droddownElement.getText() + " Option Choose", wait, driver, test);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//Drex.scrollIntoViewWithJsExec(startYourNutritionFollowUpHeader, driver);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class = 'post flex min-h-[509px] flex-col rounded-xl']"));
	    //List<String> previousList= new ArrayList<>();
	    for (int i = 0; i < elements.size(); i++) {
	    	WebElement element = elements.get(i);
	    	int elementNumber = i + 1;
	    	System.out.println("Element Number " + elementNumber );
	    	System.out.println("Info Text is " + element.getText() );
			Drex.scrollIntoViewWithJsExec("("+ amenitiesCard + ")[" + elementNumber + "]", driver);
			Drex.verifyIfElementExistAndReport("("+ amenitiesCardImage + ")[" + elementNumber + "]", "Amenities Card Image", wait, driver, test);
			Drex.verifyIfElementExistAndReport("("+ amenitiesCardSubCategory + ")["+ elementNumber + "]", "Amenities Card Sub Category", wait, driver, test);
			Drex.verifyIfElementExistAndReport("("+ amenitiesCardHeader + ")["+ elementNumber + "]", "Amenities Card Header", wait, driver, test);
			Drex.verifyIfElementExistAndReport("("+ amenitiesCardCategory + ")["+ elementNumber + "]", "Amenities Card Category", wait, driver, test);
			Drex.verifyIfElementExistAndReport("("+ amenitiesCardSchedule + ")["+ elementNumber + "]", "Amenities Card Schedule", wait, driver, test);
			Drex.verifyIfElementExistAndReport("("+ amenitiesCardInfo + ")["+ elementNumber + "]", "Amenities Card Info", wait, driver, test);
			Drex.verifyIfElementExistAndReport("("+ amenitiesCardButton + ")["+ elementNumber + "]", "Amenities Card Button", wait, driver, test);
			try {
				Drex.click("(" + amenitiesCardLeftSlider + ")["+ elementNumber + "]", "Amenities Card Left Slider Click", driver, test);
				Thread.sleep(1000);
				Drex.click("(" + amenitiesCardRightSlider + ")["+ elementNumber + "]", "Amenities Card Right Slider Click", driver, test);
				Thread.sleep(1000);		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Drex.verifyIfElementExistAndReport("("+ amenitiesCard + ")[ "+ elementNumber +"]", "Amenities Card", wait, driver, test);

	    }

	
	}
}

