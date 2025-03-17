package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_1LoginToOrangeHRM_Chrome {
	
	public WebDriver driver;
	
	@BeforeSuite	
	public void launchBrowser() {
		
		driver = new ChromeDriver();
		
		System.out.println("in @beforesuite method");		
	}
	
	@BeforeClass
	public void launchURl()
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("in @BeforeClass method");		
	}
	
	@BeforeMethod
	public void wait1()
	{		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		System.out.println("in @BeforeMethod method");		
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
	

	@AfterMethod
	public void wait2()
	{		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		System.out.println("in @afterMethod method");		
	}
	
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
		
		System.out.println("in @AfterSuite method");		
	}
	
	
	

}
