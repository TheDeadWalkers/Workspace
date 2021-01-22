package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCode {
	
	
	@Test
	public void testdemo() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/Register.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB']")).click();
		List<WebElement> year =driver.findElements(By.xpath("//tbody[@class='datepickerYears']/tr/td/a/span"));
		
		System.out.println(year.size());
		
		
	}

}
