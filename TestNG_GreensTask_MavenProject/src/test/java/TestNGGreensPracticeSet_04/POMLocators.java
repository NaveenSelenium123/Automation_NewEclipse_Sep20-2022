package TestNGGreensPracticeSet_04;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLocators extends BaseClass {
	public POMLocators() {
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtEmail;
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPass;
	@FindBy(xpath="(//button[@type='submit'])[2]")
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
