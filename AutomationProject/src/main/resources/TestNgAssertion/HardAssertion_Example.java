package TestNgAssertion;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import TestNg.BaseOrCommon;

public class HardAssertion_Example extends BaseOrCommon {

	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");

		System.out.println("in @beforesuite method");
	}

	@BeforeClass
	public void launchURl() {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("in @BeforeClass method");
	}

	@BeforeMethod
	public void wait1() {
		
		waitForAnWebelement();
		
		maximizeTheBrowser();

		System.out.println("in @BeforeMethod method");
	}
	
	@Test(priority =  0)
	public void verifyTitle() {
		
		String expectedTitle = "OrangeHRM"; 
		
		String actualTitle = driver.getTitle();
		
		assertEquals(expectedTitle, actualTitle);
		
		System.out.println("Hi livetech team");
	}
	
	@Test(priority =  1)
	public void enterUserName() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("in enterUserName method");		
	}
		
	@Test(priority =  2)
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println("in enterPassword method");		
	}	
	
	@Test(priority =  3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("in clickLogin method");
	}
	
	@Test(priority =  4)
	public void clickAdminTab() {
		
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		
		System.out.println("in clickAdminTab method");
	}
	

	@AfterMethod
	public void wait2() {
		waitForAnWebelement();

		System.out.println("in @afterMethod method");
	}

	@AfterSuite
	public void closeBrowser() {

		browserClosing();

		System.out.println("in @AfterSuite method");
	}

}
