package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		List<WebElement> Course = driver.findElements(By.xpath("//*[@id='product']/tbody/tr/td[2]"));
		
		for(int i=1;i<=Course.size();i++) {
			WebElement ins = driver.findElement(By.xpath("(//*[@id='product']/tbody/tr/td[2])["+i+"]"));
			if(ins.getText().contains("Write effective QA Resume")) {
				WebElement price = driver.findElement(By.xpath("(//*[@id='product']/tbody/tr/td[2])["+i+"]/following-sibling::td"));
				System.out.println(price.getText());
			}
		}
		
		
	}

}
