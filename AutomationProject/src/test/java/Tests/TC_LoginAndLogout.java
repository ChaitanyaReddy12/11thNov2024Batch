package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.BaseOrCommon;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOutPage;

public class TC_LoginAndLogout extends BaseOrCommon {

	LoginPage lp;
	
	HomePage hp;
	
	SignOutPage sp;
	
	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");
		
		lp = new LoginPage(driver);
		
		//Classname objectname = pagefactory.initElements(web driver object, pagefactoryclass.class)
		
		hp = PageFactory.initElements(driver, HomePage.class);
		
		sp = PageFactory.initElements(driver, SignOutPage.class);

		System.out.println("in @beforesuite method");
	}

	@BeforeClass
	public void launchURl() {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("in @BeforeClass method");
	}

	@BeforeMethod
	public void wait1() {
		
		driver.manage().window().maximize();
		
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
	
	@Test(priority =  4)
	public void clickUserDropdown() {
		
		hp.clickDropdownMenu();
		
		System.out.println("in clickUserDropdown method");
	}
	
	@Test(priority =  5)
	public void clickLogoutTab() {
		
		sp.clickLogout();
		
		System.out.println("in clickLogoutTab method");
	}
	

	@AfterMethod
	public void wait2() {
		waitForAnWebelement();

		System.out.println("in @afterMethod method");
	}

	@AfterSuite
	public void closeBrowser() {

		//browserClosing();

		System.out.println("in @AfterSuite method");
	}

}
