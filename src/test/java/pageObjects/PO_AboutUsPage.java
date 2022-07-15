package pageObjects;
/**
 * @author Ksquare
 *
 * @Description
 * This Class represents the objects in Kinezis Home page.
 *
 */
public class PO_AboutUsPage {
		//Kinezis About US Body
	public static final String aboutKinezisHeader = "//h2[text()='ABOUT KINEZIS']";
	public static final String aboutKinezisBackgroundImage = "//h2[text()='ABOUT KINEZIS']/preceding::div[1]";
	public static final String aboutUsHeader = "//h2[text()='ABOUT US']";
	public static final String aboutUsTextDescription = "//h2[text()='ABOUT US']/following::div[1]";
	public static final String funFactsHeader = "//h2[text()='FUN FACTS']";
	public static final String funFacts1 = "//div[contains(text(),'Calories burnt')]/parent::div[1]";
	public static final String funFacts2 = "//div[contains(text(),'Active users through all Kinezis')]/parent::div[1]";
	public static final String funFacts3 = "//div[contains(text(),'Presenence in other countries')]/parent::div[1]";//Error Ortografico
	public static final String funFacts4 = "//div[contains(text(),'Km traveled')]/parent::div[1]";
	public static final String funFacts5 = "(//div[contains(text(),'Different activities in kinezis')]/parent::div[1])[1]";
	public static final String funFacts6 = "(//div[contains(text(),'Different activities in kinezis')]/parent::div[1])[2]";
	public static final String ourStoryHeader = "//h2[text()='OUR STORY']";
	public static final String ourStoryTextDescription = "//h2[text()='OUR STORY']/following::div[1]";
	public static final String ourStoryImage = "//div[@class = 'elementor-widget-container']//img[@width='588' and @height='414']";
	public static final String ourTeamHeader = "//h2[text()='OUR TEAM']";
	public static final String ourTeamInfo = "//h2[text()='OUR TEAM']/following::div[1]";
	public static final String ourValuesHeader = "//h2[text()='OUR VALUES']";
	public static final String ourValuesInfoPart1 = "//h2[text()='OUR VALUES']/following::div[1]";
	public static final String ourValuesInfoPart2 = "//h2[text()='OUR VALUES']/following::div[1]/following::div[1]";
	public static final String ourCultureHeader = "//h2[text()='OUR CULTURE']";
	public static final String ourCultureInfo = "//h2[text()='OUR CULTURE']/following::div[1]";
	
	  //Kinezis About Us Slider
	public static final String innovateLeftSlider = "(//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 left-4 z-50'])[2]";
	public static final String innovateRightSlider = "(//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 right-4 z-50'])[2]";
	public static final String sustainabilityLeftSlider = "(//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 left-4 z-50'])[3]";
	public static final String sustainabilityRightSlider = "(//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 right-4 z-50'])[3]";
	
}
