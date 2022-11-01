package org.step14;

import java.io.IOException;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("User in on Facebook create login page for create new account")
	public void user_in_on_Facebook_create_login_page_for_create_new_account() throws InterruptedException {
		browserConChrome();
		openApplication("https://www.facebook.com/");
		maximizeWindow();
		LoginData b =new LoginData();
		b.getCreateNewAccount().click();
		Thread.sleep(3000);
	}

	@When("User enters the valid username and last name")
	public void user_enters_the_valid_username_and_last_name() throws IOException {
		LoginData b =new LoginData();
		inputText(b.getFirstName(),excelRead("E:\\\\Windows_Old Eclipse Projects\\\\Greens_CucumberTask\\\\src\\\\test\\\\resources\\\\Facebook\\\\Cucumber.xlsx", "FbExe14", 1, 1));
		inputText(b.getLastName(),excelRead("E:\\\\Windows_Old Eclipse Projects\\\\Greens_CucumberTask\\\\src\\\\test\\\\resources\\\\Facebook\\\\Cucumber.xlsx", "FbExe14", 1, 2));
	
	}

	@When("User enters the valid email address and New password")
	public void user_enters_the_valid_email_address_and_New_password() throws IOException {
		LoginData b =new LoginData();
		inputText(b.getEmailAddress(),excelRead("E:\\\\Windows_Old Eclipse Projects\\\\Greens_CucumberTask\\\\src\\\\test\\\\resources\\\\Facebook\\\\Cucumber.xlsx", "FbExe14", 1, 3));
		inputText(b.getNewPassword(),excelRead("E:\\\\Windows_Old Eclipse Projects\\\\Greens_CucumberTask\\\\src\\\\test\\\\resources\\\\Facebook\\\\Cucumber.xlsx", "FbExe14", 1, 4));
		   
	}

	@When("User click the date of birth")
	public void user_click_the_date_of_birth() throws InterruptedException {
		LoginData b =new LoginData();
		dropdown(b.getDateOfBirth(),3);
		dropdown(b.getMonth(),3);
		Thread.sleep(3000);
		dropdown(b.getYear(),15);
		Thread.sleep(3000);
	}

	@When("User click the gender type")
	public void user_click_the_gender_type() throws InterruptedException {
		LoginData b =new LoginData();
		click(b.getGender());
		Thread.sleep(3000);
	}

	@When("User click the signup button")
	public void user_click_the_signup_button() throws IOException {
		LoginData b =new LoginData();
		click(b.getSignUp());
		inputText(b.getReEnterEmail(),excelRead("E:\\\\Windows_Old Eclipse Projects\\\\Greens_CucumberTask\\\\src\\\\test\\\\resources\\\\Facebook\\\\Cucumber.xlsx", "FbExe14", 1, 3));
	
	}

	@Then("Facebook Account createSuccessful")
	public void facebook_Account_createSuccessful() {
	   System.out.println("The User Account created successfully"); 
	}


}
