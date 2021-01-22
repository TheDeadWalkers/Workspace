package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class utilcheck {
	static Properties prop;
	static FileInputStream fs;

	
	public static void fileinput() throws IOException  {
		
		prop = new Properties();
		fs = new FileInputStream("C:\\Users\\akash\\workspace\\Selenium\\src\\test\\amazonprop.properties");
		prop.load(fs);
		
	}
	
	public static void urlcompare(WebDriver driver) throws IOException {
		fileinput();
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("URL"));
		
		
	}
	
	public static void titlecompare(WebDriver driver) throws IOException {
		fileinput();
		Assert.assertEquals(driver.getTitle(), prop.getProperty("title"));
		
	}
}
