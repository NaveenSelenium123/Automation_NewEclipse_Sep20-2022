package testng.greenspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task2Pom {
	WebDriver driver;
	public Task2Pom() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//input[@type='text'])[2]")	
private WebElement email;
	@FindBy(xpath="//input[@type='password']")	
private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")	
private WebElement login;

public void setEmail(String args) {
	email.sendKeys(args);
}
public void setPassword(String args) {
	password.sendKeys(args);
}
public void setLogin() {
	login.click();
}

}
