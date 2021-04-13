package seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditFieldsAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bindu\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("http://leafground.com/pages/Edit.html");
 WebElement Appendatext = driver.findElement(By.cssSelector("width:350px"));
 Appendatext.sendKeys("hi");
 

 
 
	}

}