package sel;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']/h4"));
		String[] itemArray = {"Banana","Mango","Apple","Musk Melon"};
		
		for(int i=0;i<products.size();i++) {
			String[] item = products.get(i).getText().split("-");
			String actualitem = item[0].trim();
			
			List itemlist = Arrays.asList(itemArray);
			
			int j=1;
			if(itemlist.contains(actualitem)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemArray.length)
					break;
			}
		}
		System.out.println("Successful");

	}

}
