package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("enterimg")).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.className("dropdown-toggle"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Frames']"))).click().perform();
		Thread.sleep(2000);
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//div[@class='container']/div/div/input")).sendKeys("akash"); 
		Thread.sleep(4000);
		
		driver.close();
		 		

	}

}
