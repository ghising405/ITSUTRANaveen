package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleWindowPopUp10 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Thread.sleep(2000);
		
		//Now there are two windows: parent window and child window and we have to get window ID of parent window and child window
		
		Set<String> handler =  driver.getWindowHandles();  //to get window IDs of two windows
		 
		Iterator<String> it = handler.iterator();	//iterate/print all the values inside the windows
		
		String parentWindowID= it.next(); //this moves the pointer from above the set object to the first value. therefore, it.next() will give the first value.
		
		System.out.println("The parent window ID is: " + parentWindowID);
		
		String childWindowID = it.next(); //will give child window ID
		
		System.out.println("The child window ID is: " + childWindowID);
		
		driver.switchTo().window(childWindowID); //this will switch from parent window to child window. Now the control is in child window.
		
		//get the title from child window. we can do that, because now we have switched to child window.
		
		Thread.sleep(2000);
		
		System.out.println("The child window pop up title is : " + driver.getTitle()); //will give title of the pop up page.
		
		//to close the  pop up / child window
		
		driver.close(); //driver.quit() will close both parent and child windows so we don't do driver.quit(). driver.close() will close child window
		
		//to come back to the main/ parent window we have to again switch
		
		driver.switchTo().window(parentWindowID);
		
		Thread.sleep(2000);
		
		//to make sure you are in parent window, get the title of the parent window.
		
		System.out.println("Parent window title is: " + driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
