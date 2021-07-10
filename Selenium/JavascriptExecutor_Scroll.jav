package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//
		System.setProperty("webdriver.chrome.driver", "D:\\programmes\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List <WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for (int i=0;i<values.size();i++) {
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		
		String act_count=driver.findElement(By.cssSelector(".totalAmount")).getText().split(" ")[3];
		
		int actual_count=Integer.parseInt(act_count);
		System.out.println(actual_count);
		if (sum==actual_count) {
			System.out.println("The values are matching!!");
		}else {
			System.out.println("Values are not matching");
		}
		
		
		
	}
	
}
