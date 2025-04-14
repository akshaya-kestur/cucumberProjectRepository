package utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtlity {
	public WebDriver driver;
	
	public GenericUtlity(WebDriver driver) {
		this.driver=driver;
	}
	
	public void switchToLatestWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);
	}
	
	public void explicitWait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

