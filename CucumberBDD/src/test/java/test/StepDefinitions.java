package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions {
	
	WebDriver driver;
	
	@Given("^User opens Facebook login page$")
	public void User_opens_Facebook_login_page() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\Webdrivers\\chromedriver.exe");
		driver.get("http://www.facebook.com/");
	}
	
	@When("^User enters first name$")
	public void User_enters_first_name() {
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Tester");
	}
	
	@Then("^User checks first name$")
	public void User_checks_first_name() {
		String actualValue = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		//Assert.assertEquals("Tester", actualValue);
		driver.close();
	}

}
