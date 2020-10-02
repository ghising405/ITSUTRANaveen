package SeleniumSessions;

/* 
 * https://www.youtube.com/watch?v=NAnYJcb0G40
 * https://www.youtube.com/watch?v=lJBR_pPJVlA ---> this has link to download org.apache.commons.io.FileUtils;
 * 
 * Download apache commons from : http://commons.apache.org/proper/commons-io/download_io.cgi
 *
 */

import org.apache.commons.io.FileUtils;  //need to copy screenshot in desired location
 
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakeScreenShotConcept9 {
	
	static WebDriver driver; //defining the WebDriver at class/global level so that the driver instance can be accessed anywhere.
	//making it static we can call driver (reference variable) in main method directly.

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		driver = new ChromeDriver(); //launch chrome
		
		//driver.get("https://www.facebook.com/"); 
		//takeScreenshot("Facebook_LoginPage");
		
		driver.get("http://www.google.com");
		takeScreenshot("Google_HomePage");
		
		
	}
	
	public static void takeScreenshot(String fileName) throws IOException {  //fileName = facebook.png, facebook_homepage.png, google.png, or .jpg etc.
		
		//on the basis of fileName screenshot should be generated
		//task 1: to take screenshot and store it as a file format
		
		File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		//((TakesScreenshot)driver) = (type-casting) converting driver into takeScreenshot. TakesScreenshot = interface
		//(OutputType.FILE) = we want an output which is FILE type.
		// file = where the  screenshot is stored. File=imported from java.io.File
		
		//task 2: copy the screenshot to desired location using copyFile method
		FileUtils.copyFile(file,new File("/Users/neeraghisingtamang/eclipse-workspace/SeleniumNaveen/src/screenshots/"+fileName+".jpg"));
		
		
		
		
		
	}

}
