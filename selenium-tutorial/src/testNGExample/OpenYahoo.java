package testNGExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenYahoo extends LaunchAndQuitBrowser {
	
	@Test
	@Parameters("YahooURL")
	public void openYahoo(String url) {
		
	
		driver.get(url);
		
		
	}

}
