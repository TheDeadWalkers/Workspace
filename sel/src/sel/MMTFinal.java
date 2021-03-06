package sel;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMTFinal {
	static WebDriver d;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.makemytrip.com/");
		Actions act = new Actions(d);
		try {
			act.moveToElement(d.findElement(By.xpath("//*[text()='Login or Create Account']"))).build().perform();
		} catch (Exception e) {
			System.out.println("Solved");
		}

		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) d;

		// WebElement frame =
		// d.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
		// d.switchTo().frame(frame);
		// d.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();

		d.findElement(By.id("fromCity")).click();

		d.findElement(By.xpath("//input[@type='text'][@placeholder='From']")).sendKeys("Pu");

		List<WebElement> fromcities = d.findElements(By.xpath("//li[@class='react-autosuggest__suggestion']/div/div/p[1]"));
		Thread.sleep(2000);
		try {
			for(WebElement from : fromcities) {
				if (from.getText().contains("Pune")) {
					from.click();
					break;
				}
			}
			
		} catch (Exception e) {
			System.out.println("Exception");
		}
		

		// d.findElement(By.id("toCity")).click();

		List<WebElement> tocities = d.findElements(By.xpath("//li[@class='react-autosuggest__suggestion']/div/div/p[1]"));

		for (WebElement to : tocities) {
			if (to.getText().contains("Hyderabad")) {
				to.click();
				break;
			}
		}
		// d.findElement(By.xpath("//label[@for='departure']/p")).click();
		WebElement year = d.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));

		while (!year.getText().contains("May 2021")) {
			d.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
		}

		List<WebElement> dates = d.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p[1]"));
		try {
			for (WebElement day : dates) {
				if (day.getText().contains("13"))
					day.click();
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}

		d.findElement(By.cssSelector("[data-cy='travellerText']")).click();

		List<WebElement> adults = d.findElements(By.xpath("//*[@class='appendBottom20']/ul[1]/li"));
		for (WebElement adult : adults) {
			if (adult.getText().equals("3")) {
				adult.click();
			}
		}

		d.findElement(By.xpath("//*[text()='APPLY']")).click();

		d.findElement(By.xpath("//div[@data-cy='flightSW']/div[2]/p/a")).click();

		d.findElement(By.xpath("//div[contains(@class,'sortby-dom-sctn departure_sorter')]/span")).click();

		for (int i = 0; i <= 12; i++) {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}

		List<WebElement> depttime = d.findElements(By.xpath("//div[@class='dept-time']"));
		System.out.println(depttime.size());
		LocalTime t1 = LocalTime.parse("16:00");
		LocalTime t2 = LocalTime.parse("18:00");
		

		for (int i = 0; i < depttime.size(); i++) {

			LocalTime t3 = LocalTime.parse(depttime.get(i).getText());

			if (t3.isAfter(t1) && t3.isBefore(t2)) {
				System.out.println(depttime.get(i).getText());

				act.moveToElement(
						d.findElement(By.xpath("(//div[@class='pull-left make_relative']/button)[" + (i + 1) + "]")))
						.click().build().perform();
				d.findElement(
						By.xpath("(//div[@class='viewFaresOuter  collapse in']/div/div[2]/div[2]/div[2]/button)[1]"))
						.click();
				break;
			}

		}

		Set<String> windows = d.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String parent = itr.next();
		String child = itr.next();

		d.switchTo().window(child);

		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"review-continue\"]")).click();

	}

}
