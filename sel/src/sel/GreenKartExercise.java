package sel;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartExercise {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String[] veggies = {"Apple","Mango","Banana","Grapes"};
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']/h4"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String trimmed = name[0].trim();
			
			List<String> VeggiesList = Arrays.asList(veggies);
			
			if(VeggiesList.contains(trimmed)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}

	}
}