package sel;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MathCaptcha {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
    	WebDriver d=new ChromeDriver();
    	d.get("https://www.jqueryscript.net/demo/Basic-Math-Captcha-Plugin/");
    	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	d.manage().window().maximize();
    	
    	String s = d.findElement(By.xpath("//*[@id='captchaText']")).getText();
    	
    	String s1 = s.substring(0, 1);
    	String s2 = s.substring(4, 5);
    	System.out.println(s1+"   "+s2);
    	Integer i1 = Integer.valueOf(s1);
    	Integer i2 = Integer.valueOf(s2);
    	
    	Integer i = i1+i2;
    	
    	String ans = String.valueOf(i);
    	
    	d.findElement(By.cssSelector("#captchaInput")).sendKeys(ans);
    	
	}

}
