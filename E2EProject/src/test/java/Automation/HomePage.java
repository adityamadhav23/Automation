package Automation;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
@Test(dataProvider = "getData")
public void basePageNavigation(String Username, String Passsowrd, String text) throws IOException{
	driver=initalizeDriver();
	//driver.get("http://www.qaclickacademy.com/");
	driver.get(properties.getProperty("url"));
	
	LandingPage l=new LandingPage(driver);
	l.getLogin().click();
	
	LoginPage lPage=new LoginPage(driver);
	lPage.getEmail().sendKeys(Username);
	lPage.getPassword().sendKeys(Passsowrd);
	lPage.getlogin().click();
	System.out.println(text);
}
@DataProvider
public Object[][] getData() {
	//row>>different data types test should run
	//column>>how many values per test
	Object[][] data=new Object[2][2];
	
	//1st data set
	data[0][0]="adi@test.com"; //getEmail
	data[0][1]="adi";	//getPassword
	//data[0][2]="Restricted User";
	
	//2nd data set
	data[1][0]="aditya@test.com"; //getEmail
	data[1][1]="aditya";	//getPassword
	//data[1][2]="Restricted User";
	
	return data;
}
}

