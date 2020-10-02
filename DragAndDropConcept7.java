package SeleniumSessions;

/*
 * Frames are not available in new applications according to W3C standard. 
 * driver.switchTo().frame(0); write this code only if the frame is present, otherwise we don't have to write. 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0); //frame=0 because there is only 1 frame i.e only 1 iframe in the view page source. It will switch from page to frame
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))  //xpath of source; the thing we want to drag
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))) //xpath of target; location where we want to drop
		.release() //will leave the source object
		.build()	//action
		.perform();
		
		Thread.sleep(3000);
	
		driver.quit();

	}

}
