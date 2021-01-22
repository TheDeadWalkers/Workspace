package sel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LinkCounts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		WebElement footer = d.findElement(By.id("gf-BIG"));
		List<WebElement> footerlinks =  footer.findElements(By.tagName("a"));
		System.out.println(footerlinks.size());
		
		WebElement column = footer.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		List<WebElement> columnlinks = column.findElements(By.tagName("a"));
		System.out.println(columnlinks.size());
		
		for(int i=1;i<columnlinks.size();i++) {
			columnlinks.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		}
	
		Set<String> windows=d.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext()) {
			d.switchTo().window(itr.next());
			System.out.println(d.getTitle());
			
		}
		
		
	}

}
