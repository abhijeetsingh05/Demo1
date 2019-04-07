package stepDefinitions;

import org.openqa.selenium.WebDriver;

import BaseConfig.GenericUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.AddCartPage;
import page.CheckOutPage;
import page.CookwareHomePage;
import page.TeaKettlesPage;

public class CookwareSD {
	
	public WebDriver driver;
	AddCartPage addCartPage = new AddCartPage();
	CheckOutPage checkOutPage = new CheckOutPage();
	CookwareHomePage cookwareHomePage = new CookwareHomePage();
	TeaKettlesPage teaKettlesPage = new TeaKettlesPage();
	
	
	public CookwareSD() {
		driver = Hooks.driver;
	}
	
	
	
	@Given("^user launchs \"([^\"]*)\"$")
	public void user_launchs(String url) throws Throwable {
	    driver.get(GenericUtils.getProperty(url));
	    
	}

	@When("^user clicks on cookware link$")
	public void user_clicks_on_cookware_link() throws Throwable {
	    cookwareHomePage.clickCookware();
	}

	@When("^selects Tea kettles from the list of options$")
	public void selects_Tea_kettles_from_the_list_of_options() throws Throwable {
	    cookwareHomePage.clickTeaKettleOption();
	    
	}

	@When("^user selects first Tea kettle product$")
	public void user_selects_first_Tea_kettle_product() throws Throwable {
	    teaKettlesPage.clickOnFirstProduct();
	    
	}

	@When("^user clicks on Add to cart$")
	public void user_clicks_on_Add_to_cart() throws Throwable {
	    addCartPage.clickOnAddToCart();
	    
	}

	@When("^user clicks on Checkout button on the popup$")
	public void user_clicks_on_Checkout_button_on_the_popup() throws Throwable {
	    addCartPage.clickOnCheckOut();
	    
	}

	@When("^click on Save for later$")
	public void click_on_Save_for_later() throws Throwable {
	    
	    checkOutPage.clickSaveForLater();
	}

	@Then("^verify the product is saved$")
	public void verify_the_product_is_saved() throws Throwable {
		
		Assert.assertTrue("Item Saved message is displayed", checkOutPage.verifyOneItemSavedIsDisplayed());
	    
	    
	}


	
	
}
