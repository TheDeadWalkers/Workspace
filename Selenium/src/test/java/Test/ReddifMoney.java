package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReddifMoney {

	WebDriver driver;
	Properties prop;
	FileInputStream fis;
	ExtentReports extent;
	
	@BeforeClass
	public void getSite() throws IOException {
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\akash\\workspace\\Selenium\\src\\test\\reddif.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
			
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Reddif Money");
		reporter.config().setDocumentTitle("Test Results");
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Akash Reddy");
	}
	
	@Test
	public void readTable() {
		
		extent.createTest("readTable");
		
		List<WebElement> companies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		
		for(int i=0;i<companies.size();i++) {			
			
			WebElement company = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a")).get(i);
			if(company.getText().equals(prop.getProperty("mycom"))) {
				System.out.println("Name = "+driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a")).get(i).getText());
				System.out.println("Group = "+driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]")).get(i).getText());
				System.out.println("Prev Close (Rs) = "+driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]")).get(i).getText());
				System.out.println("Current Price (Rs) = "+driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]")).get(i).getText());
				System.out.println("% Change = "+driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]")).get(i).getText());
				break;
			}
		}
		
				extent.flush();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
}
