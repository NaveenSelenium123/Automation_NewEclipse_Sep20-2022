package org.step15;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	

	@Given("User in DemoQA login page")
	public void user_in_DemoQA_login_page() {
		browserConChrome();
		openApplication("https://demo.automationtesting.in/Register.html");
		maximizeWindow();
	}

	@When("User enter the valid firstname and valid lastname")
	public void user_enter_the_valid_firstname_and_valid_lastname() throws IOException {
RegisterData b=new RegisterData();
inputText(b.getFirstName(),excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 1));
inputText(b.getLastName(),excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 2));

	}

	@When("User enter the valid email and Address")
	public void user_enter_the_valid_email_and_Address() throws IOException {

		
		
		RegisterData b=new RegisterData();
		inputText(b.getEmail(),excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 4));
		inputText(b.getAddress(),excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 3));
	}

	@When("User enter the valid phone number")
	public void user_enter_the_valid_phone_number() throws IOException {
		RegisterData b=new RegisterData();
	inputText(b.getPhonenumber(),excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 5));
	
	}

	@When("User enter the valid Hobbies and Gender")
	public void user_enter_the_valid_Hobbies_and_Gender() {
		RegisterData b=new RegisterData();
		
		click(b.getGender());
		click(b.getHobbies());
	}

	@When("User enter the valid Skillset")
	public void user_enter_the_valid_Skillset() {
		RegisterData b=new RegisterData();
		jkClick(b.getSkills());
		dropdown(b.getSkills(),2);
	}

	@When("User enter the valid Date of birth")
	public void user_enter_the_valid_Date_of_birth() {
		RegisterData b=new RegisterData();
		dropdown(b.getYear(),2);
		dropdown(b.getMonth(),2);
		dropdown(b.getYear(),2);
	}

	@When("User enter the valid password and confirm password")
	public void user_enter_the_valid_password_and_confirm_password() throws IOException {
		RegisterData b=new RegisterData();
	inputText(b.getFirstName(),excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 6));
	inputText(b.getCnfPassword(),excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 7));
		
	
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		RegisterData b=new RegisterData();
		
		click(b.getSubmit());
	}

	@Then("Successful message is dispalyed")
	public void successful_message_is_dispalyed() {
		System.out.println("The user enter successfully to Login Form");
	}

}
