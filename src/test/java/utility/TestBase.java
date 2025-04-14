package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver webDriverManager() throws IOException {
		if (driver == null) {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String url = prop.getProperty("QaUrl");
			String propbrowser = prop.getProperty("browser");
			String mavenBrowser=System.getProperty("browser");
			String browser=mavenBrowser !=null?mavenBrowser:propbrowser;
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
		}
		return driver;
	}

}
