package Automation;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base{
	public WebDriver driver;
	public static Logger Log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initalizeDriver();
		Log.info("Driver is initialize");
		driver.get(properties.getProperty("url"));
		Log.info("Navigated to home page");
	}
	
@Test
public void basePageNavigation() throws IOException{
	driver=initalizeDriver();
	//driver.get("http://www.qaclickacademy.com/");
	driver.get(properties.getProperty("url"));
	
	LandingPage l=new LandingPage(driver);
	org.testng.Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	Log.info("Sussessfully validated Text Message");
}
@AfterTest
public void teardown() {
	driver.close();
}
}

