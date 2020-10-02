package SeleniumSessions;


/*
 * type="file" should be present for Browse/ AttachFile / UploadFile buttons.
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/"); 
		
		//to click on choose file / browse button
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("/Users/neeraghisingtamang/Downloads/Alisha.xlsx");
		
		

	}

}
