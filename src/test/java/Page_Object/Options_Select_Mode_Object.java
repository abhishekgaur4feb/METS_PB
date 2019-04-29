package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Options_Select_Mode_Object extends BaseClass{

	public static WebDriver driver;



	public Options_Select_Mode_Object(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using="//a[@id='navbardrop']")
	public static WebElement Options;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Select Mode')]")
	public static WebElement Select_Mode;
	
	@FindBy(how=How.XPATH, using="//input[@id='Content_rbValidate']")
	public static WebElement Select_Validate;
	
	@FindBy(how=How.XPATH, using="//input[@id='Content_rbCapture']")
	public static WebElement Select_Capture;
	
		
	
	@FindBy(how=How.XPATH, using="//input[@id='Content_btnSelect']")
	public static WebElement Select;
	
	
	@FindBy(how=How.XPATH, using="//div[1]/table[1]/tbody[1]/tr[3]/td[2]")
	public static WebElement Scan_Mode_Value;
	
	
	
	
	
	
	
	
	
	
	
	
}
