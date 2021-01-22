package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop  {
	
	public static void main(String[] args) throws InterruptedException {		
	
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/droppable");
		d.manage().window().maximize();
		Actions act = new Actions(d);
		
		WebElement drag = d.findElement(By.id("draggable"));
		WebElement drp = d.findElement(By.id("droppable"));
		
		//act.dragAndDrop(drag, drop).perform();
		
		
		act.clickAndHold(drag).perform();
		act.moveToElement(drp).perform();
		act.release().perform();
		
		Thread.sleep(4000);
		d.close();
		
	}
	
}
