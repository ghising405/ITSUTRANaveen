package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackAndForwardConcept9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver(); //launch chrome	
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //wait for at least 40 seconds to fully load the web page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //even after the page is fully loaded, wait for at least 30 seconds to load all the elements in the page. Sometimes the pictures are not visible or is broken, in that case it waits until the image is fully loaded.
		
		driver.get("https://www.google.com");  //enter url.
		
		driver.navigate().to("http://wwww.amazon.com"); //where we want to move to.
		
		
		//back and forward simulation:
		driver.navigate().back();    		//to click on back button; to come back to google.com
		
		Thread.sleep(2000); 	//waiting for 2 seconds
		
		driver.navigate().forward(); 	//move to amazon again
		
		Thread.sleep(2000); 	//waiting for 2 seconds
		
		driver.navigate().back();    		//to click on back button; to come back to google.com
		
		driver.navigate().refresh(); //this will refresh the page
		
		
		
		
	}

}
