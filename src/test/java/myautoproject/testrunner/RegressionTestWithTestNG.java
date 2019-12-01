package myautoproject.testrunner;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import myautoproject.pages.HomePage;
import myautoproject.pages.MyAccountPage;

public class RegressionTestWithTestNG extends TestBase {

	@Test
	public void myAccountOptions() {

		createDriverWith("chrome"); // This Function has the power of creating the new driver

		WebDriver driver = this.getWebDriver();
		home = new HomePage(driver);
		home.gotoHomePage();

		home.loginTest("user","pass");
		home.takeMeToMyAccountPage();

		MyAccountPage myaccount = new MyAccountPage(driver);
		List<String> actualOptionResult = myaccount.getAllOptions();

		List<String> expOptionResult = new ArrayList<>();
		expOptionResult.add("My Orders");
		expOptionResult.add("Profile");
		expOptionResult.add("My Return Requests");
		expOptionResult.add("Change Password");
		expOptionResult.add("My Favorite Products");
		expOptionResult.add("My Favorite Sellers");
		expOptionResult.add("My Seller Dashboard");

		//Assertassert(actualOptionResult, equals(expOptionResult));

	}

}
