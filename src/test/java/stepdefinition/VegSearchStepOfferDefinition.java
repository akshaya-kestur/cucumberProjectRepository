package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageobjct.VegSeachOfferPageObject;
import utility.StepContext;

public class VegSearchStepOfferDefinition {
	String offerPageValue;
	StepContext stepContext;

	public VegSearchStepOfferDefinition(StepContext stepContext) {
		this.stepContext = stepContext;
	}

	@Then("^user seach the same (.+) in offer page to check if product is realy exist$")
	public void user_seach_the_same_shotname_in_offer_page_to_check_if_product_is_realy_exist(String productname)
			throws InterruptedException {
		VegSeachOfferPageObject offerpage=stepContext.pageObjecManager.offerPageObject();
		offerpage.topDealClick();
		stepContext.genericClass.switchToLatestWindow();
		offerpage.searchItem(productname);
		Thread.sleep(6000);
		offerPageValue = offerpage.getItem();

		Assert.assertEquals(stepContext.landingPageValue, offerPageValue);


	}
	
}

