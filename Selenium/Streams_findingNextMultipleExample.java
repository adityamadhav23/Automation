package introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streams_findingNextMultipleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\programmes\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[1]//span")).click();
		List<WebElement> names=driver.findElements(By.xpath("//tr//td[1]"));
		//collecting original list
		List<String> originalList=names.stream().map(s->s.getText()).collect(Collectors.toList());
		//Sorting the original list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		//List<String> sortedList2=names.stream().sorted().collect(Collectors.toList());
		//System.out.println(sortedList2);
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		List<String> list = Arrays.asList("Beans", "Rice");
		//scan for a values of a particular field and find the corresponding next element
		for(String lists : list){
			do {
				List<WebElement> names1=driver.findElements(By.xpath("//tr//td[1]"));
				price=names1.stream().filter(s -> s.getText().contains(lists)).map(s -> getPriceBeans(s)).collect(Collectors.toList());
				price.forEach(a->System.out.println(a));
				if (price.size()<1) {
					driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				}
			} while(price.size()<1);
		}	
	}
	private static String getPriceBeans(WebElement s) {
		// TODO Auto-generated method stub
		String placevalues=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return placevalues;
	}
}