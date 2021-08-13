package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties properties;
	public WebDriver initalizeDriver() throws IOException {
		properties=new Properties();
		FileInputStream fis=new FileInputStream("D:\\programmes\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		properties.load(fis);
		String browser=properties.getProperty("browser");
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\programmes\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\programmes\\selenium\\geckodriver-v0.29.1-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\\\programmes\\\\selenium\\\\edgedriver_win64\\MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
