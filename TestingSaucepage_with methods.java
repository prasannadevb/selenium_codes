package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingSaucepage {
	
	static WebDriver driver=null;
	
		static void loginpage() {
		
		
		 driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement usernamebox = driver.findElement(By.id("user-name"));
		usernamebox.sendKeys("standard_user");

		WebElement passwordbox = driver.findElement(By.name("password"));
		passwordbox.sendKeys("secret_sauce");
		
		WebElement loginBtn = driver.findElement(By.name("login-button"));
		loginBtn.click();
	
	}
	
		static void addtocart() {
		
		
		WebElement openproduct1 = driver.findElement(By.id("item_4_title_link"));
		openproduct1.click();
		
		
		WebElement addtocartBtn1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addtocartBtn1.click();
		
		WebElement backtoproductBtn = driver.findElement(By.id("back-to-products"));
		backtoproductBtn.click();
		
		WebElement openproduct2 = driver.findElement(By.id("item_3_title_link"));
		openproduct2.click();
		
		
		WebElement addtocartBtn2 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		addtocartBtn2.click();
		
	}
	
	static void viewingcart() {
		
		
		
		
		WebElement viewcartBtn = driver.findElement(By.className("shopping_cart_badge"));
		viewcartBtn.click();
		
	}
	
	static void checkingout() {
		
		
		WebElement chkoutBtn = driver.findElement(By.id("checkout"));
		chkoutBtn.click();
		
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("Bindu");
		
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("PDK");
		
		WebElement zipcode = driver.findElement(By.id("postal-code"));
		zipcode.sendKeys("19341");
		
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		
	}
	static void checkout()  {
		
		
		WebElement finishBtn = driver.findElement(By.id("finish"));
		finishBtn.click();
		
		WebElement backhomeBtn = driver.findElement(By.id("back-to-products"));
		backhomeBtn.click();
		
	}
	static void logout() {
		
		WebElement menuBtn  = driver.findElement(By.id("react-burger-menu-btn"));
		menuBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));
		
	    WebElement logoutBtn  = driver.findElement(By.id("logout_sidebar_link"));
		logoutBtn.click();
		
	}

			

	public static void main(String[] args) throws InterruptedException {
		
		loginpage();
		addtocart();
		viewingcart();
		checkingout();
		checkout();
		logout();
		
		
			

	}

}
