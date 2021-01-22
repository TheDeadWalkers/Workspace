package sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xyz {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Akash");
		d.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Muchewad");
		d.findElement(By.cssSelector("[class='col-md-8 col-xs-8 col-sm-8'] textarea")).sendKeys("Karvenagar");
		d.findElement(By.cssSelector("[ng-model='EmailAdress']")).sendKeys("xyz@abc.com");
		d.findElement(By.xpath("//input[@type='tel']")).sendKeys("7894561237");
		d.findElement(By.cssSelector("[value='Male']")).click();
		d.findElement(By.cssSelector("[value='Cricket']")).click();
		
		WebElement skills = d.findElement(By.cssSelector("#Skills"));
		Select s = new Select(skills);
		s.selectByValue("Java");
		
		WebElement country = d.findElement(By.cssSelector("#countries"));
		Select s1 = new Select(country);
		s1.selectByValue("India");
		
		d.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		List<WebElement> c = d.findElements(By.cssSelector(".select2-results__options li"));
		for(WebElement e : c) {
			if(e.getText().contains("India")) {
				e.click();
				break;
			}
		}
		
		WebElement year = d.findElement(By.xpath("//*[@id='yearbox']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1993");
		
		WebElement month = d.findElement(By.cssSelector("[ng-model='monthbox']"));
		Select s3 = new Select(month);
		s3.selectByVisibleText("September");
		
		new Select(d.findElement(By.xpath("//*[@id='daybox']"))).selectByVisibleText("19");
		
		d.findElement(By.id("firstpassword")).sendKeys("Akash@123");
		d.findElement(By.id("secondpassword")).sendKeys("Akash@123");
		
		d.findElement(By.id("submitbtn")).click();
		
		
	}

}
