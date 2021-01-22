package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	
	@Test(dataProvider = "dataprovider")
	public void demo(String s) {
		System.out.println(s);
	}
	
	@DataProvider
	public Object[] dataprovider() {
		Object[] obj = new Object[5];
		
		obj[0]="Akash";
		obj[1]="Jaggu";
		obj[2]="Ashlesha";
		obj[3]="Parag";
		obj[4]="Maduri";
		return obj;
	}
}
