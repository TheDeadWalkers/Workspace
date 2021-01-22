package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		
		List<WebElement> Structure = driver.findElements(By.xpath("//*[@id='post-body-5867683659713562481']/div/div/table/tbody/tr/th"));
		
		for(int i=1;i<Structure.size();i++) {
			WebElement building = driver.findElement(By.xpath("(//*[@id='post-body-5867683659713562481']/div/div/table/tbody/tr/th)["+i+"]"));
			if(building.getText().equals("Burj Khalifa")) {
			WebElement height = driver.findElement(By.xpath("//*[@id='post-body-5867683659713562481']/div/div/table/tbody/tr["+i+"]/td[3]"));
			WebElement year = driver.findElement(By.xpath("//*[@id='post-body-5867683659713562481']/div/div/table/tbody/tr["+i+"]/td[4]"));
			System.out.println("Building="+building.getText()+"| Height="+height.getText()+"| Year="+year.getText());
			break;
			}else {
				System.out.println("No such building found");
				break;
			}
		}
	}

}
