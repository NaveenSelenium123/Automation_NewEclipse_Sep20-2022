package org.step5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
WebDriver driver;
	@Given("User in on Facebook login page")
	public void user_in_on_Facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https:www.facebook.com"); 
	}

	@When("User enters the valid {string} and valid {string}")
	public void user_enters_the_valid_and_valid(String string, String string2) {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(string);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(string2);    
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));	  
		btnLogin.click();
	}

	@Then("Successful page is displayed")
	public void successful_page_is_displayed() {
		System.out.println("The user enter Facebook login page successfully"); 
	}
}
