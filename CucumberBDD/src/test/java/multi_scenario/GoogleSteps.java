package multi_scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps {
	
	WebDriver driver;
	
	@Given("^User need to be on google page$")
	public void user_need_to_be_on_google_page() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
	}
	
	@When("^User enters search term$")
	public void user_enters_search_term() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
	}
	
	@Then("^Close browser2$")
	public void close_browser() {
		driver.close();
	}

}
