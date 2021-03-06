package objectRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceJetRegister {
	
	WebDriver driver;
	
	public SpiceJetRegister(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//select[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']")
	WebElement title;
	
	@FindBy(xpath = "//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName']")
	WebElement fname;
	
	@FindBy(xpath = "//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName']")
	WebElement lname;
	
	@FindBy(xpath = "//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER']")
	WebElement mobile;
	
	@FindBy(xpath = "//input[@id='CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword']")
	WebElement pass;
	
	@FindBy(xpath = "//input[@id='CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm']")
	WebElement cpass;
	
	@FindBy (id = "CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB")
	WebElement dob;
	
	/*
	 * @FindBy(xpath = "//tbody[@class='datepickerYears']/tr/td/a/span") WebElement
	 * year;
	 */
	By year = By.xpath("//tbody[@class='datepickerYears']/tr/td/a/span");
	
	/*
	 * @FindBy(xpath = "//tbody[@class='datepickerMonths']/tr/td/a/span") WebElement
	 * month;
	 */
	By month = By.xpath("//tbody[@class='datepickerMonths']/tr/td/a/span");
	
	
	/*
	 * @FindBy(xpath = "//tbody[@class='datepickerDays']/tr/td/a/span") WebElement
	 * day;
	 */
	By day = By.xpath("//tbody[@class='datepickerDays']/tr/td/a/span");
	
	@FindBy(xpath = "//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail']")
	WebElement email;
	
	
	public WebElement title() {
		return title;
	}
	
	public void firstname(String fn) {
		 fname.sendKeys(fn);;
	}
	
	public void lastname(String ln) {
		 lname.sendKeys(ln);;
	}
	
	public void mobileno(String mn) {
		mobile.sendKeys(mn);;
	}
	
	public void password(String ps) {
		 pass.sendKeys(ps);
	}
	
	public void confirmpassword(String cps) {
		 cpass.sendKeys(cps);;
	}
	
	
	public void dob() {
		dob.click();
	}
	
	public List<WebElement> year() {
		return driver.findElements(year);
	}
	
	public List<WebElement> month() {
		return driver.findElements(month);
	}
	
	public List<WebElement> day() {
		return driver.findElements(day);
	}
	
	public void email(String em) {
		 email.sendKeys(em);;
	}
		
}
