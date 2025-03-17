package TestNgAttributes;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNg.BaseOrCommon;

public class DataProvider_Attribute extends BaseOrCommon {

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

		System.out.println("in @BeforeMethod method");
	}
	/*
	 * Syntax:
	 * 
	 * @dataprovider(name = ‘anusha’) Public Object[][] methodname(){
	 * 
	 * }
	 * 
	 * @test(dataprovider = ‘anusha’) Public void methodname(){
	 * 
	 * }
	 */

	@DataProvider(name = "anusha")
	public Object[][] addCredentails() {

		Object[][] values = new Object[3][2];

		values[0][0] = "testing";
		values[0][1] = "testpass";
		
		values[1][0] = "livetech";
		values[1][1] = "livetechpass";
		
		values[2][0] = "vinod";
		values[2][1] = "vinod123";
		
		return values;
	}

	@Test(priority = 1, dataProvider = "anusha")
	public void enterCredentails(String username, String password) {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
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
