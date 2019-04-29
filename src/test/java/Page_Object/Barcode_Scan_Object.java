package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Barcode_Scan_Object extends BaseClass{

	public static WebDriver driver;



	public Barcode_Scan_Object(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using="//input[@id='Content_txtBarcodeValue']")
	public static WebElement Barcode;
	
	@FindBy(how=How.XPATH, using="//input[@id='Content_btnSubmit']")
	public static WebElement Barcode_submit;
	
	
	
	
}
