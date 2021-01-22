package sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMTexercise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
    	WebDriver d = new ChromeDriver();
    	d.get("https://www.makemytrip.com/");
    	Actions act = new Actions(d);
    	try {
    		act.moveToElement(d.findElement(By.xpath("//*[text()='Login or Create Account']"))).click().build().perform();
    	}
    	catch(Exception e) {
    		System.out.println("Solved");
    	}
    	
    	d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	d.manage().window().maximize();
    	
    	//WebElement frame = d.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
    	//d.switchTo().frame(frame);
    	//d.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
    	
    	d.findElement(By.id("fromCity")).click();
    	
    	d.findElement(By.id("fromCity")).sendKeys("Pu");
    	   	
    	List<WebElement> fromcities = d.findElements(By.xpath("//li[@class='react-autosuggest__suggestion']/div/div/p[1]"));
    	
    	for(WebElement from :fromcities) {
    		if(from.getText().contains("Pune")) {
    			from.click();
    			break;
    		}
    	}
    	
    	d.findElement(By.id("toCity")).click();
    	
    	
    	List<WebElement> tocities = d.findElements(By.xpath("//li[@class='react-autosuggest__suggestion']/div/div/p[1]"));
    	
    	for(WebElement to:tocities) {
    		if(to.getText().contains("Hyderabad")) {
    			to.click();
    			break;
    		}
    	}
    	d.findElement(By.xpath("//label[@for='departure']/p")).click();
    	WebElement year = d.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));
    		while(!year.getText().contains("May 2021")) {
    			d.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
    	}
    		
    	List<WebElement> dates = d.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p[1]"));
    	try {
    		for(WebElement day : dates) {
        		if(day.getText().contains("13"))
        			day.click();
    		}
    	}
    	catch(Exception e){
    		System.out.println("Exception");
    	}
    	
    	
    	d.findElement(By.cssSelector("[data-cy='travellerText']")).click();
    	
    	List<WebElement> adults = d.findElements(By.xpath("//*[@class='appendBottom20']/ul[1]/li"));
    	for(WebElement adult:adults) {
    		if(adult.getText().equals("3")) {
    			adult.click();
    		}
    	}
    	
    	d.findElement(By.xpath("//*[text()='APPLY']")).click();
    			
    	
    	d.findElement(By.xpath("//div[@data-cy='flightSW']/div[2]/p/a")).click();
    	
    	List<WebElement> timeslots = d.findElements(By.xpath("(//div[@class='timeSlotsOuter'])[1]/div/p[1]"));
    	for(WebElement time:timeslots) {
    		//System.out.println(time.getText());
    		if(time.getText().equals("After 6 PM")) {
    			time.click();
    		}
    	}
    	
    	
    	List<WebElement> depttime = d.findElements(By.xpath("//div[@class='dept-time']"));
    	
    	for(int i=1;i<=depttime.size();i++) {
    		WebElement time = d.findElement(By.xpath("(//div[@class='dept-time'])["+i+"]"));
    		if(time.getText().equals("21:00")) {
    			d.findElement(By.xpath("(//div[@class='pull-left make_relative'])["+i+"]")).click();
    			//d.findElement(By.xpath("((//div[contains(@class,'viewFaresOuter')])["+i+"]/div/div[2]/div[2]/div[2]/button)[1]")).click();
    			d.findElement(By.xpath("(//div[@class='viewFaresOuter  collapse in']/div/div[2]/div[2]/div[2]/button)[1]")).click();
    		}
    	}
    	
	}

}
