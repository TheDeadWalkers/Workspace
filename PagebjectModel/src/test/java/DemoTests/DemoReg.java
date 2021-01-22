package DemoTests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoReg {
	
	WebDriver driver;
	Properties pr;
	FileInputStream fs;
	
	@BeforeSuite
	public void launchbrowser() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		fs = new FileInputStream("C:\\Users\\akash\\workspace\\PagebjectModel\\src\\test\\demo.properties");
		pr = new Properties();
		pr.load(fs);
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	
	
	//@AfterSuite
	public void closebrowser() {
		if(driver!=null) {
		driver.quit();
		}
	}
	
	
}
