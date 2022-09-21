package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	WebDriver driver;
	@Given("User in fb")
	public void user_in_fb() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");  
	}

	@When("user enter pwd")
	public void user_enter_pwd() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		 txtEmail.sendKeys("Naveen");  
	}

	@Then("error page is")
	public void error_page_is() {
	  // System.out.println("Naveen");
	}

}
