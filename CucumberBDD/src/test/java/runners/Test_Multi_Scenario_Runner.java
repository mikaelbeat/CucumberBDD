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
						 "html:target/multi_scenario/cucumber-htmlreport",
						 "json:target/multi_scenario/cucumber-report.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/multi_scenario/report.html"})

public class Test_Multi_Scenario_Runner {

}
