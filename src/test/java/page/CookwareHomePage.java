package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseConfig.GenericUtils;
import stepDefinitions.Hooks;



public class CookwareHomePage extends GenericUtils {
	
	public WebDriver driver;
	final long TIMESECONDS = 60;
	
	
	@FindBy(linkText="Cookware")
	WebElement cookwareLink;
	
	@FindBy(partialLinkText="Tea Kettles")
	WebElement teaKettleLink;
	
	public CookwareHomePage() {
		driver=Hooks.driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Click on Cookware link
	public void clickCookware() {
		
		explicitWait(cookwareLink, TIMESECONDS);
		hoverToElement(cookwareLink);
//		cookwareLink.click();
		
	}
	
	//click on Tea Kettle
	public void clickTeaKettleOption() {
		
		explicitWait(teaKettleLink, TIMESECONDS);
		teaKettleLink.click();
	}
	
}