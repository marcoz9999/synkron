package pageObjects;
/**
 * @author Ksquare
 *
 * @Description
 * This Class represents the objects in Kinezis Home page.
 *
 */
public class PO_PartnertsPage {
		//Kinezis Partners Body
	public static final String inPartnersHeader = "//h2[text()='IN PARTNERS']";
	public static final String inPartnersBackgroundImage = "//h2[text()='IN PARTNERS']/ancestor::div[@class='elementor-container elementor-column-gap-default']";
	public static final String onTheShouldersOfGiantsHeader = "//h2[text()='ON THE SHOULDERS OF GIANTS']";
	public static final String onTheShoulderOfGiantsInfo = "//h2[text()='ON THE SHOULDERS OF GIANTS']/following::div[1]";
	public static final String specialThanksHeader = "//h2[text()='SPECIAL THANKS TO OUR PARTNERS']";
	public static final String specialThanksInfoPart1 = "//h2[text()='SPECIAL THANKS TO OUR PARTNERS']/following::div[1]";
	public static final String specialThanksInfoPart2 = "//h2[text()='SPECIAL THANKS TO OUR PARTNERS']/following::div[1]/following::div[1]";
	public static final String kinezisPartnerBenefitHeader = "//h2[text()='KINEZIS PARTNER BENEFITS']";
	public static final String kinezisPartnerBenefitInfoPart1 = "//h2[text()='KINEZIS PARTNER BENEFITS']/following::div[1]";
	public static final String kinezisPartnerBenefitInfoPart2 = "//h2[text()='KINEZIS PARTNER BENEFITS']/following::div[1]/following::div[1]";
	public static final String wantToKnowMoreHeader = "//h2[text()='WANT TO KNOW MORE ABOUR PARTNERSHIPS?']";
	public static final String contactUsHeader = "//h3[text()='Contact Us! ']";
	public static final String contactUsInfo = "//h3[text()='Contact Us! ']//following::div[1]";

	
    //Kinezis Become a Partner buttons
	public static final String becomeAPartnerButton1 = "(//span[contains(text(),'Become a Partner')])[1]";
	public static final String becomeAPartnerButton2 = "(//span[contains(text(),'Become a Partner')])[2]";

}
