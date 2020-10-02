package SeleniumSessions;

/* to launch firefox browser we need gecko driver.
 * WebDriver = interface; get() is already in WebDriver interface.
 * ChromeDriver is implementing WebDriver interface by getting method body from WebDriver Interface.
 * ChromeDriver is already having those methods which were available in WebDriver interface. So we don't need to create any method.But you should know which method is there.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics2 {

	public static void main(String[] args) throws Exception { 
		
		//launching Firefox browser
		//System.setProperty("webdriver.gecko.driver", "/Users/neeraghisingtamang/Downloads/geckodriver");
		//WebDriver driver = new FirefoxDriver();  //this line will launch firefox browser
		
		//to launch google.com in firefox
		
		
		//launching google Chrome browser
		//Automation: 
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver(); //launching Chrome
	
		driver.get("http://www.google.com"); //entering URL
		
		String title = driver.getTitle(); //will return string and that will be stored in string ref variable "title"
		
		System.out.println("the title of the web page is : " + title); //will print title in console
		
		
		//validation: automation testing
		
		if(title.equals("Google")) {//comparing title: if expected = actual ; test case pass
			
			System.out.println("correct title");
			
		}else {
			
			System.out.println("incorrect title");
		
		}
		
		//check and print the current url:
		
		System.out.println(driver.getCurrentUrl());
		
		//to get the page source
		
		// System.out.println(driver.getPageSource());
		
		//to quit the launched google chrome browser automatically
		
		driver.quit();
		
		
		
		
		
	}

}
