package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	WebDriver d;
	@Parameters("browser")
	@Test
	public void openbrowser(String browsername) throws InterruptedException {
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
	    	d=new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\geckodriver.exe");
	    	 d=new FirefoxDriver();
			
			}
		else if(browsername.equals("ie")){
			System.setProperty("webdriver.ie.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\IEDriverServer.exe");
	    	d=new InternetExplorerDriver();
		}
		else {
			System.out.println("Browser not found");
		}
		
		d.get("https://www.google.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.quit();
	}
}
