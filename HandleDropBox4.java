package SeleniumSessions;

/*
 * 1. create object of Select class.
 * 2. pass the element and their location inside the Select class as an argument.
 * 3. using select (object reference variable) call selectByVisualText() method and pass the value you want from the drop box.
 * 4. In Select class we don't perform actions like .sendKeys() and .click();
 */

import org.openqa.selenium.By;

/*
 * 1. create object of Select class
 * 2. pass driver.findElement(By.name("country")) inside Select( ) class
 * 3. object reference variable = select will call selectByVisibleText method and inside you will write what you want to select in the drop box.
 * 
 * 4. Select class will not perform actions like .sendKeys() and .click()
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDropBox4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver(); //launch google chrome
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");  //enter url 
		
		//to handle drop down box
		//creating object of Select class
		Select select = new Select(driver.findElement(By.name("country")));  //assigning the element where we want to perform an action
		
		select.selectByVisibleText("NEPAL");  //this will select united states
		
		Thread.sleep(2000);
		
		driver.quit();  //closes the browser window
		
		driver.close(); //closes everything.

		

	}

}
