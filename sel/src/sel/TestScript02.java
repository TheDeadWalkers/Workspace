package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\\\Softwares\\\\Study\\\\softwares and packages\\\\Browser drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.xpath("//*[contains(@placeholder,'Full Nam')]")).sendKeys("akash");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("textarea[id*='currentAddre']")).sendKeys("karvenagar pune");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.sendKeys(Keys.BACK_SPACE);
		act.build().perform();
		act.sendKeys(Keys.BACK_SPACE);
		act.build().perform();
		act.sendKeys(Keys.BACK_SPACE);
		act.build().perform();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		//driver.findElement(By.xpath("//*[text()='Submit']")).submit();
		
	}

}
