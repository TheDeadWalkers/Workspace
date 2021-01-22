package sel;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RSTutorial {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-invalid'][@name='name']")).sendKeys("Akash Reddy");
		driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-invalid'][@name='email']")).sendKeys("akash@gmail.com");
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("akash@123");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#exampleCheck1")).isSelected());
		
		WebElement gender = driver.findElement(By.xpath("//*[@id='exampleFormControlSelect1']"));
		Select s = new Select(gender);
		s.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("[class='form-control'][type='date']")).sendKeys("09/19/1993");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		takeScreenShot("hello");
		
		WebElement success = driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']"));
		String str = success.getText();
		System.out.println(str);
		if(str.contains("Success")) {
			Assert.assertTrue(true);
			Thread.sleep(4000);
			driver.close();
		}else {
			System.out.println("Something happened");
		}
		
		
	}
	
public static void takeScreenShot(String ssName) throws IOException {
		
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		String date = s.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;		//narrowing type casting
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Akash\\Pictures\\ScreenShots\\"+ssName+date+".jpg"));
		
		
		//FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Akash\\Pictures\\ScreenShots\\"+ssName+date+".jpg"));
		
	}

}
