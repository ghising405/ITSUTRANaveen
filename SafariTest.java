package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver"); we don't need this
		WebDriver driver = new SafariDriver();
		driver.get("http://wwww.facebook.com");
		System.out.println(driver.getTitle());
		
	}

}
