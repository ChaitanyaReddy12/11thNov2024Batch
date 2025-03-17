package TestNgScreenshots;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import TestNg.BaseOrCommon;

public class TC_1LoginToOrangeHRM_Chrome extends BaseOrCommon {

	@BeforeSuite
	public void launchBrowser() throws IOException {

		browserLaunching("chrome");

		System.out.println("in @beforesuite method");
		
		screenshot("TC_1LoginToOrangeHRM_Chrome_launchBrowser");
	}

	@BeforeClass
	public void launchURl() throws IOException {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("in @BeforeClass method");
		
		screenshot("TC_1LoginToOrangeHRM_Chrome_launchURl");
	}

	@BeforeMethod
	public void wait1() {
		waitForAnWebelement();

		System.out.println("in @BeforeMethod method");
	}
	
	@Test(priority =  1)
	public void enterUserName() throws IOException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("in enterUserName method");		
		
		screenshot("TC_1LoginToOrangeHRM_Chrome_enterUserName");
	}
		
	@Test(priority =  2)
	public void enterPassword() throws IOException {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println("in enterPassword method");	
		
		screenshot("TC_1LoginToOrangeHRM_Chrome_enterPassword");
	}	
	
	@Test(priority =  3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("in clickLogin method");
	}
	
	@Test(priority =  4)
	public void clickAdminTab() throws IOException {
		
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		
		System.out.println("in clickAdminTab method");
		
		screenshot("TC_1LoginToOrangeHRM_Chrome_clickAdminTab");
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
