package multipleScenarioStepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MultipleScenarioSteps {
	
	WebDriver driver;
	
	@Given("^User opens Facebook login page$")
	public void user_opens_Facebook_login_page() {
		driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\Webdrivers\\chromedriver.exe");
		driver.get("http://www.facebook.com/");
	}
	
	@When("^User enters first name$")
	public void user_enters_first_name() {
		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys("Tester");
	}
	
	@Then("^User checks first name$")
	public void user_checks_first_name() {
		String actualValue = driver.findElement(By.xpath("//input[@id='u_0_c']")).getAttribute("value");
		Assert.assertEquals("Tester", actualValue);
	}
	
	@When("^User enters lastname$")
	public void user_enters_lastname() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys("Tester");
	}

	@Then("^Validate last name$")
	public void validate_last_name() throws Throwable {
		String actualValue = driver.findElement(By.xpath("//input[@id='u_0_e']")).getAttribute("value");
		Assert.assertEquals("Tester", actualValue);
	}

	@Then("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws Throwable {
	    String actualValue = driver.findElement(By.xpath("//input[@id='u_0_h']")).getAttribute("value");
	    Assert.assertEquals("", actualValue);
	}
	
	@Then("^Close browser$")
	public void close_browser() {
		driver.close();
	}
	
}