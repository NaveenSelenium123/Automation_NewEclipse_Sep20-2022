package greensjunittask6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin {
	WebDriver driver;
	public   AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
     @FindBy(id="username")
	private WebElement txtUserName;
     @FindBy(id="password")
	private WebElement txtPassword;
     @FindBy(id="login")
	private WebElement txtLogin;
	
	public void setTxtUserName(String args) {
		txtUserName.sendKeys(args);	
	}
	public void setTxtPassword(String args) {
		txtPassword.sendKeys(args);
	}
	public void setTxtLogin() {
		txtLogin.click();	
	}
}
