package introduction;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Onlineshopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\programmes\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//button[text()='ADD TO CART'] 
		
		//array to for getting all the elements
		String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"};
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		int j=0; //variable for breaking the loop
		
		for(int i=0;i<products.size();i++) {
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			//System.out.println(formattedName);
			List<String> itemsNeededList = Arrays.asList(itemsNeeded); //converting array into Array-list
			if(itemsNeededList.contains(formattedName))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
				if (j==itemsNeeded.length) {
					break;
				}
			}
		}
	}
}
