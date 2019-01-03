package dataTableStepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataTableScenarioSteps {
	
	WebDriver driver;
	
	@Given("^User opens Facebook login page$")
	public void user_opens_Facebook_login_page() {
		driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\Webdrivers\\chromedriver.exe");
		driver.get("http://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) {
		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys(userName);
	}
	
	@Then("^User checks \"([^\"]*)\" first name$")
	public void user_checks_first_name(String userName) {
		String actualValue = driver.findElement(By.xpath("//input[@id='u_0_c']")).getAttribute("value");
		Assert.assertEquals(userName, actualValue);
	}
	
	@When("^User enters user \"([^\"]*)\" lastname$")
	public void user_enters_user_lastname(String lastName) throws Throwable {
	    driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys(lastName);
	}

	@Then("^Validate \"([^\"]*)\" last name$")
	public void validate_last_name(String lastName) throws Throwable {
		String actualValue = driver.findElement(By.xpath("//input[@id='u_0_e']")).getAttribute("value");
		Assert.assertEquals(lastName, actualValue);
	}
	
	@Then("^Close browser$")
	public void close_browser() {
		driver.close();
	}
	
	@When("^Enter test data$")
	public void enter_test_data(DataTable table) {
		List<List<String>> data = table.raw();
		
	}
	
	
}