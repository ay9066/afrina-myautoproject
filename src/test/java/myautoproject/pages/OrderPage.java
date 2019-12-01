package myautoproject.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class OrderPage extends MasterPage{
	
	String orderOption = "Xpath://tr[@class='ordheads_table_list']//td[5]";
	
	public OrderPage(WebDriver driver) {
		super(driver);
		
	}
	
	public List<String> getAllOptions(){
		
		return getElementsText(orderOption);
	}
	

}
