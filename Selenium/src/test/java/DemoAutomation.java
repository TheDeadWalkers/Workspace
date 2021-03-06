import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
	public static WebDriver d;

	@Test
	public void test() throws IOException {
		WebDriverManager.chromedriver().setup();	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		d = new ChromeDriver(co);
		d.get("http://demo.automationtesting.in/");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	
		d.findElement(By.id("btn2")).click();
		d.findElement(By.id("msdd")).click();;

		String[] langs = { "Romanian", "Slovak", "Ukrainian", "Spanish", "Indonesian" };
		List<String> selectedlangs = Arrays.asList(langs);

		List<WebElement> alllangs = d.findElements(By.xpath("//*[@class='ui-corner-all']"));

		for (int i = 0; i < alllangs.size(); i++) {
			String lname = alllangs.get(i).getText();
			if (selectedlangs.contains(lname)) {
				alllangs.get(i).click();
			}

		}
		
		WebElement skill = d.findElement(By.id("Skills"));
    	Select s1 = new Select(skill);
    		s1.selectByValue("Linux");
		
		d.findElement(By.xpath("//*[@class='select2-selection select2-selection--single']")).click();
		d.findElement(By.xpath("(//*[text()='India'])[3]")).click();
		
		System.out.println("Finally done");

	}

}
