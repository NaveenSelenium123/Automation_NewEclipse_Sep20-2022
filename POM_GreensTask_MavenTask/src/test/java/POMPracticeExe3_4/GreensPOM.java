package POMPracticeExe3_4;

import POMPracticeExe3_1.BaseClassPOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPOM extends BaseClassPOM{
	public GreensPOM() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement click;
	@FindBy(xpath="(//a[text()='Careers'])[1]")
	private WebElement careers;
	@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[8]")
	private WebElement scrollDown;
	@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[8]")
	private WebElement email;
	
	public WebElement getClick() {
		return click;
	}
	public WebElement getCareers() {
		return careers;
	}
	public WebElement getScrollDown() {
		return scrollDown;
	}
	public WebElement getEmail() {
		return email;
	}

}
