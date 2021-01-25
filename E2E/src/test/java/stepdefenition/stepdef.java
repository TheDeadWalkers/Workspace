package stepdefenition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectFactory.pageobjFactory;



public class stepdef {
	 WebDriver d;
	 Properties pr;
	 FileInputStream fs;
	
	 
	 
	@Given("username and password")
	public void username_and_password() throws IOException {
	 
	 
	 WebDriverManager.chromedriver().setup();
	 d = new ChromeDriver();
	 
	 fs = new FileInputStream("C:\\Users\\akash\\workspace\\E2E\\src\\test\\freecrm.properties");
	 pr = new Properties();
	 pr.load(fs);
	 
	 d.get(pr.getProperty("url"));
	 d.manage().window().maximize();
	}

	@When("landed on login page")
	public void landed_on_login_page() throws IOException {
		 pageobjFactory pf = PageFactory.initElements(d, pageobjFactory.class);
		  
		 pf.email().sendKeys("akash@123");
		 pf.pass().sendKeys("adsahds");
		 pf.login().click();
	 
	}
	@Then("login successful")
	public void login_successful() {
	    System.out.println("successfully logged in");
	}
	
	@Then("print hello")
	public void print_hello() {
	   System.out.println("hello there");
	}

	


}
