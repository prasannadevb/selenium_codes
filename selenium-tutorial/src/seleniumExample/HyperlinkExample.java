package seleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\bindu\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Link.html");
driver.manage().window().maximize();
//WebElement gotohomepage = driver.findElement(By.linkText("Go to Home Page"));
//gotohomepage.click();
// Find where am supposed to go without clicking me?
//WebElement findmypage = driver.findElement(By.partialLinkText("Find"));
//String find1 = findmypage.getAttribute("href");
//System.out.println(find1);
// Go to Home Page1
//List<WebElement> gotohomepage1 = driver.findElements(By.partialLinkText("Go to"));
//WebElement homepage1 = gotohomepage1.get(1);
//homepage1.click();
//find how many links in the page
List<WebElement> countoflinks = driver.findElements(By.tagName("a"));
int  count = countoflinks.size();
System.out.println(count);



	}

}
