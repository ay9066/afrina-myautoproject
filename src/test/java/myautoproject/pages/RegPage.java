package myautoproject.pages;

import org.openqa.selenium.WebDriver;

public class RegPage extends MasterPage{
	
	String emailField = "ID:txtEmail";
	String userNameField = "ID:txtUserName";
	String passwordField = "ID:txtPassword";
	String conPasswordField = "ID:txtCnfPassword";
	String firstNameField = "ID:txtFirstName";
	String lastNameField = "ID:txtLastName";
	String addressField = "XPATH://input[@placeholder='Address *']";
	String checkBox = "NAME:check_news";
	String registrationBtn = "ID:btnRegister";
	
	public  RegPage(WebDriver driver) {
		super(driver);
	}
	
	public void completeRegistrationWith(String email,String uname,String fname,String lname) {
		typeElement(emailField,email);
		typeElement(userNameField,uname);
		typeElement(passwordField,"abc123");
		typeElement(conPasswordField,"abc123");
		typeElement(firstNameField,fname);
		typeElement(lastNameField,lname);
		typeElement(addressField,"123 4th ave");
		clickElement("checkBox");
		clickElement("registrationBtn");
		
	}
	
	

}
