package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				dryRun = false,
				features = {"src/test/java/multiple_scenarios/multipleScenarios.feature"},
				glue = {"multiple_scenarios"},
				plugin = {"pretty", 
						 "html:target/multiple_scenarios/cucumber-htmlreport",
						 "json:target/multiple_scenarios/cucumber-report.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/multiple_scenarios/report.html"})

public class Multiple_Scenario_Runner {

}
