package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReddifFinal {

	WebDriver driver;
	Properties prop;
	FileInputStream fis;

	@BeforeClass
	public void openbrowser() throws IOException {
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\akash\\workspace\\Selenium\\src\\test\\reddif.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void readTable() throws Exception {
		
		
		List<WebElement> comrow = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		int x=0;
		for(int j=0;j<comrow.size();j++) {
			WebElement comsel = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th")).get(j);
			if(comsel.getText().equals("Company")) {
				System.out.println(j);
				x=j;
			}
			
		}
		
			List<WebElement> groups = driver.findElements(By.xpath("//div[@id='leftcontainer']/div[4]/a"));
		 for(int i=0;i<groups.size();i++){
			 
			driver.findElements(By.xpath("//div[@id='leftcontainer']/div[4]/a")).get(i).click();		
			
			List<WebElement> companies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
			
			for (int k = 0; k < companies.size(); k++) {
				WebElement mycom = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a")).get(k);
				
				if (mycom.getText().equals(prop.getProperty("mycom"))) {
					System.out.println("Name = " + driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a")).get(k).getText());
					System.out.println("Group = " + driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]")).get(k).getText());
					System.out.println("Prev Close (Rs) = " + driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]")).get(k).getText());
					System.out.println("Current Price (Rs) = " + driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]")).get(k).getText());
					System.out.println("% Change = " + driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]")).get(k).getText());
					return;
				}
			}
		}
	}
}