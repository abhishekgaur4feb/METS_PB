package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Options_Select_Location_Object extends BaseClass{

	public static WebDriver driver;



	public Options_Select_Location_Object(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using="//a[@id='navbardrop']")
	public static WebElement Options;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Select Location')]")
	public static WebElement Select_Location;
	
	@FindBy(how=How.XPATH, using="//input[@id='Content_txtLocationBarcode']")
	public static WebElement Location_Barcode;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='Content_txtLocationName']")
	public static WebElement Location_Name;
	
	@FindBy(how=How.XPATH, using="//input[@id='Content_btnSelect']")
	public static WebElement Select;
	
	
	@FindBy(how=How.XPATH, using="//div[1]/table[1]/tbody[1]/tr[5]/td[2]")
	public static WebElement Get_Location_details;
	
	
	
	
	
	
	
	
	
	
	
	
}
