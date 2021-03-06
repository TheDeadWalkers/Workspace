package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.SpiceJetRegister;

public class SpiceJetTest {
	FileInputStream fis;
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFRow row;
	XSSFSheet sheet;
	XSSFCell cell;
	Properties pr;
	
	
	
	@Test(dataProvider = "readdata2")
	public void testdata(String title, String fname, String lname, String mobile, String password, String cpass, String year, String month, String date, String email) throws IOException {
		
		//System.out.println(title+" "+fname+" "+lname+" "+mobile+" "+password+" "+cpass+" "+year+" "+month+" "+date+" "+email);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/Register.aspx");
		driver.manage().window().maximize();
		SpiceJetRegister sr = new SpiceJetRegister(driver);
		
		new Select(sr.title()).selectByVisibleText(title);
		
		sr.firstname(fname);
		sr.lastname(lname);
		sr.mobileno(mobile);
		sr.password(password);
		sr.confirmpassword(cpass);
		sr.email(email);
		Set<String> win = driver.getWindowHandles();
		Iterator<String> itr = win.iterator();
		while(itr.hasNext()) {
			itr.next();
			System.out.println(driver.getTitle());
		}
	}

	@DataProvider
	public Object[][] readdata() throws IOException {
		fis = new FileInputStream("C:\\Users\\akash\\workspace\\SpiceJet\\src\\test\\SpiceJet.xlsx");
		wb = new XSSFWorkbook(fis);
		
		sheet = wb.getSheetAt(0);
		row = sheet.getRow(0);
		int totalrow = sheet.getLastRowNum();
		int totalcell = row.getLastCellNum();
		Object[][] obj = new Object[totalrow][totalcell];
		for (int i = 0; i < totalrow; i++) {
		
		for (int j = 0; j < totalcell; j++) {

				cell = sheet.getRow(i+1).getCell(j);

				DataFormatter df = new DataFormatter();
				obj[i][j]=df.formatCellValue(cell);

			}
		}

		return obj;

	}
	
	
	@DataProvider
	public Object[][] readdata2() throws IOException {
		fis = new FileInputStream("C:\\Users\\akash\\workspace\\SpiceJet\\src\\test\\SpiceJet.xlsx");
		wb = new XSSFWorkbook(fis);
		
		sheet = wb.getSheetAt(0);
		row = sheet.getRow(0);
		int totalcell = row.getLastCellNum();
		Object[][] obj = new Object[1][totalcell];
		
		int rownumber = 4;
		for (int j = 0; j < totalcell; j++) {

				cell = sheet.getRow(rownumber).getCell(j);

				DataFormatter df = new DataFormatter();
				obj[0][j]=df.formatCellValue(cell);

			}
		return obj;

	}


}
