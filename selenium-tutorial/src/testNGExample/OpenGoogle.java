package testNGExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenGoogle extends LaunchAndQuitBrowser{
	
	@Test
	@Parameters("GoogleURL")
	public void openGoogle(String url) {
		
	
		driver.get(url);
		
		
	}
	
	
}
