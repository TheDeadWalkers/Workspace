package objectFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageobjFactory {
	
	@FindBy(css = "[name='email']")
	WebElement email;
	
	@FindBy(css = "[name='password']")
	WebElement pass;
	
	@FindBy(xpath = "//*[text()='Login']")
	WebElement login;
	
	
	
	public WebElement email() {
		return email;
		
	}
	
	public WebElement pass() {
		return pass;
		
	}
	
	public WebElement login() {
		return login;
		
	}

}
