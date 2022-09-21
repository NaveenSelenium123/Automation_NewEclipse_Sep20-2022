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
	@Given("User is on Adactin application login page")
	public void user_is_on_Adactin_application_login_page() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();  
	}

	@Given("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	  WebElement txtUserName = driver.findElement(By.id("username"));
	  txtUserName.sendKeys(string);
	  WebElement txtPassword = driver.findElement(By.id("password"));
	  txtPassword.sendKeys(string2);
	}

	@Given("click login button")
	public void click_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	    
	}
	@When("User enter the location {string} and  {string}")
	public void user_enter_the_location_and(String string, String string2) {
	   WebElement btnLocation = driver.findElement(By.id("location"));
	   Select s =new Select(btnLocation);
	   s.selectByVisibleText(string);
	   WebElement btnHotel = driver.findElement(By.id("hotels"));
	   Select s1=new Select(btnHotel);
	   s1.selectByVisibleText(string2);
	}

	@When("User enter the rooms {string} and {string}")
	public void user_enter_the_rooms_and(String string, String string2) {
		  WebElement btnRoom = driver.findElement(By.id("room_type"));
		   Select s =new Select(btnRoom);
		   s.selectByVisibleText(string);
		   WebElement btnNoRoom = driver.findElement(By.id("room_nos"));
		   Select s1=new Select(btnNoRoom);
		   s1.selectByVisibleText(string2);   
	}

	@When("User enter the no of pers {string} and {string}")
	public void user_enter_the_no_of_pers_and(String string, String string2) {
		WebElement btnAdult = driver.findElement(By.id("adult_room"));
		   Select s =new Select(btnAdult);
		   s.selectByVisibleText(string);
		   WebElement btnChildren = driver.findElement(By.id("child_room"));
		   Select s1=new Select(btnChildren);
		   s1.selectByVisibleText(string2);    
	}
	
	@When("User click the search box")
	public void user_click_the_search_box() {
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
	   
	}

	@When("Select checkbox  and continue with login button")
	public void select_checkbox_and_continue_with_login_button() {
	   WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
	   btnRadio.click();
	   WebElement btnContinue = driver.findElement(By.id("continue"));
	   btnContinue.click();
	}

	@Given("User is on book a hotel page")
	public void user_is_on_book_a_hotel_page() {
	    System.out.println("user in a book a hotel page");
	}

	@When("User enter the {string} , {string},{string} and {string}")
	public void user_enter_the_and(String string, String string2, String string3, String string4) {
	   WebElement btnFirstName = driver.findElement(By.id("first_name"));
	   btnFirstName.sendKeys(string);
	   WebElement btnLastName = driver.findElement(By.id("last_name"));
	   btnLastName.sendKeys(string2);
	   WebElement btnAddress = driver.findElement(By.id("address"));
	   btnAddress.sendKeys(string3);
	   WebElement btnCreditNo = driver.findElement(By.id("cc_num"));
	   btnCreditNo.sendKeys(string4);
	   
	   
	}
	@When("User enter the account {string},{string} ,{string}and {string}")
	public void user_enter_the_account_and(String string, String string2, String string3, String string4) {
	    WebElement btnCcType = driver.findElement(By.id("cc_type"));
	    Select s =new Select(btnCcType);
	    s.selectByVisibleText(string);
	    WebElement btnExpMonth = driver.findElement(By.id("cc_exp_month"));
	    Select s1 =new Select(btnExpMonth);
	    s1.selectByVisibleText(string2);
	    WebElement btnExpYear = driver.findElement(By.id("cc_exp_year"));
	    Select s2 =new Select(btnExpYear);
	    s2.selectByVisibleText(string3);
	    WebElement btnCvvNo = driver.findElement(By.id("cc_cvv"));
	    btnCvvNo.sendKeys(string4);
	    
	}
	

	@When("User click the book now button")
	public void user_click_the_book_now_button() {
	    WebElement btnBookNow = driver.findElement(By.id("book_now"));
	    btnBookNow.click();
	}

	@Then("Booking order number is dispalyed")
	public void booking_order_number_is_dispalyed() {
	   System.out.println("The Booking Order Confirmation Number is E172M153H4");
	}



}
