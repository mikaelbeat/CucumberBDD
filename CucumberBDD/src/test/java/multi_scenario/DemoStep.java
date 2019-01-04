package multi_scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStep {
	
	WebDriver driver;
	
	@Given("^User need to be on demo site$")
	public void user_need_to_be_on_demo_site() {
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@When("^User enters first name$")
	public void user_enters_first_name() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("FirstName");
	}
	
	@When("^User enters last name$")
	public void user_enters_last_name() {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("LastName");
	}
	
	@Then("^Close browser3$")
	public void close_browser() {
		driver.close();
	}

}
