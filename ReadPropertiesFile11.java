package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertiesFile11 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException{
		
		Properties prop = new Properties();
		
		FileInputStream ip = new  FileInputStream("/Users/neeraghisingtamang/eclipse-workspace/SeleniumNaveen/src/SeleniumSessions/config.properties");
		
		prop.load(ip);
		
		
		System.out.println(prop.getProperty("name"));  
		
		System.out.println(prop.getProperty("age"));
		
		String url =prop.getProperty("url"); //prop.getProperty("url") = will read the property. and the information retrieved from config.properties will be stored in String url
		
		System.out.println(url);
		
		String browsername = prop.getProperty("browser"); 
		System.out.println(browsername);
	
		
		//initializing webdriver
		
		if(browsername.equals("chrome")) {  //since we have browser=chrome in config.properties file, chrome browser will be launched.
			System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/internetexplorerdriver");
			driver = new InternetExplorerDriver();
		}
		
		
		//enter url
		
		driver.get(url);  //it's "url" because it is already mentioned in the config.properties file
		
		//to read the key to get x-path in config.properties.
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		
	}

}
