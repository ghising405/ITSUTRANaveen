package SeleniumSessions;

/*
 * Take Screenshot of WebElement in Selenium - Method -1 || New Selenium 4 feature
 * https://www.youtube.com/watch?v=7Cv9zXQqjkw
 */

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeElementScreenshotConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		WebElement forgotPwd = driver.findElement(By.linkText("Forgot my password"));
		
		email.sendKeys("naveen@gmail.com");
		password.sendKeys("test@123");
		
		
		takeElementScreenshot(email, "emailElement");
		takeElementScreenshot(password, "passwordElement");
		takeElementScreenshot(loginButton, "loginButtonElement");
		takeElementScreenshot(forgotPwd, "forgotPwdLink");
		
		
		driver.quit();
		
	
	}
	
	public static void takeElementScreenshot(WebElement element, String fileName) {
		
		File srcFile =element.getScreenshotAs(OutputType.FILE);  //takes screenshot and stores it as a file format in srcFile
		
		try {
			FileUtils.copyFile(srcFile, new File("/Users/neeraghisingtamang/eclipse-workspace/SeleniumNaveen/src/screenshots/"+fileName+".jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		
		}

	}
	
	
	
	

}
