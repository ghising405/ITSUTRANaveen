package SeleniumSessions;

/*
 * How to count the links and texts in it?
 * 
 */



import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElementsConcept8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/"); //enter url
		
		//count links: get the total count of links on the page
		//get the text of each link on the page.
		//all the links are represented by a tag
		List<WebElement> linkList = driver.findElements(By.tagName("a")); //link is a list of web-element
		System.out.println("the total number of link is : " + linkList.size());
		
		//get the text of each link on the page. How to iterate an  arrayList? use for loop
		for(int i = 0; i<linkList.size(); i++) {  // i=0 =>index starts from 0; linlList size = 397; comparison from 0 to 397
		String linkText	= linkList.get(i).getText(); //get(i)= gives index: 0,1,2,3,... getText(): will give texts in 0 index, 1 index, ,...
			System.out.println(linkText);	
		}
	
		
		//get the size of linkList: how many links are there?
		//System.out.println(linkList.size()); //397: all a tags will be stored in linkList and size() will give the total number of links. some links are hidden and some are visible.
		
		//count input tags:
		//List<WebElement> inputList = driver.findElements(By.tagName("input"));
		//System.out.println(inputList.size());  //6
		
		//count how many buttons
		//List<WebElement> buttonList = driver.findElements(By.tagName("button"));
		//System.out.println(buttonList.size());  //23
		
		
		

	}

}
