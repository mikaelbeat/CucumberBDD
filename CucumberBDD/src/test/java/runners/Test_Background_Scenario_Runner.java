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
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report1.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/report1.html"})

public class Test_Background_Scenario_Runner {

}
