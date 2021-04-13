package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LaunchAndQuitBrowser {
public static	WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bindu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		
	}

}
