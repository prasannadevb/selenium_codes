package seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditFieldsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bindu\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("http://leafground.com/pages/Edit.html");
WebElement emailaddress = driver.findElement(By.id("email"));
emailaddress.sendKeys("bindu.pdk@gmail.com");

WebElement append=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
 
append.sendKeys("this is a append text"+Keys.TAB);
	
	
	
	WebElement getTextEntered=driver.findElement(By.name("username"));
	
	String text=getTextEntered.getAttribute("value");
	System.out.println(text);
	
	
	WebElement clearbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	clearbox.clear();
	
	WebElement disabled = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
	boolean value=disabled.isEnabled();
	
	System.out.println(value);
	
	
	
	
	
	}

}
