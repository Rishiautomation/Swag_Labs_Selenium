package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestCases.BaseClass;
import junit.framework.Assert;

public class Homepage {
	WebDriver driver = BaseClass.driver;

	@FindBy(xpath = "//div[text()='Products']")
	WebElement ProductsText;

	@FindBy(xpath = "//span[@class='fa-layers-counter shopping_cart_badge']")
	WebElement itemsnumberAdded;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public void HomepageVerification() {

		Assert.assertTrue(ProductsText.isDisplayed());
	}

	public void AddingtoCart(String Itemname) {
		
		driver.findElement(By.xpath("//div[text()='"+Itemname+"']/ancestor::div[@class='inventory_item']//button")).click();
	}
	
	public void VerifyNumberofItemadded(int NumberofItem) {
		
		Assert.assertEquals(1, NumberofItem);
	}
	
}
