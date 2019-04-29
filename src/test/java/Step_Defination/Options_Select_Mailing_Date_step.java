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

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import Page_Object.Options_Select_Location_Object;
import Page_Object.Options_Select_Mailing_Date_Object;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Options_Select_Mailing_Date_step {
	static final Logger logger = Logger.getLogger(Options_Select_Mailing_Date_step.class);
	public WebDriver driver;

	@Given("^Open browser for Options in Mats Application and click Select Mailing Date$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
				
		}
	
	@When("^Mailing Date is selected and User Enters \"(.*?)\" for Options in Mats Application$")
	public void user_enters_and(String Mailing_Date) throws InterruptedException {
		BasicConfigurator.configure();
		
		//Initialization
		PageFactory.initElements(driver, Options_Select_Mailing_Date_Object.class);
		Options_Select_Mailing_Date_Object.Options.click();
		
		Thread.sleep(2000);
		
		Options_Select_Mailing_Date_Object.Select_Mailing_Date.click();
		
		
		Options_Select_Mailing_Date_Object.Select_Date.click();
		
		
		//JavaScriptExecutor js= (JavaScriptExecutor)driver;
		//js.exec("document.getElementByID('').value='09/12/2016'");
		
		Options_Select_Mailing_Date_Object.Select.click();
		
	    
	}

	@Then("^Message displayed User clicked on select successfully for Mailing Date Option$")
	public void message_displayed_Login_Successful(){
		logger.info("Submitted Barcode Successfully");

		driver.close();
	}
	


}
