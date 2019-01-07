package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				dryRun = false,
				features = {"src/test/java/background_scenario/backgroundScenarios.feature"},
				glue = {"background_scenario"},
				plugin = {"pretty", 
						 "html:target/background_scenario/cucumber-htmlreport",
						 "json:target/background_scenario/cucumber-report.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/background_scenario/report.html"})

public class Test_Background_Scenario_Runner {

}
