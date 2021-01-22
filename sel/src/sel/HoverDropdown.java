package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement ent = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]"));
		act.moveToElement(ent).build().perform();
		Thread.sleep(4000);
		WebElement apple = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[1]/a[7]"));
		act.moveToElement(apple).click().build().perform();
		
	}

}
