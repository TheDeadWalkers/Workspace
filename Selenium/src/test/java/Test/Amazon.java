package Test;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Amazon {
		
	static WebDriver d;
	Properties pr;
	
	@BeforeClass
	public void loadpr() throws IOException {
		pr = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\akash\\workspace\\Selenium\\src\\test\\amazonprop.properties");
		pr.load(fis);
	}
	@Test
	public void test() throws IOException {
		
		if(pr.getProperty("Browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
	    	d=new ChromeDriver();
		}
		else if(pr.getProperty("Browser").contains("firefox")){
			try {
			System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\geckodriver.exe");
	    	 d=new FirefoxDriver();
			}
			catch (Exception e) {
				System.out.println("Browser not found");
			}
			}
		else if(pr.getProperty("Browser").contains("ie")){
			System.setProperty("webdriver.ie.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\IEDriverServer.exe");
	    	d=new InternetExplorerDriver();
		}
		else {
			System.out.println("Check property file");
		}
		
		d.get(pr.getProperty("URL"));
		d.manage().window().maximize();
		
		
		
		
	}
	@Test
	public void verifyurl() throws IOException {
		utilcheck.urlcompare(d);
		
	}
	@Test
	public void veriftitle() throws IOException {
		utilcheck.titlecompare(d);
	}
	
}
