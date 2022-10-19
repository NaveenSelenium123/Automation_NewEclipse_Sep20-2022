package POMPracticeExe3_2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POMPracticeExe3_1.BaseClassPOM;

public class GreensPOM extends BaseClassPOM {
	public GreensPOM() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Certifications']")
private WebElement certification;
	@FindBy(xpath="(//a[text()='Course Content'])[40]")
private WebElement courseContent;
	@FindBy(xpath="//p[contains(text(),'\"HI, I have taken Selenium training in chennai at Greens technology.')]")
private WebElement testimonial;
	@FindBy(xpath="//h2[contains(text(),'Selenium Training')]")
private WebElement printSelenium;
	public WebElement getCertification() {
		return certification;
	}
	public WebElement getCourseContent() {
		return courseContent;
	}
	public WebElement getTestimonial() {
		return testimonial;
	}
	public WebElement getPrintSelenium() {
		return printSelenium;
	}

}
