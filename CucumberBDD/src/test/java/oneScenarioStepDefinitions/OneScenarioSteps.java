package oneScenarioStepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OneScenarioSteps {
	
	WebDriver driver;
	
	@Given("^user opens Facebook login page$")
	public void User_opens_Facebook_login_page() {
		driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\Webdrivers\\chromedriver.exe");
		driver.get("http://www.facebook.com/");
	}
	
	@When("^user enters first name$")
	public void User_enters_first_name() {
		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys("Tester");
	}
	
	@Then("^user checks first name$")
	public void User_checks_first_name() {
		String actualValue = driver.findElement(By.xpath("//input[@id='u_0_c']")).getAttribute("value");
		Assert.assertEquals("Tester", actualValue);
	}
	
	@Then("^close browser$")
	public void Close_browser() {
		driver.quit();
		driver.close();
	}

}