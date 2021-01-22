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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {
		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByValue("2");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByIndex(1);
		new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		takess("Spicejet");
		
		
	}
	
		static void takess(String name) throws IOException {
			
			Date date = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
			String d = sf.format(date);
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File f = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\Akash\\Pictures\\ScreenShots\\"+name+d+".jpg"));
			
		}

}
