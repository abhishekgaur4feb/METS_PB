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
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Options_Select_Location_step {
	static final Logger logger = Logger.getLogger(Options_Select_Location_step.class);
	public WebDriver driver;

	@Given("^Open browser for Options in MET Application and click Select Location$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
				
		}
	
	@When("^location is selected and User Enters \"(.*?)\" and \"(.*?)\" for Options in MET Application$")
	public void user_enters_and(String location_barcode,String location_name) throws InterruptedException {
		BasicConfigurator.configure();
		
		//Initialization
		PageFactory.initElements(driver, Options_Select_Location_Object.class);
		Options_Select_Location_Object.Options.click();
		
		Thread.sleep(2000);
		
		Options_Select_Location_Object.Select_Location.click();
		
		Options_Select_Location_Object.Location_Barcode.sendKeys(location_barcode);
		
		Thread.sleep(2000);
		
		Options_Select_Location_Object.Location_Name.sendKeys(location_name);
	
		
		Options_Select_Location_Object.Select.click();
		
		Thread.sleep(5000);

		String Get_Location =Options_Select_Location_Object.Get_Location_details.getText();
		
		System.out.println("Location Passed"+Get_Location);
		
		Assert.assertEquals(location_name, Get_Location);
		
		
		
		
	    
	}

	@Then("^Message displayed User clicked on select successfully for location Option$")
	public void message_displayed_Login_Successful(){
		logger.info("Submitted Barcode Successfully");

		driver.close();
	}
	


}
