package pageObjects;
/**
 * @author Ksquare
 *
 * @Description
 * This Class represents the objects in Kinezis Home page.
 *
 */
public class PO_NutritionPage {
	
	//Kinezis Homepage Body
	public static final String nutritionProgramHeader = "//h1[text()='NUTRITION PROGRAM']";
	public static final String nutritionProgramInfo = "//h2[text()='Your key to a wellness life starts here!']";
	public static final String nutritionProgramBackgroundImage = "//h1[text()='NUTRITION PROGRAM']//preceding::div[1]//preceding::div[1]";
	public static final String bookYourAppointmentButton = "//span[contains(text(),'Book Your Appointment ')]";
	public static final String startYourNutritionFollowUpHeader = "//h2[text()= 'START NOW YOUR NUTRITION FOLLOW UP']";
	public static final String servicesButtonDisabled = "(//div[text()='Services'])[1]";
	public static final String servicesButtonEnabled = "(//div[text()='Services'])[2]";
	public static final String amenitiesButtonDisabled = "(//div[text()='Amenities'])[1]";
	public static final String amenitiesButtonEnabled = "(//div[text()='Amenities'])[2]";
	public static final String conditionsButtonDisabled = "(//div[text()='Conditions'])[1]";
	public static final String conditionsButtonEnabled = "(//div[text()='Conditions'])[2]";
	public static final String nutritionSearchField = "//div[@class = 'filters']/child::div[1]/child::div[1]";
	public static final String nutritionFilterField = "//div[contains(@class , 'md-input-select h-full w-full')]";
	public static final String nutritionFilterWeightControlOption = "//span[contains(text(),'Weight Control')]";
	public static final String nutritionCardsInfo = "//div[contains(@class , 'md-input-select h-full w-full')]/following::div[1]";
	public static final String exploreMoreAboutBoxingLessonsCard = "//a[contains(text(),'Explore More of Boxing Lessons')]/preceding::div[1]/parent::div[1]/parent::div[1]";
	public static final String exploreMoreAboutBoxingCard = "//a[contains(text(),'Explore More of Boxing')]/preceding::div[1]/parent::div[1]/parent::div[1]";
	public static final String beforeYouVisitUsHeader = "//h2[text()='Before You Visit Us']";
	public static final String beforeYouVisitUsInfo = "//h2[text()='Before You Visit Us']//following::div[1]";
	public static final String beforeYouVisitUsInfoPart1 = "//h2[text()='Before You Visit Us']/following::div[1]/following::div[1]/following::div[1]";
	public static final String beforeYouVisitUsInfoPart2 = "//h2[text()='Before You Visit Us']/following::div[1]/following::div[1]/following::div[1]/following::div[1]";
	public static final String meetOurExpertsHeader = "//h2[text()='MEET OUR EXPERTS']";
	public static final String meetOurExpertsInfo = "//h2[text()='MEET OUR EXPERTS']/following::div[1]";
	public static final String nutritionThroughAllKinezisHeader = "//h2[text()='NUTRITION THROUGH ALL KINEZIS']";
	public static final String exploreOtherclassesHeader = "//h2[text()='EXPLORE OTHER CLASSES']";
	public static final String nutrititonPlusFitness = "//h3[contains(text() , 'Nutrition + Fitness')]/parent::div[1]";
	public static final String nutrititonPlusEntertainment = "//h3[contains(text() , 'Nutrition + Entertainment')]/parent::div[1]";
	public static final String nutrititonPlusWellness = "//h3[contains(text() , 'Nutrition + Wellness')]/parent::div[1]";
	public static final String entertainmentCard = "(//div[@class='elementor-widget-container']//div[@class='elementor-widget-wrap elementor-element-populated'])[2]";
	public static final String wellnessCard = "(//div[@class='elementor-widget-container']//div[@class='elementor-widget-wrap elementor-element-populated'])[3]";
	public static final String moviePlayerFrame = "//div[@id='player']";	
	public static final String buildDesiredBodyHeader = "//h3[contains(text() , 'Build the body that you want with Fitness and Nutrition at Kinezis')]";
	public static final String buildDesiredBodyInfo = "(//div[@class = 'mb-10'])[4]";
	public static final String knowMoreAboutFitnessButton = "(//a[contains(text(),'Know more about Fitness')])[4]";
	public static final String foodAndBeveragesImage = "//h2[text()='Food and Beverages']/preceding::div[1]";
	public static final String foodAndBeveragesHeader = "//h2[text()='Food and Beverages']";
	public static final String foodAndBeveragesInfo = "//p[contains(text(),'Take a tour of our stores to enjoy the food and beverages we have for you, and charge your energy.')]";
	public static final String nanoImage = "//h2[text()='Nano']/preceding::div[1]";
	public static final String nanoHeader = "//h2[text()='Nano']";
	public static final String nanoInfo = "//p[contains(text(),'Your children are in good hands while you train! Go to the NANO section and check out the childcare service.')]";
	public static final String merchandiseImage = "//h2[text()='Merchandise']/preceding::div[1]";
	public static final String merchandiseHeader = "//h2[text()='Merchandise']";
	public static final String merchandiseInfo = "//p[contains(text(),'Make your workouts with the best products!')]";

	//Kinezis Nutrition Slider
    public static final String boxingLessonsLeftSlider = "(//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 left-4 z-50'])[1]";
	public static final String boxingLessonsRightSlider = "(//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 right-4 z-50'])[1]";
	public static final String boxingLeftSlider = "(//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 left-4 z-50'])[2]";
	public static final String boxingRightSlider = "(//div[@class = 'items-center lg:flex flex absolute top-1/2 -mt-5 right-4 z-50'])[2]";
		
	
	
	
}
