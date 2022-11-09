package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass{
	@When("user enter login credentials")
	public void user_enter_login_credentials() {
System.out.println("User enter the login credentials");	  
WebElement email = locateById("email");
email.sendKeys("Naveen");

WebElement pass = locateById("pass");
pass.sendKeys("Naveen@1234");

locateByName("login").click();
	}

	@When("user enter the firstname and last name")
	public void user_enter_the_firstname_and_last_name() {
	
	}

	@When("the mobile number and email  of facebook application")
	public void the_mobile_number_and_email_of_facebook_application() {
	  
	}

	@When("user enter the date of birth")
	public void user_enter_the_date_of_birth() {
	    
	}

	@When("user enter the gender")
	public void user_enter_the_gender() {
	   
	}

	@When("user click the sign up button")
	public void user_click_the_sign_up_button() {
	    
	}


	

}
