package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestRepo {
	
	
	WebDriver driver;
	
	public TestRepo(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	
	/*
	 * By Email = By.name("email"); 
	 * By Password = By.name("password"); 
	 * By submit = By.xpath("//*[text()='Login']");
	 */
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[text()='Login']")
	WebElement submit;
	
	
	public WebElement email() {
		return email;
	}
	
	public WebElement pass() {
		return password;
	}
	
	public WebElement submit() {
		return submit;
	}
	

	

}
