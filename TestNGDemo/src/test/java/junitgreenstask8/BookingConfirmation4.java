package junitgreenstask8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation4 {
	WebDriver driver;
	public BookingConfirmation4() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='gst']")
	private WebElement bookingConfirm;
	public WebElement getBookingConfirm() {
		return bookingConfirm;
	}
}
