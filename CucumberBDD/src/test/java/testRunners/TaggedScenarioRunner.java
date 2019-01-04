package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				dryRun = false,
				tags = {"@Smoke"},
				features = {"src/test/java/tagged_scenario/taggedScenarios.feature"},
				glue = {"tagged_scenario"},
				plugin = {"pretty", 
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report.json"})

public class TaggedScenarioRunner {

}


/*

	tags = {"@Smoke"} -> @Smoke tagged scenarios are run
	tags = {"@Smoke", "@Regression"} -> Tests which have both tags are run -> AND condition
	tags = {"@Smoke, @Regression"} ->  Test with @Smoke or @Regression tags are run -> OR condition


*/