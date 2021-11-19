package com.Runner_Adactin;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base_Class_Adactin.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)   // cucumber along with j-unit

@CucumberOptions (features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",

glue = "com.StepD",

monochrome = true,

dryRun = false,

strict = true,

tags = ("~@regressionTest"),

plugin = {"html:Report/HtmlReport",
		
          "pretty",   // ---> console
		
		  "json:JsonReport/Report.json",
		
		  "com.cucumber.listener.ExtentCucumberFormatter:ReportNew/ExtentReport.html"}

)

public class Test_Runner {
	
	public static WebDriver driver;   // ---> null driver
	
	@BeforeClass
	public static void set_Up() {
		
		driver = Base_Class.get_Driver("chrome");
	}
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();
	}
	
}
