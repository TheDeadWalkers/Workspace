package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiframe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(4000);
		
		
		WebElement multiframe1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multiframe1);
		Thread.sleep(4000);
		WebElement multiframe2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(multiframe2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("akash");
		Thread.sleep(4000);
		
		//driver.close();
	}

}
