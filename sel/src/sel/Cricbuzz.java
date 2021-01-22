package sel;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30540/aus-vs-ind-1st-t20i-india-tour-of-australia-2020-21");
		driver.manage().window().maximize();
		
		List<WebElement> players = driver.findElements(By.xpath("(//*[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1] //*[@class='cb-col cb-col-100 cb-scrd-itms']/div/a"));
		//System.out.println(players.size());
		//int totalrun=0;
		for(int i=0;i<players.size()-3;i++) {
			//System.out.println(driver.findElements(By.xpath("(//*[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1] //*[@class='cb-col cb-col-100 cb-scrd-itms']/div/a")).get(i).getText());
			//String playerruns=driver.findElements(By.xpath("(//*[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1] //*[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
			//int pruns = Integer.parseInt(playerruns);
			//totalrun=totalrun+pruns;
			
			
			  if(players.get(i).getText().contains("Samson")) {
			  System.out.println(driver.findElements(By.xpath("(//*[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1] //*[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText());
			  }
			 
		}
		
		takess("Cricbuzz");
		
		//System.out.println(totalrun);
	}

	public static void takess(String ssname) throws IOException {
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yy hh-mm-ss");
		String ssd = sf.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Akash\\Pictures\\ScreenShots\\"+ssname+ssd+".jpg"));
	}
}
