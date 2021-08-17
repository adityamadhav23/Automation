package Automation;


import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base{
	@BeforeTest
	public void initialize() throws IOException {
		driver=initalizeDriver();
		driver.get(properties.getProperty("url"));
	}
	
@Test
public void basePageNavigation() throws IOException{
	driver=initalizeDriver();
	//driver.get("http://www.qaclickacademy.com/");
	driver.get(properties.getProperty("url"));
	
	LandingPage l=new LandingPage(driver);
	org.testng.Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	
}
@AfterTest
public void teardown() {
	driver.close();
}
}

