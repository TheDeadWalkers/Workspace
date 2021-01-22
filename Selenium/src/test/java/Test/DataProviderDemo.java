package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
		
		Properties prop;
		FileInputStream fis;
		WebDriver driver;
	@Test(dataProvider = "getdata")
	public void OpenBrowser(String fname, String lname, String email, String confemail, String pass, String day, String month, String year) throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\akash\\workspace\\Selenium\\src\\test\\facebook.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(confemail);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(pass);
		
		WebElement dayofbirth = driver.findElement(By.id("day"));
		Select sel1 = new Select(dayofbirth);
		sel1.selectByVisibleText(day);
		
		WebElement monthofbirth = driver.findElement(By.id("month"));
		Select sel2 = new Select(monthofbirth);
		sel2.selectByVisibleText(month);
		
		WebElement yearofbirth = driver.findElement(By.id("year"));
		Select sel3 = new Select(yearofbirth);
		sel3.selectByVisibleText(year);
		
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] obj = new Object[3][8];
		
		obj[0][0] = "Akash";
		obj[0][1] = "Reddy";
		obj[0][2] = "akash@gmail.com";
		obj[0][3] = "akash@gmail.com";
		obj[0][4] = "akash@123";
		obj[0][5] = "19"; 
		obj[0][6] = "Sep"; 
		obj[0][7] = "1993";
		
		obj[1][0] = "Sada";
		obj[1][1] = "Mamdage";
		obj[1][2] = "sada@gmail.com";
		obj[1][3] = "sada@gmail.com";
		obj[1][4] = "sada@123";
		obj[1][5] = "28"; 
		obj[1][6] = "Jul"; 
		obj[1][7] = "1993";
		
		obj[2][0] = "Datta";
		obj[2][1] = "Sagar";
		obj[2][2] = "datta@gmail.com";
		obj[2][3] = "datta@gmail.com";
		obj[2][4] = "datta@123";
		obj[2][5] = "11"; 
		obj[2][6] = "Feb"; 
		obj[2][7] = "1994";
		
		
		return obj;
	
}
}