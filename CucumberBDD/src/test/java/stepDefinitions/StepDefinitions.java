package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	
	WebDriver driver;
	
	@Given("^User opens Facebook login page$")
	public void User_opens_Facebook_login_page() {
//		System.setProperty("webdriver.chrome.driver", "driver location");
		driver.get("http://www.facebook.com/");
	}
	
	@When("^User enters first name$")
	public void User_enters_first_name() {
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Tester");
	}
	
	@SuppressWarnings("deprecation")
	@Then("^User checks first name$")
	public void User_checks_first_name() {
		String actualValue = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		Assert.assertEquals("Tester", actualValue);
	}

}
