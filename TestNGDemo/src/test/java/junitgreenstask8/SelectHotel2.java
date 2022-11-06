package junitgreenstask8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel2 {
	WebDriver driver;
	public SelectHotel2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
private WebElement select;
	@FindBy(id="continue")
private WebElement continue1;
//	public void setSelect() {
//		
//	}
//	public void setContinue1() {
//		
//	}
//	
	public WebElement getSelect() {
		return select;
	}
	public WebElement getContinue1() {
		return continue1;
	}
	
}
