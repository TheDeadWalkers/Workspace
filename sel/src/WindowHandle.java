import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		
		
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		
		Actions act = new Actions(d);
		
		d.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Akash");
		
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL).perform();
		
		
	}

}
