package sel;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		takeScreenShot("google home");
		
		
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
