package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				dryRun = false,
				features = {"src/test/java/extentReport_scenarios/extentReportScenarios.feature"},
				glue = {"extentReport_scenarios"},
				plugin = {"pretty", 
						 "html:target/extentReport_scenarios/cucumber-htmlreport",
						 "json:target/extentReport_scenarios/cucumber-report.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/extentReport_scenarios/report.html"})

public class Extent_Report_Scenario_Runner {

}
