package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepo.FBLoginPattern;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasePattern {
	
	@Test
	public void fbloginpage() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		FBLoginPattern fl = new FBLoginPattern(driver);
		fl.email().sendKeys("8380810132");
		fl.password().sendKeys("akash@123");
		fl.submit().click();
	}

}
