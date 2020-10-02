package SeleniumSessions;

/*
 * follow these steps: write these steps every time.
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept7 {

	public static void main(String[] args) {
		
		//write these things every time.
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver(); //launch chrome	
		driver.get("https://www.ebay.com/");  //enter url
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //wait for at least 40 seconds to fully load the web page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //even after the page is fully loaded, wait for at least 30 seconds to load all the elements in the page. Sometimes the pictures are not visible or is broken, in that case it waits until the image is fully loaded.
		
		
		
		
		
		
	}

}
