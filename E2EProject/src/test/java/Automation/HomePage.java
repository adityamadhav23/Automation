package Automation;


import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
@Test
public void basePageNavigation() throws IOException{
	driver=initalizeDriver();
	driver.get("http://www.qaclickacademy.com/");
	
	LandingPage l=new LandingPage(driver);
	l.getLogin().click();
	
	LoginPage lPage=new LoginPage(driver);
	lPage.getEmail().sendKeys("adi");
	lPage.getPassword().sendKeys("adi");
	lPage.getlogin().click();
}

}
