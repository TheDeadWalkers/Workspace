package TestNG;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	static XSSFSheet sh;

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\akash\\Downloads\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		int count = wb.getNumberOfSheets();
		System.out.println(count);

		for (int i = 0; i < count; i++) {

			if (wb.getSheetName(i).contains("Demo")) {
				sh = wb.getSheetAt(i);
				System.out.println(wb.getSheetName(i));

			}
		}

	}

}
