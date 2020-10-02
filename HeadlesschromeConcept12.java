package SeleniumSessions;

/*
 * HtmlUnitDriver: 
 * it is not available in selenium 3.x version (selenium 3 onwards)
 * we have to download htmlUnitDriver jar
 * Advantages:
 * testing is happening behind the scene (i.e there is no browser launching)
 * very fast execution of test cases
 * improved performance.
 * 
 * limitations:
 * cannot automate Actions class like mouseMovement, doubleClick, drag and drop.
 * Also called Ghost driver or headless browser
 * 
 * Types of Headless browser:
 * HtmlUnitDriver --- Java
 * PhantomJS --- JavaScript
 * 
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
	//import org.openqa.selenium.htmlunit.HtmlUnitDriver; didn't use this.

public class HeadlesschromeConcept12 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		
		//launch headless chrome --- this works perfectly.

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options); //launch chrome	
		
		
		//WebDriver driver = new ChromeDriver(); //launch chrome	
		
		
		//WebDriver driver = new HtmlUnitDriver();  //this will print the title without opening any browser / without launching chrome. 
		//says deprecated but not sure. but this test case doesn't run with HtmlUnitDriver().
		
		
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //wait for at least 40 seconds to fully load the web page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //even after the page is fully loaded, wait for at least 30 seconds to load all the elements in the page. Sometimes the pictures are not visible or is broken, in that case it waits until the image is fully loaded.
		
		driver.get("https://ui.freecrm.com/");  //enter url.
		
		System.out.println("The title before login is : "+ driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("seleniumautomation49@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("ITSutra7");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		System.out.println("The title after login is : " +driver.getTitle());
		
		driver.close();
		
		driver.quit();
		
		
		
	}

}
