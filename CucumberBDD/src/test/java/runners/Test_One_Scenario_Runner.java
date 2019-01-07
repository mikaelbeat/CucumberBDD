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
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report7.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/report7.html"})

public class Test_One_Scenario_Runner {

}
