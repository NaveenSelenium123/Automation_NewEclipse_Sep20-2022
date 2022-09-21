package com.lao.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyCEONameStepDef {
	@Given("the user is logged in successfully and is on Home Page")
	public void the_user_is_logged_in_successfully_and_is_on_Home_Page() {
	  System.out.println("the user is logged in successfully and is on Home Page");  
	}

	@When("the user clicks on the directory option from the Menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_Menu_bar() {
		 System.out.println("the user clicks on the directory option from the Menu bar");
	}

	@When("the user select the job title as {string} from drop down")
	public void the_user_select_the_job_title_as_from_drop_down(String string) {
		 System.out.println("the user select the job title as {string} from drop down");
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
		 System.out.println("clicks the search button");
	}

	@Then("the user shoild see the CEO name as {string}")
	public void the_user_shoild_see_the_CEO_name_as(String string) {
		 System.out.println("the user shoild see the CEO name as {string}");
	}


}
