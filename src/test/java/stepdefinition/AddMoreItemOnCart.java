package stepdefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjct.AddMoreItemOnCartPageObject;
import utility.StepContext;

public class AddMoreItemOnCart {
	public StepContext stepContext;
	public AddMoreItemOnCartPageObject addmorItem;
	
	public AddMoreItemOnCart(StepContext stepContext) {
		this.stepContext=stepContext;
	}
	
	@Given("user is on greencart landing page and add search the vegetable {string}")
	public void user_is_on_greencart_landing_page_and_add_search_the_vegetable(String vegetable) {
		addmorItem=stepContext.pageObjecManager.addmoreItemOnCart();
		addmorItem.searchItem(vegetable);
		stepContext.genericClass.explicitWait(2);
		stepContext.landingPageValue= stepContext.landingPageValue=addmorItem.getItem().split("-")[0].trim();
		stepContext.genericClass.explicitWait(2);
	}
	@When("user get the searcher Item and add additional 3Kg in the cart and click on Addtocart Button")
	public void user_get_the_searcher_item_and_add_additional_3kg_in_the_cart() {
		addmorItem.addMore3KgInTheCart();
	}
	@When("user can click the proceed to checkout button")
	public void user_can_click_the_proceed_to_checkout_button() {
		addmorItem.addCartIconClickAndCheckout();
		stepContext.genericClass.explicitWait(4);
	}
	@Then("user seach the same Vegetable name, appy and place order in offer page to check if product is realy displayed")
	public void user_seach_the_same_vegetable_name_appy_and_place_order_in_offer_page_to_check_if_product_is_realy_displayed() {
	   String cartPageValue=addmorItem.getItem().split("-")[0].trim();
	   
	   assertEquals(stepContext.landingPageValue, cartPageValue);
	   addmorItem.verifyDetails();
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
	}
		
	}

}
