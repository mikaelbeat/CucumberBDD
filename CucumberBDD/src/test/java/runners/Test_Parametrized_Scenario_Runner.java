package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				dryRun = false,
				features = {"src/test/java/parametrized_scenario/parametrizedScenarios.feature"},
				glue = {"parametrized_scenario"},
				plugin = {"pretty", 
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report8.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/report8.html"})

public class Test_Parametrized_Scenario_Runner {

}
