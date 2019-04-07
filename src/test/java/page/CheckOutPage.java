package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseConfig.GenericUtils;
import stepDefinitions.Hooks;

public class CheckOutPage extends GenericUtils{
	
	WebDriver driver;
	final long TIMESECONDS = 60;
	
	@FindBy(xpath="//a[contains(text(),'Save For Later')]")
	WebElement saveForLateLink;
	
	@FindBy(xpath="//p[@class='save-for-later-message']")
	WebElement saveItemMessage;
	
	
	public CheckOutPage() {
		driver=Hooks.driver;
		PageFactory.initElements(driver,this);
	}
	
	//clicks on Save for Later link
	public void clickSaveForLater() {
		explicitWait(saveForLateLink, TIMESECONDS);
		saveForLateLink.click();
	}
	
	//Verify whether Item saved message is displayed
	public boolean verifyOneItemSavedIsDisplayed() {
		explicitWait(saveItemMessage, TIMESECONDS);
		return saveItemMessage.isDisplayed();
	}

}
