package org.step7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	@Given("User in DemoQA login page")
	public void user_in_DemoQA_login_page() {
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();   
	}

	@When("User enter the valid {string} and {string}")
	public void user_enter_the_valid_and(String string, String string2) {
		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	firstName.sendKeys(string);
	WebElement LastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	LastName.sendKeys(string2);  
	}

	@When("User enter the valid email {string} and {string}")
	public void user_enter_the_valid_email_and(String string, String string2) {
		WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	Address.sendKeys(string);
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys(string2);  
	}

	@When("User enter the valid phone {string}")
	public void user_enter_the_valid_phone(String string) {
		WebElement txtPhonenumber = driver.findElement(By.xpath("//input[@type='tel']"));
	txtPhonenumber.sendKeys(string);   
	}

	@When("User enter the valid Hobbies and Gender")
	public void user_enter_the_valid_Hobbies_and_Gender() {
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	gender.click();
	WebElement cricket = driver.findElement(By.id("checkbox1"));
	cricket.click();   
	}

	@When("User enter the valid Skillset")
	public void user_enter_the_valid_Skillset() {
		WebElement skill = driver.findElement(By.id("Skills"));
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", skill);
	Select s = new Select(skill);
	s.selectByIndex(3);
//////	WebElement ddnCountry = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
//////	js.executeScript("arguments[0].click()",ddnCountry );
//////	Select a= new Select(ddnCountry);
//////	a.selectByIndex(3); 
	}

	@When("User enter the valid Date of birth")
	public void user_enter_the_valid_Date_of_birth() {
		WebElement year = driver.findElement(By.id("yearbox"));
	Select s1 = new Select(year);
	s1.selectByIndex(3);

	WebElement Month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	Select m = new Select(Month);
	m.selectByIndex(3);

	WebElement day = driver.findElement(By.id("daybox"));
	Select a = new Select(day);
	a.selectByIndex(3);   
	}

	@When("User enter the valid pass {string} and {string}")
	public void user_enter_the_valid_pass_and(String string, String string2) {
		WebElement firstPassword = driver.findElement(By.id("firstpassword"));
	firstPassword.sendKeys(string);
	WebElement sPassword = driver.findElement(By.id("secondpassword"));
	sPassword.sendKeys(string2);  
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		WebElement btnClick = driver.findElement(By.id("submitbtn"));
	btnClick.click();    
	}

	@Then("Successful message is dispalyed")
	public void successful_message_is_dispalyed() {
		System.out.println("The user enter successfully to Login Form");
	}


}
