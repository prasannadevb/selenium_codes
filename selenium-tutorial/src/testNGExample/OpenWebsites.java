package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenWebsites {
	
	
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	//launch browser one time and hit all the urls then close it
	
	
	

	
	@Test
	public void openGoogle() {
		
	
		driver.get("http://www.google.com");
		
		
		
	}
	
	
	@Test
	public void openYahoo() {
		
	
		driver.get("http://www.yahoo.com");
		
		
	}
	
	@Test
	public void openBing() {
		
	
		
		driver.get("http://www.bing.com");
		
		
		 
		
	       
	}
	
	
}
