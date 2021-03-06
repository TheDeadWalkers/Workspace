package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.TestRepo;

public class ExcelTest {
	XSSFSheet sh;
	XSSFRow r;
	XSSFCell c;
	
	@Test(dataProvider = "testdata", groups = {"smoke"})
	public void read(String username,String password) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://ui.freecrm.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TestRepo tr = new TestRepo(d);
		
		tr.email().sendKeys(username);
		tr.pass().sendKeys(password);
		tr.submit().click();
		
	}
	
	@Test(groups = {"regression"})
	public void assd() {
		System.out.println("Jaggubhai");
	}
	
	
	
	@DataProvider
	public Object[][] testdata() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\akash\\workspace\\SpiceJet\\src\\test\\SpiceJet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		sh = wb.getSheet("Data");
		int rows = sh.getLastRowNum();
		r = sh.getRow(0);
		int cells = r.getLastCellNum();
			
			
		Object[][] obj=new Object[rows][cells];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cells;j++) {
				c = sh.getRow(i+1).getCell(j);
				
				DataFormatter dc = new DataFormatter();
				
				obj[i][j] = dc.formatCellValue(c);
						
			}
		}	
		
		return obj;
	}
	

}


//poi
//poi ooxml