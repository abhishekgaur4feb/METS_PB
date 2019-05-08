package Step_Defination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	public static WebDriver driver;
	//public Properties prop;
	//Changes in hooks

	@Before
	/**
	 * Delete all cookies at the start of each scenario to avoid
	 * shared state between tests
	 */
	public void openBrowser() throws IOException {
		/*prop=new Properties();
		FileInputStream fis=new FileInputStream("src//main//resources//Browser.properties");
		prop.load(fis);
		
		//String[] url = prop.getProperty("url").split(",");
		String url=prop.getProperty("url");
		String Browsername=prop.getProperty("browser");
		
		if(Browsername.equals("chrome")){
			System.out.println("Called openBrowser");

			System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
				
			//Runtime.getRuntime().exec("AutoIT_Exe//AutoIT_Login.exe");
			driver.get(prop.getProperty("url"));
			
			
			
			
			
			
			
		}
		else if(Browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			}*/
	}


	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) throws IOException {

		/*if(scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());
				//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
				//byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				//scenario.embed(screenshot, "image/png");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("Screenshots//"+scenario.getName()+"screenshot.png"));
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}

		}*/
		//driver.quit();

	}

}