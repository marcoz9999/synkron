package pageObjects;

/**
 * @author Ksquare
 *
 * @Description
 * This Class represents the objects in Zaamna Login page.
 *
 */
public class PO_LoginPage {

	public static final String username = "//*[@id='loginForm-email']";
	public static final String password = "//*[@id='loginForm-password']";
	public static final String loginButton = "//*[@type='submit']";

	//Left panel
	public static final String signInPhrase = "//div[@class='login-left']//h3";

}
