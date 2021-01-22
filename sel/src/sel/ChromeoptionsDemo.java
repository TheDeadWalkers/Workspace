package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.jdi.connect.spi.TransportService.Capabilities;

public class ChromeoptionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.APPLICATION_NAME, true);
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		co.merge(dc);
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");

	}

}
