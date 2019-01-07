package runners;

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
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report3.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/report3.html"})

public class Test_Extent_Report_Scenario_Runner {

}
