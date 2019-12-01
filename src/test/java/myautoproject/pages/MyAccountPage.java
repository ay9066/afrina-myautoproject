package myautoproject.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends MasterPage{
	
	
	String myAccountLabel="XPATH://*[@id=\"item_details\"]/section/div/h3";
	String locatoreAllOptions="XPATH://*[@id=\\\"item_details\\\"]/div[3]/div[1]";
	
	public  MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public String getMyAccountLabel() {
		return getElementText(myAccountLabel);
	}
	
	
	public List<String> getAllOptions(){
		return getElementsText(locatoreAllOptions);
	}
	
	
	

}
