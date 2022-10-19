package POMPracticeExe3_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPOM extends BaseClassPOM {
	public GreensPOM() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Copyright © 2019 greenstechnologys.com. All Rights Reserved.']")
private WebElement scroll;
	
	@FindBy(xpath="//p[text()='Copyright © 2019 greenstechnologys.com. All Rights Reserved.']")
	private WebElement gettext;
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement scrollUp;
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement gettext1;

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getGettext() {
		return gettext;
	}

	public WebElement getScrollUp() {
		return scrollUp;
	}

	public WebElement getGettext1() {
		return gettext1;
	}

	


}
