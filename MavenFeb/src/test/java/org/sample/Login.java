package org.sample;    //DAY01--POM

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass2;

public class Login extends BaseClass2 {
	
	public Login() {
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy(id="email")	
private WebElement txtEmail;

@FindBy(id="pass")
private WebElement txtPass;

@FindBy(name="login")
private WebElement btnLogin;

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}

}
