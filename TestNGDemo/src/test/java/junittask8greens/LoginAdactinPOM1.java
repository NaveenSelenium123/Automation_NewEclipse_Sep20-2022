package junittask8greens;
                 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import junitgreenstask8.BaseClassPom;
public class LoginAdactinPOM1 extends BaseClassPom {
	
	public   LoginAdactinPOM1() {
		PageFactory.initElements(driver, this);
	}
     @FindBy(id="username")
	private WebElement txtUserName;
     @FindBy(id="password")
	private WebElement txtPassword;
     @FindBy(id="login")
	private WebElement txtLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getTxtLogin() {
		return txtLogin;
	}
	
}
