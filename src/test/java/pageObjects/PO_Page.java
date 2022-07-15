package pageObjects;

/**
 * @author Ksquare
 *
 * @Description This Class represents the objects in Zaamna Courses page.
 *
 */
public class PO_Page {
	
	//Example
	public static final String nextStep = "//button[contains(.,'Next Step') or contains(.,'Siguiente Paso') or contains(.,'Siguiente paso')]";
	public static final String browseImage = "//div[contains(@class,'imageDropzone-dropzone')]//*[text()=' browse image' or text()=' busca tu imagen']";
	public static final String assignmentSearch = "//input[@placeholder='Search' or @placeholder='Buscar']";
	public static final String userSearchResults = "//input[@placeholder='Search']/../following-sibling::ul/li";
	public static final String calendarDay = "//div[@aria-label='%s']";
	public static final String publishedContentClose = "//button/p[text()='Close' or text()='Cerrar']";
	public static final String logout = "//p[text()='Log Out' or text()='Cerrar Sesi�n']";
	public static final String profileIcon = "//img[contains(@alt, 'Profile') and contains (@alt, 'icon')]";
	public static final String nextMonth = "//*[@aria-label='Next Month']";
	public static final String confDropBox = "//div[contains(@class,'imageDropzone-dropzone')]//*[text()=' browse image' or text()=' busca tu imagen']";
	public static final String cropPhotoSlider = "//div[@class='rc-slider-handle']";
	public static final String saveImage = "//button[contains(.,'Save image') or contains(.,'Guardar imagen')]";
	public static final String goBack = "//button[@aria-label='on click you back to previous page']";
	public static final String close = "//*[name()='svg' and contains (.,'Salir') or contains(.,'Close')]/parent::*/parent::button";
	public static final String save = "//p[text()='Save']/..";
	public static final String columns = "//div[contains(@class,'js-columnSelector')]/button";
	public static final String pictureIcon = "//*[name()='svg' and contains(@class,'js-pictureIcon')]";
	public static final String dismiss = "//p[text()='Dismiss']";
	
	

	
}
