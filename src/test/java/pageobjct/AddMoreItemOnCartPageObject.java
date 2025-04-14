package pageobjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddMoreItemOnCartPageObject {
	
	public WebDriver driver;
	
	public AddMoreItemOnCartPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	private By search=By.xpath(".//input[@type='search']");
	private By Productname=By.xpath(".//p[@class='product-name'] |.//h4[@class='product-name']");
	private By incrementButton=By.xpath(".//a[@class='increment']");
	private By AddToCartButton=By.xpath(".//button[text()='ADD TO CART']");
	private By AddCartIcon=By.xpath(".//img[@alt='Cart']/parent::a");
	private By proceedtoCheckout=By.xpath(".//button[text()='PROCEED TO CHECKOUT']");
	private By applyButton=By.xpath(".//button[text()='Apply']");
	private By placeORderButton=By.xpath(".//button[text()='Place Order']");
	
	public void searchItem(String serachVegie) {
		driver.findElement(search).sendKeys(serachVegie);
	}
	public String getItem() {
		return driver.findElement(Productname).getText();
	}
	
	public void addMore3KgInTheCart() {
		for(int i=0;i<3;i++) {
			driver.findElement(incrementButton).click();
		}
		driver.findElement(AddToCartButton).click();
	}
	
	public void addCartIconClickAndCheckout() {
		driver.findElement(AddCartIcon).click();
		driver.findElement(proceedtoCheckout).click();
		
	}
	
	public void verifyDetails() {
		driver.findElement(applyButton).isDisplayed();
		driver.findElement(placeORderButton).isDisplayed();
	}

}

