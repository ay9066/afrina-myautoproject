package myautoproject.testrunner;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import myautoproject.pages.HomePage;
import myautoproject.pages.MyAccountPage;
import myautoproject.pages.OrderPage;
import myautoproject.pages.RegPage;

public class SmokeTestWithTestNG extends TestBase{
	
	
//	@Test
//	public void login() {
//		this.createDriverWith("chrome");
//		WebDriver driver = this.getWebDriver();
//		
//		home = new HomePage(driver);
//		home.gotoHomePage();
//		home.loginTest();
//		
//		
//		String actualProfileName = home.getProfileNameLabel();
//		Assert.assertEquals(actualProfileName,  "JAMES WILLIAMS","Failed To FInd Proper Profile Name ");
//		
//	}
//		@Test
//		public void logOut() {
//
//			this.createDriverWith("chrome");  // This Function has the power of creating the new driver 
//			WebDriver driver = this.getWebDriver();
//			
//			
//			home = new HomePage(driver); 
//			home.gotoHomePage();
//
//			
//			home.loginTest();
//			home.logOutTest();
//			String actualProfileName = home.getProfileNameLabel();
//			Assert.assertEquals(actualProfileName, "NULL","Failed Login Doesn't Happend");
//		}
		@Test
		public void signUP() {

			createDriverWith("chrome");  // This Function has the power of creating the new driver 

			WebDriver driver = this.getWebDriver();
			home = new HomePage(driver); 
			home.gotoHomePage();
			
			
			home.takeMeToSignUpPage();
			RegPage regPage = new RegPage(driver);
			Random rand = new Random(); 
			int regNumber = rand.nextInt(1000);
			regPage.completeRegistrationWith("mrabc"+regNumber+"@gmail.com","mrabc"+regNumber,"MR","ABC"+regNumber);		
			String actualProfileName = home.getProfileNameLabel();
			Assert.assertEquals(actualProfileName.toLowerCase(),"MR ABC".toLowerCase()+regNumber,"Failed To FInd Proper Profile Name After Registration");
		}
		@Test
		public void myAccount() {
			
			createDriverWith("chrome");   
			WebDriver driver = this.getWebDriver();
			home = new HomePage(driver); 
			home.gotoHomePage();

			
			home.loginTest("user","pass");
			home.takeMeToMyAccountPage();		
			MyAccountPage myaccount = new MyAccountPage(driver);
			String actualMyAccount = myaccount.getMyAccountLabel();		
			Assert.assertEquals(actualMyAccount,"My Account","Failed to go to my Account");
		}
		
		public void orderList() {
			createDriverWith("chrome");   
			WebDriver driver = this.getWebDriver();
			home = new HomePage(driver); 
			home.gotoHomePage();

			
			home.loginTest("user","pass");
			home.takeMeToMyAccountPage();		
			OrderPage order = new OrderPage(driver);
		    List<String> actualOrderOptions = order.getAllOptions();
		    
		    
		    
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	


