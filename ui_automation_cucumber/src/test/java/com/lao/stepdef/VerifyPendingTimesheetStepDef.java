package com.lao.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyPendingTimesheetStepDef {
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	  System.out.println("the user is on the home page");  
	}

	@When("the user clicks on the time option from menu")
	public void the_user_clicks_on_the_time_option_from_menu() {
	   System.out.println("the user clicks on the time option from menu");
	}

	@When("the user enter the name {string}")
	public void the_user_enter_the_name(String string) {
	  System.out.println("the user enter the name {string}");
	}

	@When("Clicks on the view button")
	public void clicks_on_the_view_button() {
	  System.out.println("Clicks on the view button");  
	}

	@Then("the user should see the message {string}")
	public void the_user_should_see_the_message(String string) {
	    System.out.println("the user should see the message {string");
	}


}
