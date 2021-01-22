package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class MMT {
	
	static WebDriver d;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		 d = new ChromeDriver();
		d.get("https://www.makemytrip.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.cssSelector("#fromCity")).sendKeys("Mumbai");
		Thread.sleep(2000);
		
		List<WebElement> fromcities = d.findElements(By.cssSelector("#react-autowhatever-1 div ul li div div p"));
		for(WebElement from:fromcities) {
			
			if(from.getText().contains("Mumbai")) {
				from.click();
				break;
			}
		}
		
		List<WebElement> tocities = d.findElements(By.cssSelector("#react-autowhatever-1 div ul li div div p"));
		for(WebElement to:tocities) {
			if(to.getText().contains("Hyderabad")) {
				to.click();
				break;
			}
		}
		
		
		WebElement daypicker = d.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));
		while(!daypicker.getText().equals("April 2021")) {
			d.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
		
		
		List<WebElement> date = d.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]"));
		for(WebElement day : date) {
			if(day.getText().equals("19")) {
				day.click();
				break;
			}
		}
		
		d.findElement(By.xpath("//*[text()='Search']")).click();
		
		Thread.sleep(5000);
		takess("MMT");
		
		
		
		
	}
	
	static void takess(String ss) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)d;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\akash\\OneDrive\\Pictures\\Screenshots\\"+ss+".jpg"));
		
	}
	

}
