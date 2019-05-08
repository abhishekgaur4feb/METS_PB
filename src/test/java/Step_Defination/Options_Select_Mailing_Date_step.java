package Step_Defination;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import Page_Object.Options_Select_Location_Object;
import Page_Object.Options_Select_Mailing_Date_Object;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Options_Select_Mailing_Date_step {
	static final Logger logger = Logger.getLogger(Options_Select_Mailing_Date_step.class);
	public WebDriver driver;
	public Properties prop;

	@Given("^Open \"([^\"]*)\" for Options in MET Application and click Select Mailing Date$")
	public void Open_firefox_and_start_application(String browser) throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("src//main//resources//Browser.properties");
		prop.load(fis);
		
		//String[] url = prop.getProperty("url").split(",");
		String url=prop.getProperty("url");
		switch (browser)
        {
            case "Chrome":
            	System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
    			driver = new ChromeDriver();
    			driver.manage().deleteAllCookies();
    			driver.get(url);
    			driver.manage().window().maximize();
    			
    				
    			//Runtime.getRuntime().exec("AutoIT_Exe//AutoIT_Login.exe");
    			driver.get(prop.getProperty("url"));
             break;
            case "IE":
            	System.setProperty("webdriver.ie.driver", "driver//IEDriverServer.exe");
            	DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            	capabilities.setCapability("requireWindowFocus", true);
        		driver = new InternetExplorerDriver(capabilities);
        		driver.get(url);
    			driver.manage().window().maximize();  
            break;
            case "Firefox":
    			System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
    			
    			DesiredCapabilities capabilities1 = DesiredCapabilities.firefox();
    			capabilities1.setCapability("marionette",true);
    			driver= new FirefoxDriver(capabilities1);
    			//driver.manage().deleteAllCookies();
    			driver.get(url);
    			driver.manage().window().maximize();    			
            break;
        }
		}
	
	@When("^Mailing Date is selected and User Enters \"(.*?)\" for Options in MET Application$")
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
		Thread.sleep(2000);
		
		
		Options_Select_Mailing_Date_Object.Select.click();
		
	    
	}

	@Then("^Message displayed User clicked on select successfully for Mailing Date Option$")
	public void message_displayed_Login_Successful(){
		logger.info("Submitted Barcode Successfully");

		driver.close();
	}
	


}
