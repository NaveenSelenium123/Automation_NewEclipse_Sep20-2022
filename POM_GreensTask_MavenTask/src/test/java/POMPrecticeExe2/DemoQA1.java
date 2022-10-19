package POMPrecticeExe2;
import POMPrecticeExe1.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQA1 extends BaseClass {
	public DemoQA1() {
		PageFactory.initElements(driver,this);
	}
     @FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstName;
     @FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastName;
     @FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement address;
     @FindBy(xpath="//input[@type='email']") 
	private WebElement emailAddress;
     @FindBy(xpath="//input[@type='tel']")
	private WebElement phoneNumber;
     @FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement password;
     @FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement confirmPassword;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getEmailAddress() {
		return emailAddress;
	}
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

}
