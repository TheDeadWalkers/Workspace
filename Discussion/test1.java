import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable-infobar");
		System.setProperty("webdriver.chrome.driver",
				"F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver(co);
		d.get("https://www.spicejet.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		List<WebElement>cities = d.findElements(By.xpath("//div[@class='search_options_menucontent']/div/div/ul/li/a"));
		
		for(WebElement c : cities) {
			
			String s = c.getText();
			if(s.contains("Mumbai")){
				c.click();
			}
		}
		
		System.out.println("complete");
		

	}
}		
		