package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/");
		d.manage().window().maximize();
				
		WebElement skip = d.findElement(By.id("enterimg"));
		skip.click();
		
		Thread.sleep(4000);
		
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Akash");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Muchewad");
		d.findElement(By.xpath("//div[@class='form-group']/div/textarea")).sendKeys("Karvenagar");
		d.findElement(By.xpath("//*[@type='email']")).sendKeys("abc@gmail.com");
		d.findElement(By.xpath("//*[@type='tel']")).sendKeys("5658897425");
		d.findElement(By.xpath("//*[@value='Male']")).click();
		d.findElement(By.xpath("//*[@value='Cricket']")).click();
		d.findElement(By.xpath("//*[@value='Hockey']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.id("msdd")).click();
		d.findElement(By.xpath("//*[text()='English']")).click();
		d.findElement(By.xpath("//*[text()='Hindi']")).click();
		d.findElement(By.xpath("//*[text()='Urdu']")).click();
		
		Thread.sleep(2000);
		
		Select s = new Select(d.findElement(By.xpath("//*[@id='Skills']")));
		s.selectByValue("C");
		
		Select s1 = new Select(d.findElement(By.id("countries")));
		s1.selectByVisibleText("India");
		
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		d.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]")).click();
		
		new Select(d.findElement(By.id("yearbox"))).selectByValue("1993");
		new Select(d.findElement(By.xpath("//*[@placeholder='Month']"))).selectByVisibleText("September");
		new Select(d.findElement(By.id("daybox"))).selectByVisibleText("19");
		
		d.findElement(By.id("firstpassword")).sendKeys("Akash@123");
		d.findElement(By.id("secondpassword")).sendKeys("Akash@123");
		
		Thread.sleep(5000);
		
		d.findElement(By.id("submitbtn")).click();
		
		d.findElement(By.id("Button1")).click();
	}

}
