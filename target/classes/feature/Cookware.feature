Feature: Cookware 
#Author: Abhijeet Singh

@Test
Scenario Outline: Checkout Tea Kettle and verify the cart is saved 
	Given user launchs "<url>" 
	When user clicks on cookware link 
	And selects Tea kettles from the list of options 
	And user selects first Tea kettle product 
	And user clicks on Add to cart 
	And user clicks on Checkout button on the popup 
	And click on Save for later 
	Then verify the product is saved 
	
	Examples: 
		|url|
		|cookwareURL|
 