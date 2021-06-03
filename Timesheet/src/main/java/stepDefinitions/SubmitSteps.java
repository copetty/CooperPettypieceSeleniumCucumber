package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utils.DriverFactory;

public class SubmitSteps extends DriverFactory{
	
	
	@Given("^User navigates to rev(\\d+)\\.force\\.com$")
	public void user_navigates_to_rev_force_com(int arg1) throws Throwable {
		submitPage.getSubmitPage();
	}

	@And("^User enters username$")
	public void user_enters_username() throws Throwable {
		submitPage.enterUsername("cooper.pettypiece@revature.net");
	}

	@And("^User clicks submit$")
	public void user_clicks_submit() throws Throwable {
		submitPage.clickOnSubmitButton();
	}

	@And("^User enters password$")
	public void user_enters_password() throws Throwable {
		submitPage.enterPassword("#Longbow1556");
	}

	@And("^User clicks login$")
	public void user_clicks_login() throws Throwable {
		submitPage.clickOnLoginButton();
	}

	@And("^User clicks open timesheets$")
	public void user_clicks_open_timesheets() throws Throwable {
		submitPage.clickOnTimesheetButton();
	}

	@And("^User enters Monday hours$")
	public void user_enters_Monday_hours() throws Throwable {
		submitPage.enterMondayHours("8");
	}

	@And("^User enters Tuesday hours$")
	public void user_enters_Tuesday_hours() throws Throwable {
		submitPage.enterTuesdayHours("8");
	}

	@And("^User enters Wednesday hours$")
	public void user_enters_Wednesday_hours() throws Throwable {
		submitPage.enterWednesdayHours("8");
	}

	@And("^User enters Thursday hours$")
	public void user_enters_Thursday_hours() throws Throwable {
		submitPage.enterThursdayHours("8");
	}

	@When("^User enters Friday hours$")
	public void user_enters_Friday_hours() throws Throwable {
		submitPage.enterFridayHours("8");
	}



	@Then("^User confirms submit button is on page$")
	public void user_confirms_submit_button_is_on_page() throws Throwable {
		submitPage.confirmSubmitButton();
	}


}
