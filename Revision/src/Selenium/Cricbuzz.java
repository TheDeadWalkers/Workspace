package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Cricbuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Study\\softwares and packages\\Browser drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.cricbuzz.com/live-cricket-scorecard/30545/aus-vs-ind-3rd-t20i-india-tour-of-australia-2020-21");
		d.manage().window().maximize();
		
		List<WebElement> ind = d.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[3] //div[@class='cb-col cb-col-100 cb-scrd-itms']/div/a"));
		int tr = 0;
		for(int i=0;i<ind.size()-2;i++) {
			String player = ind.get(i).getText();
			if(player.contains("Shardul Thakur")) {
				String sr = d.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[3] //div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
				System.out.println(sr);
			}
			String runs = d.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[3] //div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
			//System.out.println(runs);
			Integer r = Integer.valueOf(runs);
			//System.out.println(r);
			
			tr=tr+r;
			
		}
		//System.out.println(tr);
		
		String extra = d.findElement(By.xpath("((//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[3] //div[@class='cb-col cb-col-100 cb-scrd-itms']/div[2])[10]")).getText();
		int e = Integer.parseInt(extra);
		int total = tr+e;
		//System.out.println(total);
		
		String teamtotal = d.findElement(By.xpath("((//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[3] //div[@class='cb-col cb-col-100 cb-scrd-itms']/div[2])[11]")).getText();
		int tt = Integer.parseInt(teamtotal);
		Assert.assertEquals(total, tt);
		System.out.println(total +"   "+tt);
		d.close();
	}

}
