package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.BaseOrCommon;
import Pages.LoginPage;

public class TC_LoginTest_Anusha extends BaseOrCommon {

	LoginPage lp;
	
	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");
		
		lp = new LoginPage(driver);

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
	
	@Test(priority =  1)
	public void enterUserName() {
		
		lp.enterUsername();
		
		System.out.println("in enterUserName method");		
	}
		
	@Test(priority =  2)
	public void enterPassword() {
		
		lp.enterPassword();
		
		System.out.println("in enterPassword method");		
	}	
	
	@Test(priority =  3)
	public void clickLogin() {
		
		lp.clickLogin();
		
		System.out.println("in clickLogin method");
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
