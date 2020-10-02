package SeleniumSessions;

/* steps: customized xpath:  //  htmltag [ @ id = 'gh-ac']
 * 
 * steps: with contains: "// input [ contains ( @ id , 'gh-ac' )]"
 * 
 * starts-with:
 * id = test_456
 * id = test_789
 * id = test_test_7890_test
 * 
 * ends-with:
 * id = 1234_test_t
 * id = 23456_test_t
 * id = 6789_test_t
 * 
 * Never use absolute xpath (not recommended): //*[@id='headersearchbar']/div/div[2]/table/tbody/tr/td[2]/input
 *  
 * make sure to make very reliable and robust xpath.
 *
*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.half.ebay.com/"); //enter url
		
		//using customized xpath to inspect the search box: with html tag = input
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
		
		//customized xpath with contains
		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("Java"); //id='gh-ac'
		
		//dynamic id: id that keeps on changing every time
		//id = test_123; when executed next time 
		//id = test_456;
		//id = test_788;
		//to handle this problem we use contains function.
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_']")).sendKeys("test"); //eg. test_
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("test"); //test_test_7890_test ; 1234_test_t
		//to know what to use (starts with or ends with); we have to check the pattern of the id value.
		
		//creating own xpath to click on a link.
		//all the links are represented by <a> html tag.
		//driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
		
		//to click on sell with customized xpath
		driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click(); //Sell case sensitive. link words should be exactly same as in website.
		
		
		
		
		
		
		

	}

}
