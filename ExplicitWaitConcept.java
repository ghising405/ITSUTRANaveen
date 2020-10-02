package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  //this is global wait
		
		driver.get("http://www.facebook.com");
		
		//calling clickOn method
		//clickOn(driver, driver.findElement(By.name("login")), 20); //it will wait for maximum 20 seconds to check login button is visible or not
		//this wait is explicitly for login button
		
		clickOn(driver, driver.findElement(By.linkText("Create a Page")),10); //for create a page link
		
		
		driver.quit();

		
	}
	
	//to provide explicit wait
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		
		new WebDriverWait(driver, timeout)
		.ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		
		locator.click();
		
	}
	
	
	
	
	

}
