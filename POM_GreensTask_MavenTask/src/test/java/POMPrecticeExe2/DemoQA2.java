package POMPrecticeExe2;
import POMPrecticeExe1.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DemoQA2 extends BaseClass {
	public DemoQA2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='radio'])[1]")
private WebElement radio;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
private WebElement hobbiesCricket;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
private WebElement hobbiesMovies;
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
private WebElement hobbiesHockey;
	@FindBy(xpath="//button[@type='submit']")
private WebElement submitButton;

public WebElement getSubmitButton() {
	return submitButton;
}
public WebElement getRadio() {
	return radio;
}
public WebElement getHobbiesCricket() {
	return hobbiesCricket;
}
public WebElement getHobbiesMovies() {
	return hobbiesMovies;
}
public WebElement getHobbiesHockey() {
	return hobbiesHockey;
}

}
