package mct.cuck.stepdefination;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myautoproject.pages.MyAccountPage;

public class MyAccount_steps extends Base_steps{

	@When("I goto account page")
	public void i_goto_account_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();

		testHome.takeMeToMyAccountPage();

	}

	@Then("User see myaccount label")
	public void user_see_myaccount_label() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		testMyAccount = new MyAccountPage(driver);
		
		String actualAccountPageLabel = testMyAccount.getMyAccountLabel();
		Assert.assertEquals(actualAccountPageLabel.toLowerCase(),"my account",
				"Failed To FInd My Account Page ");

	}

	@Then("User see all myacount options in below table")
	public void user_see_all_myacount_options_in_below_table(DataTable optionTable) {
	
		
		List<String> expOptionResult  = optionTable.asList();

		List<String> getAllOptions = testMyAccount.getAllOptions();
//		expOptionResult.add("My Orders");
//		expOptionResult.add("Profile");
//		expOptionResult.add("My Return Requests");
//		expOptionResult.add("Change Password");
//		expOptionResult.add("My Favorite Products");
//		expOptionResult.add("My Favorite Sellers");
//		expOptionResult.add("My Seller Dashboard");

		Assert.assertEquals(getAllOptions, equals(expOptionResult));
	
	}

}
