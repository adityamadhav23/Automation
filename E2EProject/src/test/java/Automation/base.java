package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class base {
	
	public void initalizeDriver() throws IOException {
		Properties properties=new Properties();
		FileInputStream fis=new FileInputStream("D:\\programmes\\eclipse-workspace\\E2EProject\\src\\test\\java\\Automation\\data.properties");
		properties.load(fis);
		System.out.println(properties.getProperty("browser"));
	}
}
