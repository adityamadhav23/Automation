package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\programmes\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//find the element->click->enter("ind")->click from dropdown->get the text and match
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		Thread.sleep(4000);
		
		//driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		//driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@id='ui-id-1'] //div"));
		for(WebElement option:options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getAttribute("value"));
	}

}
