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
						 "html:target/parametrized_scenario/cucumber-htmlreport",
						 "json:target/parametrized_scenario/cucumber-report.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/parametrized_scenario/report.html"})

public class Test_Parametrized_Scenario_Runner {

}
