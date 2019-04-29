package Step_Defination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Options_Select_Location_Object;
import Page_Object.Options_Select_Mailing_Date_Object;
import Page_Object.Options_Select_Mode_Object;
import Page_Object.Options_Select_User_Object;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Options_Select_Mode_step {
	static final Logger logger = Logger.getLogger(Options_Select_Mode_step.class);
	public WebDriver driver;

	@Given("^Open browser for Options in MET Application and click Select Mode$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
				
		}
	
	@When("^Mode is selected and User Enters \"(.*?)\" for Options in MET Application$")
	public void user_enters_and(String Scan_Barcode) throws InterruptedException {
		BasicConfigurator.configure();
		
		//Initialization
		PageFactory.initElements(driver, Options_Select_Mode_Object.class);
		Options_Select_Mode_Object.Options.click();
		
		Thread.sleep(2000);
		
		Options_Select_Mode_Object.Select_Mode.click();
		
		Thread.sleep(2000);
		
		
		switch(Scan_Barcode){    
		case "Capture":  Options_Select_Mode_Object.Select_Capture.click();
		break;
		
		case "Validate":  Options_Select_Mode_Object.Select_Validate.click(); 
		break;
		
		}
		
		
		
		Options_Select_Mode_Object.Select.click();
		
		Thread.sleep(2000);
			
		

		
		
		String Get_Scan_details =Options_Select_Mode_Object.Scan_Mode_Value.getText();
	    
		System.out.println("Value for the Scan Barcode"+Get_Scan_details);
		
		Assert.assertEquals(Scan_Barcode, Get_Scan_details);
		
	}

	@Then("^Message displayed User clicked on select successfully for Mode Option$")
	public void message_displayed_Login_Successful(){
		logger.info("Submitted Barcode Successfully");

		driver.close();
	}
	


}
