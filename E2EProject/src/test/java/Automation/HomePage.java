package Automation;


import java.io.IOException;

import org.testng.annotations.Test;

import Automation.base;

public class HomePage extends base{
	
@Test
public void basePageNavigation() throws IOException{
	driver=initalizeDriver();
	driver.get("http://www.google.com");
}

}
