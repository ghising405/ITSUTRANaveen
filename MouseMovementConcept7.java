package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		driver.get("https://jqueryui.com/droppable/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform(); //hovers mouse to contribute
		
		Thread.sleep(3000);  //then waits for 3 seconds
		 
		driver.findElement(By.linkText("CLA")).click(); //and then will click on CLA link.
		
		
		
	}

}
