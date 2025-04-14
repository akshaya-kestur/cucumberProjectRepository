package pageobjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VegieSearchPageObject {
	WebDriver driver;
	
	public VegieSearchPageObject(WebDriver driver) {
		this.driver=driver;
	}
	

	private By search=By.xpath(".//input[@type='search']");
	private By Productname=By.xpath(".//h4[@class='product-name']");
	
	public void searchItem(String serachVegie) {
		driver.findElement(search).sendKeys(serachVegie);
	}
	
	public String getItem() {
		return driver.findElement(Productname).getText();
	}
}
