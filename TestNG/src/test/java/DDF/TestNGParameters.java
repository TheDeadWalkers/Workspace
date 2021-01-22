package DDF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNGParameters {
	WebDriver d;
	@Parameters({"browser", "url"})
	@Test
	public void test(String bn, String u) {
			
		if(bn.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
		}else if(bn.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
		}else if(bn.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			d = new InternetExplorerDriver();
		}else {
			System.out.println("browser not found");
		}
	}

}


