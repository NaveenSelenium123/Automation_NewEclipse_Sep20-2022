package POMPracticeExe3_6;

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
	@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
	private WebElement printOurMainBranches;
	@FindBy(xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
	private WebElement scrollDown;
	@FindBy(xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
	private WebElement printCopyRight;
	public WebElement getClick() {
		return click;
	}
	public WebElement getPrintOurMainBranches() {
		return printOurMainBranches;
	}
	public WebElement getScrollDown() {
		return scrollDown;
	}
	public WebElement getPrintCopyRight() {
		return printCopyRight;
	}

}
