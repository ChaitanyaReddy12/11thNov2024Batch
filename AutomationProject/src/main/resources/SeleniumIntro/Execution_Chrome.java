package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution_Chrome {

	public static void main(String[] args) {

		//Syntax: interface object = new classname ();		
		
		//System.setProperty("webdriver.edge.driver", "chrome/edge/safari driver exteniosn path");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	}

}
