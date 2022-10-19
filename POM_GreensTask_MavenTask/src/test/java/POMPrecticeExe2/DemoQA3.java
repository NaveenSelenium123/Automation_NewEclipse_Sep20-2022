package POMPrecticeExe2;

import POMPrecticeExe1.BaseClass;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DemoQA3 extends BaseClass {
	public DemoQA3() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"msdd\"]")
	//@FindBy(xpath="//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")
private WebElement textLanguage;
	@FindBy(id="Skills")
private WebElement textSkill;
	@FindBy(id="countries")
private WebElement textSelectCountry;
//@FindBy(xpath="(//select[@type='text'])[1]")
	@FindBy(id="yearbox")
private WebElement textYear;
@FindBy(xpath="(//select[@type='text'])[2]")
private WebElement textMonth;
@FindBy(xpath="(//select[@type='text'])[3]")
private WebElement textDay;
public WebElement getTextLanguage() {
	return textLanguage;
}
public WebElement getTextSkill() {
	return textSkill;
}
public WebElement getTextSelectCountry() {
	return textSelectCountry;
}
public WebElement getTextYear() {
	return textYear;
}
public WebElement getTextMonth() {
	return textMonth;
}
public WebElement getTextDay() {
	return textDay;
}

}
