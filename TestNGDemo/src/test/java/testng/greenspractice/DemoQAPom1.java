package testng.greenspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQAPom1 {
	WebDriver driver;
	public DemoQAPom1() {
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
	
	public void setRadio(){
	radio.click();	
	}
	public void setHobbiesCricket() {
		hobbiesCricket.click();	
	}
	public void setHobbiesMovies() {
		hobbiesMovies.click();	
	}
	public void setHobbiesHockey() {
		hobbiesHockey.click();	
	}
	public void setSubmitButton() {
		submitButton.click();	
	}
	
}
