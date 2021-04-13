package testNGExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenBing extends LaunchAndQuitBrowser {
	
	
	@Test
	@Parameters("BingURL")
	public void openBing(String url) {
		
	
		
		driver.get(url);
		//driver
		
		
		 
		
	       
	}


}
