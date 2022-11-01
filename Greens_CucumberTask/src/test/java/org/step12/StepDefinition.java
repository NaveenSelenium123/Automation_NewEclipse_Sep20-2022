package org.step12;

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
	    
		WebElement txtFirstName = locateByXpath("(//input[@type='text'])[1]");
		inputText(txtFirstName,excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 1));
	
		WebElement LastName = locateByXpath("(//input[@type='text'])[2]");
		inputText(LastName,excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 2));
	}

	@When("User enter the valid email and Address")
	public void user_enter_the_valid_email_and_Address() throws IOException {

		WebElement email = locateByXpath("//textarea[@ng-model='Adress']");
		inputText(email,excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 4));
		WebElement Address = locateByXpath("//input[@type='email']");
		inputText(Address,excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 3));
	}

	@When("User enter the valid phone number")
	public void user_enter_the_valid_phone_number() throws IOException {
		
	WebElement  txtPhonenumber= locateByXpath("//input[@type='tel']");
	inputText(txtPhonenumber,excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 5));
	
	}

	@When("User enter the valid Hobbies and Gender")
	public void user_enter_the_valid_Hobbies_and_Gender() {
		WebElement  gender= locateByXpath("(//input[@type='radio'])[1]");
		gender.click();
		WebElement cricket =webElementLocateById("checkbox1");
	cricket.click();
	}

	@When("User enter the valid Skillset")
	public void user_enter_the_valid_Skillset() {
		WebElement  skill= webElementLocateById("Skills");
		jkClick(skill);
		dropdown(skill,2);
	}

	@When("User enter the valid Date of birth")
	public void user_enter_the_valid_Date_of_birth() {
		WebElement year = webElementLocateById("yearbox");
		WebElement month = locateByXpath("//select[@placeholder='Month']");
		WebElement day = webElementLocateById("daybox");
		dropdown(year,2);
		dropdown(month,2);
		dropdown(day,2);	
	}

	@When("User enter the valid password and confirm password")
	public void user_enter_the_valid_password_and_confirm_password() throws IOException {


		WebElement  firstPassword= webElementLocateById("firstpassword");
		WebElement  sPassword= webElementLocateById("secondpassword");
	inputText(firstPassword,excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 6));
	inputText(sPassword,excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx", "DemoQA", 1, 7));
		
	
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		
		WebElement  btnClick= webElementLocateById("submitbtn");
		click(btnClick);
	}

	@Then("Successful message is dispalyed")
	public void successful_message_is_dispalyed() {
		System.out.println("The user enter successfully to Login Form");
	}

}
