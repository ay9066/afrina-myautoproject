package myautoproject.testrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import myautoproject.pages.HomePage;

public class TestBase {
	
	HomePage home;
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public WebDriver getWebDriver() {
		return driver.get();
		
	}
	
	public void createDriverWith(String browser) {	
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("/usr/local/bin/")+ "/chromedriver");
			driver.set(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+ "/geckoDriver");
			driver.set(new FirefoxDriver());
		}
	}
	 @BeforeTest 
	  public void testStartup() {
	  System.out.println("Test Started ......."); }
	  
	  @BeforeMethod 
	  public void rampUP() {
	  System.out.println("Browser SHould Start Here .. Ramping UP "); }
	  
	  @AfterMethod 
	  public void rampDown() { // driver.close(); 
		  driver.get().quit();
	  
	  System.out.println("Browser Should Close Here "); }
	  
	  @AfterTest 
	  public void testCOmpleted() {
	  System.out.println("Test COmplete ......."); }
	 


	

}
