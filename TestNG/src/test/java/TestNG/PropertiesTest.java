package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesTest {

	@Test
	public void demo() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\akash\\workspace\\TestNG\\src\\test\\Demo.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
	}
}
