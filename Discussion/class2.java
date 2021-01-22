import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
	
		
		
		act.moveToElement(men).perform();
		
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//*[@title='Jeans']"))).click().perform();
		
	}
}
