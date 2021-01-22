import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.common.usermodel.fonts.FontFamily;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationDemo {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriverWait wait;
	JavascriptExecutor js;

	@BeforeClass
	public void launch() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		fis = new FileInputStream("C:\\Users\\akash\\workspace\\Selenium\\src\\test\\automation.properties");
		prop = new Properties();
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void validateurl() {

		Assert.assertEquals(prop.getProperty("url"), driver.getCurrentUrl(), "URL is not matching");
		System.out.println("URL verified");
		
	}

	@Test(priority = 2)
	public void validatetitle() {
		Assert.assertEquals(prop.getProperty("title"), driver.getTitle(), "Title is not matching");
		System.out.println("Title Verified");
	}

	@Test(priority = 3)
	public void webtable() {
		WebElement webtable = driver.findElement(By.xpath("//*[text()='WebTable']"));
		if (webtable.isDisplayed()) {
			System.out.println("Webtable is present");
		} else {
			System.out.println("Webtable is not present");
		}
	}

	@Test(priority = 4)
	public void webelement() {

		try {
			driver.findElement(By.xpath("//div[@value='abcd']"));
			System.out.println("Given webelement is found");
		} catch (NoSuchElementException e) {
			System.out.println("Given webelement is not found");
		}

	}

	@Test(priority = 5)
	public void getattribute() {
		WebElement reg = driver.findElement(By.xpath("//section[@id='section']/div/h2"));
		System.out.println(reg.getCssValue("Font"));
		System.out.println(reg.getCssValue("FontFamily"));
		System.out.println(reg.getCssValue("Color"));
	}

	@Test(priority = 6)
	public void vertical() {
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		int i = email.getSize().height;
		int j = phone.getSize().height;

		System.out.println("Email height=" + i + " " + "Phone height=" + j);

		if (i == j) {
			System.out.println("Height matched");
		} else {
			System.out.println("height not matched");
		}
	}

	@Test(priority = 7)
	public void horizantal() {
		WebElement year = driver.findElement(By.xpath("//*[@id='yearbox']"));
		WebElement month = driver.findElement(By.xpath("//*[@placeholder='Month']"));
		int i = year.getSize().width;
		int j = month.getSize().width;

		System.out.println("Year Width=" + i + " " + "Month width=" + j);

		if (i == j) {
			System.out.println("Width matched");
		} else {
			System.out.println("Width not matched");
		}
	}

	@Test(priority = 8)
	public void checkbox() {
		WebElement movie = driver.findElement(By.id("checkbox2"));
		if (movie.isSelected()) {
			System.out.println("Checkbox is already selected");
		} else {
			System.out.println("Checkbox is not selected");
			movie.click();
			System.out.println("Movies selected");
		}
	}

	@Test(priority = 9)
	public void scroll() {
		js = (JavascriptExecutor) driver;
		WebElement confpass = driver.findElement(By.id("secondpassword"));
		js.executeScript("arguments[0].scrollIntoView();", confpass);
		confpass.sendKeys("Jaggudada");

	}

	@Test(priority = 10)
	public void image() {
		WebElement img = driver.findElement(By.xpath("//div[@class='row']/div/a/img"));
		System.out.println(img.getAttribute("src"));
	}
}
