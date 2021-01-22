package TestNG;

import org.testng.annotations.Test;

public class testng1 {

	
	@Test(timeOut = 200)
	public void xyz() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("xyz");
	}
	
	@Test(alwaysRun = true , dependsOnMethods = {"xyz"})
	public void abc() {
		System.out.println("abc");
	}
	
	@Test
	public void mno() {
		System.out.println("mno");
	}
	
	@Test
	public void pqr() {
		System.out.println("pqr");
	}
	
}
