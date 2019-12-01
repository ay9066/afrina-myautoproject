package myautoproject.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class MasterPage {

	public WebDriver driver;

	public MasterPage(WebDriver driver) {
		this.driver = driver;

	}

	public void gotoURL(String url) {
		driver.get(url);

	}

	public void clickElement(String locatores) {
		if (locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).click();
			waitFor(1000);
		} else if (locatores.contains("XPATH")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).click();

			waitFor(1000);
		} else if (locatores.contains("NAME")) {
			driver.findElement(By.name(locatores.split(":")[1])).click();
			waitFor(1000);
		}
		

	}

	public void typeElement(String locatores, String valueTotype) {
		if (locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).sendKeys(valueTotype);
		} else if (locatores.contains("XPATH")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).sendKeys(valueTotype);

		} else if (locatores.contains("NAME")) {
			driver.findElement(By.name(locatores.split(":")[1])).sendKeys(valueTotype);
		}

	}

	public String getElementText(String locatores) {

		try {
			if (locatores.contains("ID")) {
				
				return driver.findElement(By.id(locatores.split(":")[1])).getText();
			} else if (locatores.contains("XPATH")) {
				return driver.findElement(By.xpath(locatores.split(":")[1])).getText();

			} else if (locatores.contains("NAME")) {
				return driver.findElement(By.name(locatores.split(":")[1])).getText();

			}
		} catch (Exception e) {
			return "NULL";
		}
		return "NULL";
	}

	public List<String> getElementsText(String locatorsOfElements) {

		List<String> actualOptionResultList = new ArrayList<>();

		if (locatorsOfElements.contains("XPATH")) {
			List<WebElement> alloptionsinUI = driver.findElements(By.xpath(locatorsOfElements.split(":")[1]));
			System.out.println("Total List Size " + alloptionsinUI.size());
			for (int i = 0; i < alloptionsinUI.size(); i++) {
				System.out.println(alloptionsinUI.get(i).getText());
				actualOptionResultList.add(alloptionsinUI.get(i).getText());
			}
		}

		return actualOptionResultList;
	}

	public boolean elementNotExist(String locatores) {

		try {
			if (locatores.contains("ID")) {
				return driver.findElement(By.id(locatores.split(":")[1])).isDisplayed();
			} else if (locatores.contains("Xpath")) {
				return driver.findElement(By.xpath(locatores.split(":")[1])).isDisplayed();
			} else if (locatores.contains("Name")) {
				return driver.findElement(By.name(locatores.split(":")[1])).isDisplayed();
			}
		} catch (Exception e) {
			return false;
		}

		return false;
	}

	public void waitFor(int mls) {
		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		driver.close();
	}

}
