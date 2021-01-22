package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginFactory {
		
	WebDriver driver;
	public FBLoginFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement submit;
	
	
	public WebElement email() {
		return email;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement submit() {
		return submit;
	}
}
