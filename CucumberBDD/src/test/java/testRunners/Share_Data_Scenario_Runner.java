package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				dryRun = false,
				features = {"src/test/java/shareData_scenario/shareDataScenarios.feature"},
				glue = {"shareData_scenario"},
				plugin = {"pretty", 
						 "html:target/shareData_scenario/cucumber-htmlreport",
						 "json:target/shareData_scenario/cucumber-report.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/shareData_scenario/report.html"})

public class Share_Data_Scenario_Runner {

}


/*

	tags = {"@Smoke"} -> @Smoke tagged scenarios are run
	tags = {"@Smoke", "@Regression"} -> Tests which have both tags are run -> AND condition
	tags = {"@Smoke, @Regression"} ->  Test with @Smoke or @Regression tags are run -> OR condition


*/