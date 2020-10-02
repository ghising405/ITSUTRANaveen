package SeleniumSessions;

/*
 * there are 8 types of locators.
 * xpath, id, name, linkText, partialLinkText, cssSelector, class
 * the best ones are: 1.id ; 2. xpath and cssSelector. 3. name
 * for links: linkText  
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch google chrome
		driver.get("https://reg.ebay.com/reg/PartialReg?acntType=personal");   //enter url
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Tom");
		
	}

}
