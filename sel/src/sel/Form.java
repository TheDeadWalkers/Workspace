package sel;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Form {

    public static void main(String[] args) throws Exception {	  
 		
    	System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
    	WebDriver d=new ChromeDriver();
    	d.get("http://demo.automationtesting.in/");
    	d.manage().window().maximize();
    	
    	WebElement skip = d.findElement(By.id("enterimg"));
    	skip.click();
    	

    	WebElement fname = d.findElement(By.xpath("//input[@type='text'][@placeholder='First Name']"));
    	fname.sendKeys("akash");
    	
    	WebElement lname = d.findElement(By.xpath("//input[@type='text'][@placeholder='Last Name']"));
    	lname.sendKeys("muchewad");
    	
    	WebElement address = d.findElement(By.xpath("//textarea[@rows='3']"));
    	address.sendKeys("At post Patoda Dist Latur, Maharashtra");
    	
    	WebElement email = d.findElement(By.xpath("//input[@type='email']"));
    	email.sendKeys("akash@gmail.com");
    
    	WebElement phone = d.findElement(By.xpath("//input[@type='tel']"));
    	phone.sendKeys("9876543210");
	    
    	WebElement gender = d.findElement(By.xpath("//input[@value='Male']"));
    	gender.click();
    	
    	WebElement hobbie1 = d.findElement(By.id("checkbox1"));
    	hobbie1.click();
    	
    	WebElement hobbie2 = d.findElement(By.id("checkbox2"));
    	hobbie2.click();
    	
    	WebElement lang = d.findElement(By.id("msdd"));
    	lang.click();
    	d.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[2]/a")).click();
    	d.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
    	d.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[13]/a")).click();
    	
    	WebElement skill = d.findElement(By.id("Skills"));
    	Select s1 = new Select(skill);
    		s1.selectByValue("Linux");

    	WebElement country = d.findElement(By.id("countries"));
    	Select s2 = new Select(country);
    	s2.selectByValue("India");
    	
    	d.findElement(By.xpath("//*[@class='select2-selection select2-selection--single']")).click();
    	List<WebElement> con = d.findElements(By.xpath("//*[@class='select2-results__options']/li"));
    	for(WebElement c:con) {
    		if(c.getText().equals("Denmark")) {
    			c.click();
    			break;
    		}
    	}
    	
    	
		/*
		 * WebElement con = d.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span")); con.click();
		 * d.findElement(By.xpath("//*[@id='select2-country-results']/li[6]")).click();
		 */
    	
    	WebElement year = d.findElement(By.id("yearbox"));
    	Select s3 = new Select(year);
    	s3.selectByValue("1993");
    	
    	WebElement month = d.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));
    	Select s4 = new Select(month);
    	s4.selectByValue("September");
    	
    	WebElement day = d.findElement(By.id("daybox"));
    	Select s5 = new Select(day);
    	s5.selectByValue("19");
    	
    	WebElement pass = d.findElement(By.id("firstpassword"));
    	pass.sendKeys("Akash@123");
    	
    	WebElement conpass = d.findElement(By.id("secondpassword"));
    	conpass.sendKeys("Akash@123");
    	
    	WebElement submit = d.findElement(By.id("submitbtn"));
    	submit.click();
    	
		
    	Thread.sleep(5000);
    	d.close();
    	
    }

    }

