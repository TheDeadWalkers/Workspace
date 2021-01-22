package DemoRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginRepo {
	
	WebDriver driver;
	
	public LoginRepo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "username")
	WebElement loginuser;
	
	@FindBy(id = "password")
	WebElement loginpass;
	
	 @FindBy(css = "[name='login']")
	 WebElement loginbtn;
	 
	 @FindBy(id = "reg_email")
	 WebElement reguser;
	 
	 @FindBy(id = "reg_password")
	 WebElement regpass;
	 
	 @FindBy(css = "[name='register']")
	 WebElement regbtn;
	 
	 public void regUser(String rusr, String rpwd) {
		 reguser.sendKeys(rusr);
		 regpass.sendKeys(rpwd);
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(regbtn));
		 regbtn.click();
	 }

}
