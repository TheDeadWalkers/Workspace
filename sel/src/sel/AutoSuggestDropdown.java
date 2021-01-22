package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
    	WebDriver d=new ChromeDriver();
    	d.get("https://rahulshettyacademy.com/dropdownsPractise/");
    	d.manage().window().maximize();
    	
    	d.findElement(By.id("autosuggest")).sendKeys("in");
    	Thread.sleep(4000);
    	
    	List<WebElement> options = d.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
    	
    	for(WebElement opt : options) {
    		
    		if(opt.getText().equalsIgnoreCase("India")) {
    			opt.click();
    			break;
    		}
    	}
    	
    	}
	}

