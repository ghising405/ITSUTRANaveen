/*
 * package SeleniumSessions;
 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;
import com.sun.tools.sjavac.pubapi.PubApi;

public class JavaScriptExecutorConcept13 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/"); //enter url
		
		//login to the account
		
		driver.findElement(By.name("email")).sendKeys("seleniumautomation49@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("ITSutra7");
		
		//driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();  for this program we will not log in
		
		
		
		
	
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		
		
		
	}

}

*/