package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UsersTabSteps {
	
	WebDriver driver;

	@Given("^Project Table page is opened$")
	public void project_table_page_is_opened() {
	    
	}

	@When("^User clicks Users tab$")
	public void user_clicks_users_tab() {
	    
	}

	@Then("^Users Table page is opened$")
	public void users_table_page_is_opened() {
	    
	}

	@And("{string} label appears as a table name")
	public void label_appears_as_a_table_name(String string) {
	    
	}

	@And("Table has columns in next order: {string},{string},{string},{string},{string}")
	public void table_has_columns_in_next_order(String string, String string2, String string3, String string4, String string5) {
	    
	}
	
}
