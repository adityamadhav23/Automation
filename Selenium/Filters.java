package introduction;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Filters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\programmes\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> names=driver.findElements(By.xpath("//tr//td[1]"));
		
		/*-----Alternate Way by matching the size of list-----
		 * List<WebElement> filteredList=
		 * names.stream().filter(veggie->veggie.getText().contains("Rice")).
		 * collect(Collectors.toList()); //1 result Assert.assertEquals(names.size(),
		 * filteredList.size());
		 */
		//collecting original list
		List<String> originalList=names.stream().map(s->s.getText()).collect(Collectors.toList());
		for(String lists : originalList){
			
			System.out.println(lists.equals("Rice"));
		}
	}

}
