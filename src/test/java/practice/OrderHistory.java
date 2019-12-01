package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderHistory {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		//public static void login() {
		
		driver.get("https://demo.iscripts.com/multicart/demo/index.php");
		driver.findElement(By.id("dLabellogin")).click();
		driver.findElement(By.id("username")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("pass");
		driver.findElement(By.id("jqLogin")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"drp_div\"]/ul/li/div/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"item_details\"]/div[3]/div[1]/div/div[1]/a")).click();
		List<WebElement> status = driver.findElements(By.xpath("//tr[@class='ordheads_table_list']//td[5]"));
		//*[@id="dLabel"]/span
		
		for (WebElement status1 : status) {
			String stsStatus = status1.getText() ;
			System.out.println(stsStatus);
		}
		
		
		
		//driver.findElement(By.xpath("//*[@id=\\\"drp_div\\\"]/ul/li/div/div[1]/a")).click();
		driver.close();
	}
	

}	


