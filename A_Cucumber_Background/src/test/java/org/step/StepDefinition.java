package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("user in Facebook application")
	public void user_in_Facebook_application() {
	 WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	}

	@Given("User enter the username")
	public void user_enter_the_username() {
	  driver.findElement(By.id("email")).sendKeys("Naveen");
	  
	}

	@Given("User enter the password")
	public void user_enter_the_password() {
		driver.findElement(By.id("pass")).sendKeys("pass@123");
	}

	@Then("User click the signin button")
	public void user_click_the_signin_button() {
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();    
	}

	@When("user enter the firstname and last name")
	public void user_enter_the_firstname_and_last_name() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.name("firstname")).sendKeys("firsr");
	  driver.findElement(By.name("lastname")).sendKeys("last");
	}

	@When("the mobile number and email  of facebook application")
	public void the_mobile_number_and_email_of_facebook_application() {
		driver.findElement(By.name("reg_email__")).sendKeys("mobile127383993");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("password");   
	}

	@When("user enter the date of birth")
	public void user_enter_the_date_of_birth() {
	    WebElement day = driver.findElement(By.id("day"));
	    Select s =new Select(day);
	    s.selectByIndex(0);
	    WebElement month= driver.findElement(By.id("month"));
	    Select s1 =new Select(month);
	    s1.selectByIndex(0);
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2 =new Select(year);
	    s2.selectByIndex(0);
	    
	}

	@When("user enter the gender")
	public void user_enter_the_gender() {
	  driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click(); 
	}

	@When("user click the sign up button")
	public void user_click_the_sign_up_button() {
driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();	    
	}

	@When("user enter the firstname and last name QA User")
	public void user_enter_the_firstname_and_last_name_QA_User() throws InterruptedException {
		Thread.sleep(3000);
		  driver.findElement(By.name("firstname")).sendKeys("firsrsds");
		  driver.findElement(By.name("lastname")).sendKeys("lastsds");		   
	}

	@When("the mobile number and email  of facebook application QA User")
	public void the_mobile_number_and_email_of_facebook_application_QA_User() {
		driver.findElement(By.name("reg_email__")).sendKeys("mobile127383993");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("password");    	   
	}

	@When("user enter the date of birth QA User")
	public void user_enter_the_date_of_birth_QA_User() {
		WebElement day = driver.findElement(By.id("day"));
	    Select s =new Select(day);
	    s.selectByIndex(0);
	    WebElement month= driver.findElement(By.id("month"));
	    Select s1 =new Select(month);
	    s1.selectByIndex(0);
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2 =new Select(year);
	    s2.selectByIndex(0);	   
	}

	@When("user enter the gender QA User")
	public void user_enter_the_gender_QA_User() {
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click(); 	    
	}

	@When("user click the sign up button QA User")
	public void user_click_the_sign_up_button_QA_User() {
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();	 
	}



}
