package org.step11;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class StepDefinition extends BaseClass {
	@Given("User in on Facebook login page")
	public void user_in_on_Facebook_login_page() {
	 // BaseClass b=new BaseClass();
	  browserConChrome();
	  maximizeWindow();
	  openApplication("https://www.facebook.com");
	}
	@When("User enters the valid username and valid password")
	public void user_enters_the_valid_username_and_valid_password() throws IOException {
		 BaseClass b=new BaseClass();
WebElement txtEmail = b.webElementLocateById("email");
b.inputText(txtEmail,b.excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx","Sheet1", 1, 2));

WebElement txtPass = b.webElementLocateById("pass");
b.inputText(txtPass,b.excelRead("E:\\Windows_Old Eclipse Projects\\Greens_CucumberTask\\src\\test\\resources\\Facebook\\Cucumber.xlsx","Sheet1", 2, 1));
	}
	@When("User click the login button")
	public void user_click_the_login_button() {
BaseClass b=new BaseClass();
WebElement btnLogin = b.locateByName("login");
//btnLogin.click();
	}
	@Then("Successful page is displayed")
	public void successful_page_is_displayed() {
	  System.out.println("The user enter Facebook login page successfully"); 
	}
}
