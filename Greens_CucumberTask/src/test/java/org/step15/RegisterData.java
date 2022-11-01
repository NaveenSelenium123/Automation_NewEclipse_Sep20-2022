package org.step15;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class RegisterData extends BaseClass {

	public RegisterData() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstName;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement LastName;
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement Address;
	@FindBy(xpath="//input[@type='email']")
	private WebElement Email;
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phonenumber;
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement gender;
	@FindBy(id="checkbox1")
	private WebElement hobbies;
	@FindBy(id="Skills")
	private WebElement skills;
	@FindBy(id="yearbox")
	private WebElement year;
	@FindBy(xpath="//select[@placeholder='Month']")
	private WebElement month;
	@FindBy(id="daybox")
	private WebElement day;
	@FindBy(id="firstpassword")
	private WebElement password;
	@FindBy(id="secondpassword")
	private WebElement cnfPassword;
	@FindBy(id="submitbtn")
	private WebElement submit;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getHobbies() {
		return hobbies;
	}
	public WebElement getSkills() {
		return skills;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getCnfPassword() {
		return cnfPassword;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
}
