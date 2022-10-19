package JunitGreensPracticeExe6;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmation5 extends BaseClass{
	public BookConfirmation5() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="order_no")
	private WebElement bookingConfirm;
	public WebElement getBookingConfirm() {
		return bookingConfirm;
	}

}
