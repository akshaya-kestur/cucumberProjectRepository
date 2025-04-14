package testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failedstep.txt", glue = "stepdefinition", tags = "@landingpage or @offerpage", plugin = {
		"html:target/cocumberreport.html", "json:target/cocumberreport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failedstep.txt" })
public class FailedTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}