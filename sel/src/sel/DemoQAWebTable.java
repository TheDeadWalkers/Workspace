package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		List<WebElement> fname = driver.findElements(By.xpath("//div[@class='rt-tbody']/div"));
		
		for(int i=1;i<fname.size();i++) {
			WebElement person = driver.findElement(By.xpath("(//div[@class='rt-tbody']/div/div/div[1])["+i+"]"));
			
			if(person.getText().equals("Kierra")) { 
			WebElement sal = driver.findElement(By.xpath("(//div[@class='rt-tbody']/div/div/div[5])["+i+"]"));
			System.out.println(person.getText()+ " "+sal.getText()); 
		}
			 
			
			
		}
		
		
	}

}
