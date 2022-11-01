package org.step14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class LoginData extends BaseClass{
	public LoginData() {
		PageFactory.initElements(driver,this);
	}
	
	
    @FindBy(xpath="//a[text()='Create New Account']")
	private WebElement createNewAccount;
    @FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
    @FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
    @FindBy(xpath="//input[@name='reg_email__']")
	private WebElement emailAddress;
    @FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement newPassword;
    @FindBy(id="day")
	private WebElement date;
    @FindBy(id="month")
    private WebElement month;
    @FindBy(id="year")
    private WebElement year;
    @FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;
    @FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement signUp;
	@FindBy(xpath="(//input[@type='text'])[5]")
    private WebElement reEnterEmail;
	public WebElement getReEnterEmail() {
		return reEnterEmail;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmailAddress() {
		return emailAddress;
	}
	public WebElement getNewPassword() {
		return newPassword;
	}
	public WebElement getDateOfBirth() {
		return date;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getSignUp() {
		return signUp;
	}
	
}
