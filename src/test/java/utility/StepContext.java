package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjct.PageObjectmanager;


public class StepContext {
	public WebDriver driver;
	public String landingPageValue;
	public PageObjectmanager pageObjecManager;
	public TestBase driverInitializer;
	public GenericUtlity genericClass;
	
	public StepContext() throws IOException {
		driverInitializer=new TestBase();
		driver=driverInitializer.webDriverManager();
		genericClass=new GenericUtlity(driver);
		pageObjecManager=new PageObjectmanager(driver);
		
	}
	
	

}