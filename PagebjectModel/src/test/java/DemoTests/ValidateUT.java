package DemoTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ValidateUT extends DemoReg {
	
	@Test
	public void validateurl() {
		assertEquals(driver.getCurrentUrl(), pr.getProperty("url"),"URL does not match");
	}
	
	@Test
	public void validatetitle() {
		assertEquals(driver.getTitle(), pr.getProperty("title"),"Title does not match");
	}

}
