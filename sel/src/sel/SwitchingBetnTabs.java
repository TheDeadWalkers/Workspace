package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetnTabs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tabs");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='demo-tab-what']"));
		Thread.sleep(4000);
		WebElement origin = driver.findElement(By.xpath("//*[@id='demo-tab-what']/following-sibling::a"));
		origin.click();
		Thread.sleep(4000);
		WebElement use = driver.findElement(By.xpath("//*[@id='demo-tab-what']/following-sibling::a[2]"));
		use.click();
		Thread.sleep(4000);
		driver.navigate().refresh();

	}

}
