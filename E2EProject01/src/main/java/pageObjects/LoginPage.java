package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By email=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By login=By.cssSelector("[value='Log In']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
		//return driver.findElement(password);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
		//return driver.findElement(password);
	}
	public WebElement getlogin()
	{
		return driver.findElement(login);
		//return driver.findElement(password);
	}
}
