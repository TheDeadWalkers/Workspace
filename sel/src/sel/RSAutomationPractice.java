package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RSAutomationPractice {
		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println("Radio buttons on webpage are "+driver.findElements(By.xpath("//*[@type='radio']")).size());
		System.out.println("Checkboxes on webpage are " + driver.findElements(By.cssSelector("[type='checkbox']")).size());
		radiobtn();
		countries();
		selectdropdown();
		checkbox();
		//windowhandle();
		alertshandle();
		elementdisplay();
		mousehover();
		Thread.sleep(4000);
		framedemo();
	}
	
	static void radiobtn() {
		driver.findElement(By.cssSelector("[value='radio2']")).click();
	}
	
	static void countries() throws InterruptedException {
		driver.findElement(By.cssSelector("[id='autocomplete']")).sendKeys("in");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='ui-menu-item-wrapper']"));
		
		for(WebElement opt:options) {
			if(opt.getText().contains("Indonesia")) {
				opt.click();
				break;
			}
		}
	}
	
	static void selectdropdown() {
		WebElement s = driver.findElement(By.id("dropdown-class-example"));
		Select sd = new Select(s);
		sd.selectByValue("option2");
	}
	
	static void checkbox() {
		driver.findElement(By.id("checkBoxOption3")).click();
	}
	
	static void windowhandle() {
		driver.findElement(By.id("openwindow")).click();
		driver.switchTo().window("CDwindow-4FB0B1F9A47F6FC784ADED00B134F075");
		
	}
	
	static void alertshandle() {
		driver.findElement(By.cssSelector("#name")).sendKeys("Akash");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("#name")).sendKeys("Akash");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}
	
	static void elementdisplay() {
		WebElement txt = driver.findElement(By.id("displayed-text"));
		driver.findElement(By.cssSelector("#hide-textbox")).click();
		if(txt.isDisplayed()==false) {
			driver.findElement(By.id("show-textbox")).click();
			txt.sendKeys("Akash Reddy");
		}else {
			System.out.println("Something wrong there");
		}
	}
	
	static void mousehover() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='mousehover']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Reload']"))).click().perform();
	}
	
	static void framedemo() {
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		driver.findElement(By.xpath("//*[text()='Practice Projects']")).click();
		driver.switchTo().defaultContent();
		
	}

}
