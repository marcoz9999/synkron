package pageObjects;
/**
 * @author Ksquare
 *
 * @Description
 * This Class represents the objects in Kinezis Home page.
 *
 */
public class PO_AmenitiesPage {
	
	//Kinezis Homepage Body
	public static final String amenitiesHeader = "//h2[text()='AMENITIES']";
	public static final String amenitiesBackgroudnImage = "//h2[text()='AMENITIES']/ancestor::div[@class = 'elementor-container elementor-column-gap-default']";
	public static final String discoverOurAmenitiesHeader = "//h2[text()='DISCOVER OUR AMENITIES']";
	public static final String allFilterDisabled = "(//span[contains(text(),'All')])[2]";
	public static final String allFilterEnabled = "(//span[contains(text(),'All')])[1]";
	public static final String boutiqueFilterDisabled = "(//span[contains(text(),'Boutique')])[2]";
	public static final String boutiqueFilterEnabled = "(//span[contains(text(),'Boutique')])[1]";
	public static final String entertainmentDisabled = "(//span[contains(text(),'Entertainment')])[2]";
	public static final String entertainmentEnabled = "(//span[contains(text(),'Entertainment')])[1]";
	public static final String fitnessDisabled = "(//span[contains(text(),'Fitness')])[2]";
	public static final String fitnessEnabled = "(//span[contains(text(),'Fitness')])[1]";
	public static final String healthDisabled = "(//span[contains(text(),'Health')])[2]";
	public static final String healthEnabled = "(//span[contains(text(),'Health')])[1]";
	public static final String filterByDropdownMenuOption = "//button[@class = 'hover:bg-grey-100 text-primary flex w-full cursor-pointer gap-4 py-3 px-0 lg:px-4']//span";
	public static final String filterByDropdownMenuClick = "//div[@class = 'absolute top-0 left-0 h-full w-full items-center text-left justify-between px-4 py-3 lg:flex']";

	public static final String amenitiesCard = "//div[@class = 'post flex min-h-[509px] flex-col rounded-xl']";
	public static final String amenitiesCardImage = "//div[@class = 'relative z-10 block h-[404px] overflow-hidden']";
	public static final String amenitiesCardSubCategory = "//span[@class = 'headline-overline uppercase']";
	public static final String amenitiesCardHeader = "//span[@class = 'headline-5']";
	public static final String amenitiesCardCategory = "//span[@class = 'caption text-primary bg-grey-100 flex items-center justify-center py-[6px] px-3']";
	public static final String amenitiesCardSchedule = "//span[@class = 'leading-none']";
	public static final String amenitiesCardInfo = "//div[@class = 'class-data mt-auto flex justify-end']/preceding::div[1]";
	public static final String amenitiesCardButton = "//div[@class = 'flex items-center']";
	
	//Kinezis Nutrition Slider
    public static final String amenitiesCardLeftSlider = "//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 left-4 z-50']";
	public static final String amenitiesCardRightSlider = "//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 right-4 z-50']";

		
	
	
	
}
