package testRunners;

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
						 "html:target/dataTable_scenario/cucumber-htmlreport",
						 "json:target/dataTable_scenario/cucumber-report.json,",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/dataTable_scenario/report.html"})

public class Data_Table_Scenario_Runner {

}
