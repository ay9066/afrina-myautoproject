package mct.cuck.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myautoproject.pages.HomePage;

public class Login_Step extends Base_steps{


	
	
	

	@Given("User is on MCT home page")
	public void user_is_on_MCT_home_page() {

		driver = new ChromeDriver();

		testHome = new HomePage(driver);
		testHome.gotoHomePage();

	}

	@When("User complete login with id {string} password {string}")
	public void user_complete_login_with_id_password(String id, String password) {

		testHome.loginTest(id, password);
	}

	@Then("User see  profile name as {string}")
	public void user_see_profile_name_as(String expectedprofileName) {

		String actualProfileName = testHome.getProfileNameLabel();
		Assert.assertEquals( actualProfileName.toLowerCase(),expectedprofileName.toLowerCase(),"Failed To FInd Proper Profile Name ");
        
	
	}
	@Before
	public void rampUp() {
		System.out.println("Ramp Up Started...........");
		
	}
	
	@After
	public void rampDown() {
		driver.close();
	}
	
	
	
	

}
