package pageobjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VegSeachOfferPageObject {
	WebDriver driver;
	
	public VegSeachOfferPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	private By search=By.xpath(".//input[@type='search']");
	private By Productname=By.xpath(".//table[@class='table table-bordered']//td");
	private By TopDealClick=By.linkText("Top Deals");
	
	public void searchItem(String serachVegie) {
		driver.findElement(search).sendKeys(serachVegie);
	}
	
	public String getItem() {
		return driver.findElement(Productname).getText();
	}
	
	public void topDealClick() {
		driver.findElement(TopDealClick).click();
	}

}

