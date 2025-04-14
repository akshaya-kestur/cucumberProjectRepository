package pageobjct;

import org.openqa.selenium.WebDriver;
public class PageObjectmanager {
	WebDriver driver;
	
	public PageObjectmanager(WebDriver driver) {
		this.driver=driver;
	}
	
	public VegieSearchPageObject landingPageObject() {
		return new VegieSearchPageObject(driver);
	}
	
	public VegSeachOfferPageObject offerPageObject() {
		return new VegSeachOfferPageObject(driver);
	}
	
	public AddMoreItemOnCartPageObject addmoreItemOnCart() {
		return new AddMoreItemOnCartPageObject(driver);
	}
	
	
}

