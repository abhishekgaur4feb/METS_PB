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


import Page_Object.Options_Select_User_Object;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Options_Select_User_step {
	static final Logger logger = Logger.getLogger(Options_Select_User_step.class);
	public WebDriver driver;

	@Given("^Open browser for Options in Mats Application and click Select User$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
				
		}
	
	@When("^Select User is selected and User Enters \"(.*?)\" and \"(.*?)\" for Options in Mats Application$")
	public void user_enters_and(String barcode,String Username) throws InterruptedException {
		BasicConfigurator.configure();
		
		//Initialization
		PageFactory.initElements(driver, Options_Select_User_Object.class);
		Options_Select_User_Object.Options.click();
		
		Thread.sleep(2000);
		
		Options_Select_User_Object.Select_User.click();
		
		
		Options_Select_User_Object.User_Barcode.sendKeys(barcode);
		
		Thread.sleep(2000);
		Options_Select_User_Object.User_Name.sendKeys(Username);
		
		Options_Select_User_Object.Select.click();
		
		Thread.sleep(5000);
		
		String Get_User_details = Options_Select_User_Object.Get_User_details.getText();
		
		System.out.println("Value for the User-->"+Get_User_details);
		
		Assert.assertEquals(Username, Get_User_details);
		
	
	    
	}

	@Then("^Message displayed User clicked on select successfully$")
	public void message_displayed_Login_Successful(){
		logger.info("Submitted Barcode Successfully");

		driver.close();
	}
	


}
