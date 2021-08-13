package Automation;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base{
	
@Test
public void basePageNavigation() throws IOException{
	driver=initalizeDriver();
	driver.get(properties.getProperty("url"));
	
	LandingPage l=new LandingPage(driver);
	Assert.assertTrue(l.getNaigationBar().isDisplayed());
	
	
	
}
}

