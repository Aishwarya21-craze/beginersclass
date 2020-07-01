package utiity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webelemntcommands {

	public  void click_xpath(String xpath_locators,WebDriver driver) {
		driver.findElement(By.xpath(xpath_locators)).click();
	}
	public void click_id(String xpath_locators,WebDriver driver) {
		driver.findElement(By.xpath(xpath_locators)).click();
	}
	public void click_linktext(String xpath_locators,WebDriver driver) {
		driver.findElement(By.linkText(xpath_locators)).click();
	}
	public boolean searchelement_linktext(String xpath_locators,WebDriver driver) {
		WebElement element=driver.findElement(By.linkText(xpath_locators));
		if(element.isDisplayed()) {
			return true;
		}
		return false;
	}
}
