package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLoginPattern {
	
	WebDriver driver;
	public FBLoginPattern(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.id("email");
	By pass = By.id("pass");
	By submit = By.name("login");
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(pass);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}
	
}
