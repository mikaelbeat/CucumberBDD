package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				dryRun = false,
				features = {"src/test/java/dataTable_scenario/dataTableScenarios.feature"},
				glue = {"dataTable_scenario"},
				plugin = {"pretty", 
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report2.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/report2.html"})

public class Test_Data_Table_Scenario_Runner {

}
