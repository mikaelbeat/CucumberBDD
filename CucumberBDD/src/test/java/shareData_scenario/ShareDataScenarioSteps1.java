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


public class ShareDataScenarioSteps1 {
	
	WebDriver driver;
	
	public ShareDataScenarioSteps1(SharedClass share) {
		driver = share.setup();
	}
	
	@Given("^User opens Facebook login page$")
	public void user_opens_Facebook_login_page() {
		driver.get("http://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) {
		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys(userName);
	}
	
}