package shareData_scenario;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ShareDataScenarioSteps2 {
	
	WebDriver driver;
	
	public ShareDataScenarioSteps2(SharedClass share) {
		driver = share.setup();
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

	@Then("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws Throwable {
	    String actualValue = driver.findElement(By.xpath("//input[@id='u_0_h']")).getAttribute("value");
	    Assert.assertEquals("", actualValue);
	}
	
}