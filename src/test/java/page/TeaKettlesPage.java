package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseConfig.GenericUtils;
import stepDefinitions.Hooks;

public class TeaKettlesPage extends GenericUtils{

	public WebDriver driver;
	final long TIMESECONDS = 60;
	
	//fetch first product
	@FindBy(xpath="//ul[@data-subcategory='Tea Kettles']/li[1]")
	WebElement firstProduct;
	
	public TeaKettlesPage() {
		driver=Hooks.driver;
		PageFactory.initElements(driver, this);
	}
	
	//Clicks on first product of Tea Kettles
	public void clickOnFirstProduct() {
		closeUnExpectedPopup();
		explicitWait(firstProduct, TIMESECONDS);
		firstProduct.click();
	}
	
	
}
