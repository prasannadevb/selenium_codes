package seleniumExample;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.AcceptAlert;
import org.openqa.selenium.remote.server.handler.GetAlertText;



public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bindu\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
      //click the button to display the alertbox
		//WebElement button = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		//button.click();
		//Alert alertbox = driver.switchTo().alert();
		//alertbox.accept();
		//click the button to display a confirm box
		//WebElement display = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		//display.click();
		//Alert confirmbox = driver.switchTo().alert();
		//confirmbox.dismiss();
		//click the button to display a prompt box
		//WebElement prompt = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		//prompt.click();
		//Alert promptbox = driver.switchTo().alert();
		//promptbox.sendKeys("navil");
		//System.out.println(promptbox);
		//promptbox.accept();
		//click the button to learn line-breaks in a comment
		//WebElement linebreak = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
		//linebreak.click();
		//Alert linebreaks = driver.switchTo().alert();
		//linebreaks.accept();
		//click the below button and click ok
		WebElement belowbutton = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
		belowbutton.click();
		/*
		 * String popup = driver.getWindowHandle(); popup.chars();
		 */
		WebElement popups = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button"));
		popups.click();
		
		
		 // switch to popup window

		// Now you are in the popup window, perform necessary actions here
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
