package pageObjects;
/**
 * @author Ksquare
 *
 * @Description
 * This Class represents the objects in Zaamna Home page.
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
	public static final String logout = "//p[text()='Log Out' or text()='Cerrar Sesión']";
}
