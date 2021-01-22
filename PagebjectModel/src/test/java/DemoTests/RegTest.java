package DemoTests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DemoRepos.LoginRepo;

public class RegTest extends DemoReg {

	@Test(dataProvider = "data")
	public void register(String ru, String pw) {
		
				
		LoginRepo lr = new LoginRepo(driver);
		lr.regUser(ru , pw);
		
		
	}
	
	
	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[5][2];
		
		obj[0][0] = "test999@abcd.com";
		obj[0][1] = "sdkjfhskjdhwefio";
		
		obj[1][0] = "test777@abcd.com";
		obj[1][1] = "sdkjfhskjsDqw";
		
		obj[2][0] = "test888@abcd.com";
		obj[2][1] = "sdkjfhskjasdhw";
		
		obj[3][0] = "test666@abcd.com";
		obj[3][1] = "sdkjfhskjdhwefio";
		
		obj[4][0] = "test555@abcd.com";
		obj[4][1] = "sdkjfhskjweqwdfio";
		
		return obj;
		
	}

}
