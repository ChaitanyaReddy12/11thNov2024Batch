package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.BaseOrCommon;
import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class TC_ForgotYourPasswordTest extends BaseOrCommon {

	LoginPage lp;
	
	ForgotYourPasswordMethods fpm;
	
	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");
		
		lp = new LoginPage(driver);
		
		fpm = new ForgotYourPasswordMethods(driver);

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
	
	@Test(priority =  0)
	public void clickForgotYourPasswordLink() {
		
		lp.clickForgotYourPassword();
	}
	
	@Test(priority =  1)
	public void enterUserName() {
		
		fpm.enterUsername();	
	}
	
	@Test(priority =  2)
	public void clickCaneclButton() {
		
		fpm.clickCancel();
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
