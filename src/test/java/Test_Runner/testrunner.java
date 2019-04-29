package Test_Runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/Destination"})
//@Cucumber.Options(features="features")--> If in Case Feature file reside in Feature Directory
@CucumberOptions(features="Features",
glue={"Step_Defination"},
plugin={"json:target/cucumber.json","html:target/cucumber-pretty"}) 

//plugin={""html:target/cucumber-html-report"","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"}

public class testrunner {
	 
	    public static void teardown() {

	    }

}
