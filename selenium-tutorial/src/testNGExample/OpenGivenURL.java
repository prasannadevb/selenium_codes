package testNGExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenGivenURL extends LaunchAndQuitBrowser{
	
	@Test
	@Parameters("url")
	public void openYahoo(String url) {
		
	
		driver.get(url);
		
		
	}

}
