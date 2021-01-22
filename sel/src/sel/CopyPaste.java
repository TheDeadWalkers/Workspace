package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		Actions act=new Actions(d);
		d.manage().window().maximize();
		
		WebElement fname = d.findElement(By.xpath("//*[@type='text'][@id='userName']"));
		fname.sendKeys("Akash Muchewad");
		
		WebElement email = d.findElement(By.cssSelector("*[type=email][id='userEmail']"));
		email.sendKeys("akash@gmail.com");
		
		WebElement cadd = d.findElement(By.xpath("//*[@placeholder='Current Address'][@id='currentAddress']"));
		cadd.sendKeys("At post patoda, Dist Latur");
		
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
		
		Thread.sleep(4000);
		d.findElement(By.xpath("//*[@id='submit']")).click();
	}

}


