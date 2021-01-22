package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDemo {

	static WebDriver driver;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static XSSFRow row;

	@BeforeTest
	public void excelOps() throws IOException {
		FileInputStream fis = new FileInputStream("F:\\Softwares\\Study\\Notes\\Selenium.xlsx");
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet("Login");
	}

	@Test(dataProvider = "readdata")
	public void login(String username, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://freecrm.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		driver.close();

	}

	@DataProvider
	public Object[][] readdata() {
		int rowcount = sh.getLastRowNum();
		row = sh.getRow(0);
		int cellcount = row.getLastCellNum();
		Object[][] data = new Object[rowcount][cellcount];
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				// String cellvalue = sh.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(cellvalue);
				data[i][j] = sh.getRow(i + 1).getCell(j).toString();
				// System.out.println(data[i][j]);
			}
		}
		return data;
	}
}
