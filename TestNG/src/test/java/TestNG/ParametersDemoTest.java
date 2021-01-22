package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemoTest {

	
	@Test
	@Parameters({"browser"})
	public void demo(String b) {
		
		System.out.println(b);
	}
}
