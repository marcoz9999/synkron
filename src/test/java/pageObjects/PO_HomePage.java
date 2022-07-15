package pageObjects;
/**
 * @author Ksquare
 *
 * @Description
 * This Class represents the objects in Kinezis Home page.
 *
 */
public class PO_HomePage {
	//Dashboard Main Page
	public static final String dashboardLabel = "//h1[contains(text(),'Dashboard')]";
	public static final String mostPopularTrainingsLabel = "//div//p[contains(text(),'Most Popular Trainings')]";
	public static final String reportsLabel = "//h3[contains(text(),'Reports')]";
	public static final String exportReportsBtn = "//div//p[text()='Export' and text()='Reports']";

	//Top bar elements
	public static final String profileIcon = "//img[contains(@alt, 'Profile') and contains (@alt, 'icon')]";
	public static final String profileExpandIcon = "//*[@class='sc-fzqOul crzFAI js-expandMoreIcon']";

	//Navigation bar elements
	public static final String dashboard = "//*[@aria-label='/dashboard']/div";
	public static final String courses = "//*[@aria-label='/courses']/div";
	public static final String learningPlans = "//*[@aria-label='/learning-plans']/div";
	public static final String liveTraining = "//*[@aria-label='/live-training/library']";
	public static final String programs = "//*[@aria-label='/programs']/div";
	public static final String users = "//*[@aria-label='/users']/div";
	public static final String groups = "//*[@aria-label='/groups']/div";
	public static final String reports = "//*[@aria-label='/reports']/div";
	public static final String audits = "//*[@aria-label='/audits']/div";
	public static final String certificates = "//*[@aria-label='/certificates']/div";
	public static final String mostPopularTrainingsTab = "//div//p[text()='Most Popular Trainings' or text()='Entrenamientos Mas Populares']";
	public static final String sideMenuRightArrow = "//div[contains(@class,'sc-fznxsB dlPJxh')]//*[local-name()='svg']";
	public static final String sideMenuLeftArrow = "//div[contains(@aria-label,'Close menu')]//div[contains(@class,'sc-fznxsB dlPJxh')]//*[local-name()='svg']//*[name()='path' and contains(@fill,'#ffffff')]";
	public static final String latestActivity = "//p[text()='Latest Activity' or text()='Ajustes']";
	//Latest Activity Elements
	public static final String latestActivityTab = "//div//p[text()='Latest Activity' or text()='Actividades Recientes']";
	public static final String headerActivity = "//div//p[text()='Activity' or text()='Actividad']";
	public static final String headerUser = "//div//p[text()='User' or text()='Usuario']";
	public static final String headerAction = "//div//p[text()='Action' or text()='Accion']";
	public static final String headerDate = "//div//p[text()='Date' or text()='Fecha']";
	public static final String latestActivityContainer = "//table[@class='sc-fzoXWK bHjqWL']";
	public static final String latestActivityRow = "//table[@class='sc-fzoXWK bHjqWL']/tbody";
	public static final String latestActivityLogin = "(//div//p[text()='Login' or text()='Logeado'])[1]";
	public static final String latestActivityCreated = "(//div//p[text()='Created' or text()='Creado'])[1]";
	public static final String latestActivityUpdated = "(//div//p[text()='Updated' or text()='Actualizado'])[1]";
	public static final String latestActivityDeleted = "(//div//p[text()='Deleted' or text()='Borrado'])[1]";
	public static final String latestActivityLoginAction = "(//p[text()='Logged in to ksquareqa-admin.zaamna.com'])[1]";

	//Profile options
	public static final String settings = "//p[text()='Settings' or text()='Ajustes']";
	public static final String logout = "//p[text()='Log Out' or text()='Cerrar Sesi�n']";
	
	//Kinezis Header
	//Discover
	public static final String discoverHeaderMenu = "//button[text()='Discover']";
	public static final String aboutUsLink = "//li[@itemscope='itemscope']//a[contains(text(),'About us')]";
	public static final String merchandiseLink = "//li[@itemscope='itemscope']//a[contains(text(),'Merchandise')]";
	public static final String photoPassLink = "//li[@itemscope='itemscope']//a[contains(text(),'Photo Pass')]";
	public static final String partnersLink = "//li[@itemscope='itemscope']//a[contains(text(),'Partners')]";
	public static final String nanoLink = "//li[@itemscope='itemscope']//a[contains(text(),'Nano')]";
	public static final String corporateSocialResponsibilityLink = "//li[@itemscope='itemscope']//a[contains(text(),'Corporate Social Responsibility')]";
	public static final String amenitiesLink = "//li[@itemscope='itemscope']//a[contains(text(),'Amenities')]";
	public static final String nutritionLink = "//li[@itemscope='itemscope']//a[contains(text(),'Nutrition')]";
	public static final String latestNewsLink = "//li[@itemscope='itemscope']//a[contains(text(),'Latest News')]";

	//Things to Do
	public static final String thingsToDoHeaderMenu = "//button[text()='Things to Do']";
	public static final String fitnessLink = "//li[@itemscope='itemscope']//a[contains(text(),'Fitness')]";
	public static final String entertainmentLink = "//li[@itemscope='itemscope']//a[contains(text(),'Entertainment')]";
	public static final String spaLink = "//li[@itemscope='itemscope']//a[contains(text(),'Spa')]";
	public static final String howDoesItWork = "//li[@itemscope='itemscope']//a[contains(text(),'How does it work?')]";

	
	//Passes and Combos
	public static final String passesAndCombosHeaderMenu = "//button[text()='Passes & Combos']";
	public static final String passesLink = "//li[@itemscope='itemscope']//a[contains(text(),'Passes')]";
	public static final String combosLink = "//li[@itemscope='itemscope']//a[contains(text(),'Combos')]";
	
	//Groups
	public static final String groupsHeaderMenu = "//button[text()='Groups']";
	public static final String groupExperiencesLink = "//li[@itemscope='itemscope']//a[contains(text(),'Group Experiences')]";
	public static final String groupsPassesLink = "//li[@itemscope='itemscope']//a[contains(text(),'Group Passes')]";
	
	//Plan Your Visit
	public static final String planYourVisitHeaderMenu = "//button[text()='Plan Your Visit']";
	public static final String calendarAndTimingsLink = "//li[@itemscope='itemscope']//a[contains(text(),'Calendar & Timings')]";
	public static final String howToGetToKinezisLink = "//li[@itemscope='itemscope']//a[contains(text(),'How to get to Kinezis')]";
	public static final String frequentlyAskedQuestionsLink = "//li[@itemscope='itemscope']//a[contains(text(),'Frequently Asked Questions')]";
	public static final String safetyAndSecurityMeassuresLink = "//li[@itemscope='itemscope']//a[contains(text(),'Safety and Security Measures')]";
	
	//Kinezis Homepage Body
	public static final String shoppingCartButton = "//button[@aria-label='shopping-cart']";
	public static final String loginButton = "//a[contains(@alt,'Kinezis Logo']";
	public static final String kinezisLogoHeader = "//header//img[@class='brand hidden md:block']";
	public static final String backgroundVideo = "//div[@class='elementor-background-video-container']";
	public static final String welcomeToKinezisHeader = "//h2[contains(., 'WELCOME TO KINEZIS!')]";
	public static final String welcomeTextDescription = "//div[@class ='elementor-widget-wrap elementor-element-populated' and contains(.//h2,'WELCOME TO KINEZIS!')]//child::div[2]";
	public static final String aboutUsButton = "//span[contains(text(),'About Us')]";
	public static final String discoverOurActivitiesHeader = "//h2[contains(., 'DISCOVER OUR ACTIVITIES')]";
	public static final String fitnessDescription = "//span[contains(text(),'Learn About Fitness')]//preceding::div[1]";
	public static final String learnAboutFitnessButton = "//span[contains(text(),'Learn About Fitness')]";
	public static final String entertainmentDescription = "//span[contains(text(),'Learn About Entertainment')]//preceding::div[1]";
	public static final String learnAboutEntertainmentButton = "//span[contains(text(),'Learn About Entertainment')]";
	public static final String wellnessDescription = "//span[contains(text(),'Learn About Health')]//preceding::div[1]";
	public static final String learnAboutWellnessButton = "//span[contains(text(),'Learn About Health')]";
	public static final String passesButtonActive = "//div[contains(@class,'elementor-tab-title elementor-tab-desktop-title elementor-active') and contains(text(),'Passes')]";
	public static final String combosButtonActive = "//div[contains(@class,'elementor-tab-title elementor-tab-desktop-title elementor-active') and contains(text(),'Combos')]";
	public static final String fitnessCard = "(//div[@class='elementor-widget-container']//div[@class='elementor-widget-wrap elementor-element-populated'])[1]";
	public static final String entertainmentCard = "(//div[@class='elementor-widget-container']//div[@class='elementor-widget-wrap elementor-element-populated'])[2]";
	public static final String wellnessCard = "(//div[@class='elementor-widget-container']//div[@class='elementor-widget-wrap elementor-element-populated'])[3]";

	
	public static final String goToFitnessLink = "//div[@class='elementor-tabs-wrapper']//div[contains(text(),'Passes')]/following::span[contains(text(),'Go to Fitness')]";
	
	public static final String goToEntertainmentLink = "//div[@class='elementor-tabs-wrapper']//div[contains(text(),'Passes')]/following::span[contains(text(),'View Entertainment Passes')]";
	public static final String goToWellnessLink = "//div[@class='elementor-tabs-wrapper']//div[contains(text(),'Passes')]/following::span[contains(text(),'View Wellness Passes')]";
	public static final String aeroKinezisButton = "//img[@src='https://staging.kinezis.com/app/uploads/2022/02/aero-logo.svg']";
	public static final String geoKinezisButton = "//img[@src='https://staging.kinezis.com/app/uploads/2022/02/geo-logo.svg']";
	public static final String hidroKinezisButton = "//img[@src='https://staging.kinezis.com/app/uploads/2022/02/hidro-logo.svg']";
	public static final String piroKinezisButton = "//img[@src='https://staging.kinezis.com/app/uploads/2022/02/piro-logo.svg']";
	public static final String moviePlayerFrame = "//div[@id='player']";	
	public static final String latestNewsButtonActive = "//div[contains(@class,'elementor-tab-title elementor-tab-desktop-title elementor-active') and contains(text(),'Latest News')]";
	public static final String storiesAtKinezisButtonActive = "//div[contains(@class,'elementor-tab-title elementor-tab-desktop-title elementor-active') and contains(text(),'Stories @Kinezis')]";
	public static final String thingsToDoButtonActive = "//div[contains(@class,'elementor-tab-title elementor-tab-desktop-title elementor-active') and contains(text(),'Things To Do')]";
	public static final String latestNewsGoToFitness = "//div[@class='elementor-tabs-wrapper']//div[contains(text(),'Latest News')]/following::span[contains(text(),'Go to Fitness')]";
	public static final String getItOnPlayStoreButton = "//img[@src='https://staging.kinezis.com/app/uploads/2022/02/google-play-badge-2@2x-300x116.png']";
	public static final String downloadOnTheAppStoreButton = "//img[@src='https://staging.kinezis.com/app/uploads/2022/02/app-store-badge@2x-300x117.png']";

	//Kinezis Homepage Fooder
	
	
	
}
