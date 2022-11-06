package testng.greenspractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoQAPom2 {
	WebDriver driver;
	public DemoQAPom2() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"msdd\"]")
	//@FindBy(xpath="//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")
private WebElement textLanguage;
	@FindBy(id="Skills")
private WebElement textSkill;
	//@FindBy(id="countries")
	@FindBy(xpath="//*[@id=\"countries\"]")
private WebElement textSelectCountry;
//@FindBy(xpath="(//select[@type='text'])[1]")
	@FindBy(id="yearbox")
private WebElement textYear;
@FindBy(xpath="(//select[@type='text'])[2]")
private WebElement textMonth;
@FindBy(xpath="(//select[@type='text'])[3]")
private WebElement textDay;

public void setTextLanguage(int value) {
	Select s =new Select(textLanguage);
	s.selectByIndex(value);
}
public void setTextSkill(int value) {
	Select s =new Select(textSkill);
	s.selectByIndex(value);	
}
public void setTextSelectCountry(int value) {
	Select s =new Select(textSelectCountry);
	s.selectByIndex(value);	
}
public void setTextYear(int value) {
	Select s =new Select(textYear);
	s.selectByIndex(value);	
}
public void setTextMonth(int value) {
	Select s =new Select(textMonth);
	s.selectByIndex(value);	
}
public void setTextDay(int value) {
	Select s =new Select(textDay);
	s.selectByIndex(value);	
}

}
