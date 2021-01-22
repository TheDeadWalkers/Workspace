package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationDemoWebtableTest {

	WebDriver driver;
	ExtentReports extents;
	
	/*
	 * @BeforeClass public void extentDemo() { String path =
	 * System.getProperty("user.dir")+"\\repots\\index2.html"; ExtentSparkReporter
	 * reporter = new ExtentSparkReporter(path);
	 * reporter.config().setReportName("Test report");
	 * reporter.config().setDocumentTitle("Automation demo web table");
	 * extents.attachReporter(reporter); extents.setSystemInfo("Tester", "Akash");
	 * 
	 * }
	 */
	
	@Test(dataProvider = "data")
	public void readTable(String myemail) throws InterruptedException {
		
		//extents.createTest("readTable");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		int x=0;
		List<WebElement> emailrow = driver.findElements(By.xpath("//div[@class='ui-grid-header-cell-row']/div/div/div/span[1]"));
		for(int k=0;k<emailrow.size();k++) {
			
			WebElement getemail = driver.findElements(By.xpath("//div[@class='ui-grid-header-cell-row']/div/div/div/span[1]")).get(k);
			if(getemail.getText().equals("Email")) {
				//System.out.println("value of k is = "+k);
				x=k;
			}
		}
		
		
		WebElement next = driver.findElement(By.cssSelector("[class='last-triangle next-triangle']"));
		while (next.isEnabled()) {

			List<WebElement> row = driver.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']"));
			
			for (int j = 0; j < row.size(); j++) {
				WebElement email = driver.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']/div/div["+(x+1)+"]")).get(j);

				if (email.getText().equals(myemail)) {
					WebElement fname = driver.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']/div/div[2]")).get(j);
					WebElement gender = driver.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']/div/div[3]")).get(j);
					WebElement lname = driver.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']/div/div[4]")).get(j);
					WebElement phone = driver.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']/div/div[5]")).get(j);
					
					System.out.println("First name = " + fname.getText());
					System.out.println("Last name = " + lname.getText());
					System.out.println("Gender = " + gender.getText());
					System.out.println("Phone = " + phone.getText());
					return;
				}
			}
			next.click();
		}
		
		//extents.flush();
	}
	
	
	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[3][1];
		
		obj[0][0] = "tama@sa.in";
		
		obj[1][0] = "try@gmail.com";
		
		obj[2][0] = "el@baonoweb.mq";
		
		return obj;
		
	}
}
