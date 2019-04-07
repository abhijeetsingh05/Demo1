package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseConfig.GenericUtils;
import stepDefinitions.Hooks;

public class AddCartPage extends GenericUtils{
	
	public WebDriver driver;
	final long TIMESECONDS = 60;
	
	@FindBy(id="primaryGroup_addToCart_0")
	WebElement addToCartButton;
	
	@FindBy(id="anchor-btn-checkout")
	WebElement checkOutButton;
	
	public AddCartPage() {
		driver=Hooks.driver;
		PageFactory.initElements(driver, this);
	}
	
	//Clicks on Add To Cart Button
	public void clickOnAddToCart() {
		explicitWait(addToCartButton, TIMESECONDS);
		addToCartButton.click();
	}
	
	//clicks on Check Out button
	public void clickOnCheckOut() {
		explicitWait(checkOutButton, TIMESECONDS);
		checkOutButton.click();
	}
	
	

}
