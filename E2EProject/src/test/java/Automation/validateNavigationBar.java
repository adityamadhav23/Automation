package Automation;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base{
@BeforeTest
public void initialize() throws IOException {
	driver=initalizeDriver();
	driver.get(properties.getProperty("url"));
}

@Test
public void basePageNavigation() throws IOException{
	
	
	LandingPage l=new LandingPage(driver);
	Assert.assertTrue(l.getNaigationBar().isDisplayed());
	
}
@AfterTest
public void teardown() {
	driver.close();
}
}

