package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjct.VegieSearchPageObject;
import utility.StepContext;

public class VegieSeachStepDefinition {
	StepContext stepContext; 
	
	public VegieSeachStepDefinition(StepContext stepContext) {
		this.stepContext=stepContext;
	}
	
	@Given("user is on greencart landing page")
	public void user_is_on_greencart_landing_page() {

	}
	@When("^user seached with shortname (.+)and get the actual name of the product$")
	public void user_seached_with_shortname_and_get_the_actual_name_of_the_product(String serachVegie) throws InterruptedException {
		VegieSearchPageObject vegSearch= stepContext.pageObjecManager.landingPageObject();
		vegSearch.searchItem(serachVegie);
	    Thread.sleep(2000);
	   stepContext.landingPageValue=vegSearch.getItem().split("-")[0].trim();
	}
	
}

