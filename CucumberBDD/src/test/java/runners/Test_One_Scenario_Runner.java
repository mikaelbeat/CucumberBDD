package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				features = {"src/test/java/one_scenario/oneScenario.feature"},
				glue = {"one_scenario"},
				plugin = {"pretty", 
						 "html:target/one_scenario/cucumber-htmlreport",
						 "json:target/one_scenario/cucumber-report.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/one_scenario/report.html"})

public class Test_One_Scenario_Runner {

}
