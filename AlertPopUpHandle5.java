package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch google chrome
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //enter url
		
		//click on sign in button without putting any values in the empty fields.
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);  //5 seconds
		
		//after clicking the sign in button, pop up will come from background to popup screen
		Alert alert = driver.switchTo().alert();
		//alert() will be stored in alert object reference
		
		System.out.println(alert.getText()); //will get the message "please enter a valid username"
		
		
		//to check if the pop up message is correct or not: validation point
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {  //this is the actual message in the web browser pop up
			System.out.println("correct alert message");
		}else {
			System.out.println("in-correct alert message");
		}
		
		alert.accept(); //clicks on OK button in the pop up screen
		
		//alert.dismiss(); //clicks on cancel 
		
		
	
	}

}
