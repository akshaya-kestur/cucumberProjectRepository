package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utility.StepContext;

public class Hooks {
	public StepContext stepContext;
	public Hooks(StepContext stepContext) {
		this.stepContext=stepContext;
	}
	@After
	public void closeBrowser() throws IOException {
		stepContext.driverInitializer.webDriverManager().quit();
	}
	
	@AfterStep
	public void takeFailedScreenshots(Scenario scenario) throws IOException {
		WebDriver driver=stepContext.driverInitializer.webDriverManager();
		if(scenario.isFailed()) {
			File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] files=FileUtils.readFileToByteArray(screenshot);
			scenario.attach(files, "image/png", "image");
		}

	}
}

