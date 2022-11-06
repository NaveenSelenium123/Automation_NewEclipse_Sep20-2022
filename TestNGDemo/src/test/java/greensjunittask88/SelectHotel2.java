package greensjunittask88;                 ///pom framework ---3

import junitgreenstask8.BaseClassPom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel2 extends BaseClassPom {
	public SelectHotel2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
private WebElement select;
	@FindBy(id="continue")
private WebElement continue1;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getContinue1() {
		return continue1;
	}

}
