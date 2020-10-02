package SeleniumSessions;

/*
 * File handling:
 * hierarchy: browser > page > frame > frame has it's own web elements.
 */


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameHandling6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		
		//login with username and password 
		driver.findElement(By.name("email")).sendKeys("seleniumautomation49@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ITSutra7");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();  //not a good xpath: create own xpath
		
		Thread.sleep(3000);
		
		int size = driver.findElements(By.tagName("iframe")).size(); //to find the number of frames
		System.out.println(size);
		
		//driver.switchTo().frame(1);
		
		//Thread.sleep(2000);
		
		//customized xpath
		//driver.findElement(By.xpath("//a[contains(text(),'Contatcs')]")).click();
		
		// click on contacts 
		//driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
				
		
		
		
		
		
	}

}
