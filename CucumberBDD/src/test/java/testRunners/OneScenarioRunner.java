package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				features = {"src/test/java/one_scenario/oneScenario.feature"},
				glue = {"one_scenario"},
				plugin = {"pretty", 
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report.json"})

public class OneScenarioRunner {

}
