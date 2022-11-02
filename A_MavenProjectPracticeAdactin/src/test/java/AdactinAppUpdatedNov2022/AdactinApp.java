package AdactinAppUpdatedNov2022;
import org.openqa.selenium.WebElement;
public class AdactinApp extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		//login 
	browserConChrome();
	openApplication("http://adactinhotelapp.com/");
	webElementLocateById("username").sendKeys("NaveenSelenium");
	webElementLocateById("password").sendKeys("123456");
	webElementLocateById("login").click();
	
	//select hotel
			WebElement ddnLocation = webElementLocateById("location");
			WebElement ddnHotel = webElementLocateById("hotels");
			WebElement ddnRoom = webElementLocateById("room_type");
			WebElement ddnNoofRoom = webElementLocateById("room_nos");
			WebElement ddnAdult = webElementLocateById("adult_room");
			WebElement ddnChildern = webElementLocateById("child_room");
			dropDownStat(ddnLocation,3);
			dropDownStat(ddnHotel,2);
			dropDownStat(ddnRoom,3);
			dropDownStat(ddnNoofRoom,2);
			dropDownStat(ddnAdult,3);
			dropDownStat(ddnChildern,2);
			webElementLocateById("Submit").click();
			webElementLocateById("radiobutton_0").click();
			webElementLocateById("continue").click();
			
			
			
			//Book  a hotel
			webElementLocateById("first_name").sendKeys("Naveen");
			webElementLocateById("last_name").sendKeys("Naveen");
			webElementLocateById("address").sendKeys("Chennai");
			webElementLocateById("cc_num").sendKeys("0123456789123456");
			webElementLocateById("cc_cvv").sendKeys("123");
			WebElement ccType = webElementLocateById("cc_type");
			WebElement expMonth= webElementLocateById("cc_exp_month");
			WebElement expYear = webElementLocateById("cc_exp_year");
			dropDownStat(ccType,3);
			dropDownStat(expMonth,2);
			dropDownStat(expYear,12);
			webElementLocateById("book_now").click();
		Thread.sleep(10000);
		//Booking order No
			WebElement txtOrder = webElementLocateById("order_no");
			getAttribute(txtOrder);
			
}
}