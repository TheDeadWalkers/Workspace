package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/select-menu");
		d.manage().window().maximize();
		
		WebElement color = d.findElement(By.xpath("//*[@id='oldSelectMenu']"));
		
		Select s = new Select(color);
		s.selectByValue("3");
		
		WebElement multiselect = d.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]"));
		multiselect.click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[text()='Green']")).click();
		
	}

}
