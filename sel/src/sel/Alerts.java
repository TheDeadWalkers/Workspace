package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 8);
		
		driver.findElement(By.xpath("(//div[@class='col']/button)[1]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//div[@class='col']/button)[2]")).click();
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//div[@class='col']/button)[3]")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("(//div[@class='col']/button)[4]")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("akash");
		a.accept();
		 
		
		
	}

}
