package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver;

	@Given("^User is on the Login page$")
	public void user_is_on_the_login_page() {
		
		driver = utilities.DriverFactory.open();
		driver.get("https://vishnu-main.linksquares.dev/users/sign_in"); 
		
	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setEmail("administrator@example.com");
		loginPage.setPassword("password1234");
		
	}

	@And("^User clicks Login$")
	public void user_clicks_login() {
		 
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLogin();
		
	}

	@Then("^User is navigated to Projects tab$")
	public void user_is_navigated_to_projects_tab() {
		
		String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h1[1]")).getText();
		Assert.assertTrue(text.contains("Welcome to Vishnu"));
		driver.close();
		
	}
	
}
