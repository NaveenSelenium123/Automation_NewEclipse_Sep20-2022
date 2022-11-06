package testng.greenspractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DemoQAPom {
	WebDriver driver;
	public DemoQAPom(WebDriver driver2) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
private WebElement firstName;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")
private WebElement lastName;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")
private WebElement address;
	@FindBy(xpath="//*[@id=\"eid\"]/input")
private WebElement email;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
private WebElement phonenumber;
	 @FindBy(xpath="(//input[@type='password'])[1]")
		private WebElement password;
	     @FindBy(xpath="(//input[@type='password'])[2]")
		private WebElement confirmPassword;

public void setFirstName(String args) {
	firstName.sendKeys(args);
}
public void setLastName(String args) {
	lastName.sendKeys(args);
}
public void setAddress(String args) {
	address.sendKeys(args);	
}
public void setEmail(String args) {
	email.sendKeys(args);	
}
public void setPhonenumber(String args) {
	phonenumber.sendKeys(args);	
}

public void setPassword(String args) {
	 password.sendKeys(args);	
}
public void setConfirmPassword(String args) {
	confirmPassword.sendKeys(args);
}
}
