package seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCssProperty;

public class ButtonFieldsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bindu\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Button.html");
//WebElement gotohomepage = driver.findElement(By.id("home"));
//gotohomepage.click();
driver.manage().window().maximize();
//find the position button
WebElement positionbutton = driver.findElement(By.id("position"));
Point button = positionbutton.getLocation();
int xvalue = button.getX();
int yvalue = button.getY();
System.out.println(xvalue);
System.out.println(yvalue);
// find the color of the box
WebElement colorbox = driver.findElement(By.id("color"));
String buttoncolor = colorbox.getCssValue("background-color");
System.out.println(buttoncolor);
//find the height and width of the box
WebElement boxsize = driver.findElement(By.id("size"));
Dimension heightandwidth = boxsize.getSize();
int height = heightandwidth.getHeight();
int width = heightandwidth.getWidth();
System.out.println(height);
System.out.println(width);













	}

}