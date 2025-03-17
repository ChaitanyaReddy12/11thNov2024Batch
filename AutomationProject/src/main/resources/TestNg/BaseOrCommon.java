package TestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseOrCommon {
	
	public WebDriver driver;
	
	public void browserLaunching(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			
			driver = new SafariDriver();
		}
		else {
			
			driver = new FirefoxDriver();
		}
	}
	
	public void browserClosing() {
		
		driver.quit();
	}
	
	public void maximizeTheBrowser() {
		
		driver.manage().window().maximize();
	}
	
	public void urlLaunching(String url) {
		
		driver.get(url);
	}
	
	public void waitForAnWebelement() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	public void screenshot(String screenshotName) throws IOException {
		
		File anusha = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(anusha, new File("C:\\Users\\Abcom\\eclipse-workspace\\11thNov2024Batch\\AutomationProject\\src\\test\\java\\Screenshots\\" + screenshotName + ".png"));
	}
	

}
