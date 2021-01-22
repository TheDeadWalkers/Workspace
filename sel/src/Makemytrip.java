import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.spicejet.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		WebElement month = d.findElement(By.xpath("(//*[@class='ui-datepicker-month'])[1]"));
		
		
		WebElement next = d.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']"));
	
		while(!month.getText().contains("April")) {
			next.click();
			Thread.sleep(1000);
		
		
			
		}
		
	}
	
}
