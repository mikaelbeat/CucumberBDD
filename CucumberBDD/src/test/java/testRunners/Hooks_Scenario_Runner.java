package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				dryRun = false,
				features = {"src/test/java/hooks_scenario/hooksScenarios.feature"},
				glue = {"hooks_scenario"},
				plugin = {"pretty", 
							 "html:target/hooks_scenario/cucumber-htmlreport",
							 "json:target/hooks_scenario/cucumber-report.json,",
							 "com.cucumber.listener.ExtentCucumberFormatter:target/hooks_scenario/report.html"})

public class Hooks_Scenario_Runner {

}


/*

	tags = {"@Smoke"} -> @Smoke tagged scenarios are run
	tags = {"@Smoke", "@Regression"} -> Tests which have both tags are run -> AND condition
	tags = {"@Smoke, @Regression"} ->  Test with @Smoke or @Regression tags are run -> OR condition


*/