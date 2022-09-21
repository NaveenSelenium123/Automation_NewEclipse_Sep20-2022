package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefWithData {
	WebDriver driver;
	@Given("user is on login pagee")
	public void user_is_on_login_pagee() {
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/");   
	}

	@When("the user enters the valid credentials Admin and admin{int}")
	public void the_user_enters_the_valid_credentials_Admin_and_admin(String username,String password) {
		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		    driver.findElement(By.id("txtPassword")).sendKeys(password);   
	}

	@When("clicks on the login buttonn")
	public void clicks_on_the_login_buttonn() {
		  driver.findElement(By.id("btnLogin")).click();   
	}

	@Then("the user should see the home pagee")
	public void the_user_should_see_the_home_pagee() {
		boolean status = driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
	    Assert.assertTrue(status);  
	}


}
