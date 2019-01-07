package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				dryRun = false,
				features = {"src/test/java/multi_scenario/"},
				glue = {"multi_scenario"},
				plugin = {"pretty", 
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report5.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/report5.html"})

public class Test_Multi_Scenario_Runner {

}
