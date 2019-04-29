package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Options_Select_Mailing_Date_Object extends BaseClass{

	public static WebDriver driver;



	public Options_Select_Mailing_Date_Object(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using="//a[@id='navbardrop']")
	public static WebElement Options;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Select Mailing Date')]")
	public static WebElement Select_Mailing_Date;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'12')]")
	public static WebElement Select_Date;
	
	@FindBy(how=How.XPATH, using="//input[@id='Content_btnSelect']")
	public static WebElement Select;
	
	
	@FindBy(how=How.XPATH, using="//table[@id='Content_calMailingDate']")
	public static WebElement Mailing_Date;
	

	
	
	
	
	
	
	
	
	
	
	
}
