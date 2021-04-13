package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExample2 {

@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bindu\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.close();
	}

@Test
public void openBing() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bindu\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.bing.com/");
	driver.close();
}


}
