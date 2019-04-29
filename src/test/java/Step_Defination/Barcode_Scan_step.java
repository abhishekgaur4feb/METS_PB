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

import Page_Object.Barcode_Scan_Object;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Barcode_Scan_step {
	static final Logger logger = Logger.getLogger(Barcode_Scan_step.class);
	public WebDriver driver;

	@Given("^Open browser for MET Application$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
				
		}
	
	@When("^NewUser enters \"(.*?)\" for MET Application$")
	public void user_enters_and(String barcode) throws InterruptedException {
		BasicConfigurator.configure();
		
		//Initialization
		PageFactory.initElements(driver, Barcode_Scan_Object.class);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 90);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(Barcode_Scan_Object.Barcode));
		element.clear();
		Thread.sleep(2000);
		element.sendKeys(barcode);
		
		
		Thread.sleep(2000);
		Barcode_Scan_Object.Barcode_submit.click();
		
		Thread.sleep(4000);
		
		
	    
	}

	@Then("^Message displayed Barcode Successful Submitted for MET Application$")
	public void message_displayed_Login_Successful(){
		logger.info("Submitted Barcode Successfully");

		driver.close();
	}
	


}
