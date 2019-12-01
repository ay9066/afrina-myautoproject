package myautoproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage {

	String loginLink = "XPATH://*[@id=\"dLabellogin\"]/span";
	String usernameField = "ID:username";
	String passwordField = "ID:password";
	String loginButton = "ID:jqLogin";
	String signUpButton = "ID:jqSignup";
	String profileNameLabel = "XPATH://*[@id=\"dLabel\"]/span";
	String logOutButtonLink = "XPATH://*[@id=\"drp_div\"]/ul/li/div/div[3]/a";
	String myAccountLink = "XPATH://*[@id=\"drp_div\"]/ul/li/div/div[1]/a";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void gotoHomePage() {
		gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
	}

	public void loginTest(String user,String password) {
		clickElement(loginLink);
		typeElement(usernameField, user);
		typeElement(passwordField, password);
		clickElement(loginButton);

	}

	public String getProfileNameLabel() {
		return getElementText(profileNameLabel);

	}

	public void logOutTest() {
		clickElement(profileNameLabel);
		clickElement(logOutButtonLink);

	}

	public void takeMeToSignUpPage() {
		clickElement(loginLink);
		clickElement(signUpButton);

	}

	public void takeMeToMyAccountPage() {
		clickElement(profileNameLabel);
		clickElement(myAccountLink);

	}

	public void closeBrowser() {
		super.closeBrowser();
	}

}
