package dataDriven;
import java.io.IOException;
import org.openqa.selenium.WebElement;

public class DataDrivenExe9 extends BaseClassAdactin{
	public static void main(String[] args) throws IOException, InterruptedException {
    browserConfigChrome();
	openApplication("http://www.adactin.com/HotelApp/");
	maximizeWindow();
	WebElement txtUser = locateById("username");
	inputText(txtUser,excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1, 7));
	WebElement txtPass = locateById("password");
	inputText(txtPass,excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1, 6));
	WebElement txtLogin = locateById("login");
	WebElement txtAdactin = locateByXpath("//td[contains(text(),'The best')]");
	String text = getText(txtAdactin);
	excelWrite("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 4, 2, text);
	 txtLogin.click();
	 
	 
	 
	 WebElement location= locateById("location");
	 
     dropDown(location, 3);
	WebElement btnHotels = locateById("hotels");
	dropDown(btnHotels, 3);
	WebElement roomType = locateById("room_type");
	dropDown(roomType, 2);
	WebElement roomnos = locateById("room_nos");
	dropDown(roomnos, 4);
	WebElement adultRoom= locateById("adult_room");
	dropDown(adultRoom, 3);
	WebElement childRoom = locateById("child_room");
	dropDown(childRoom, 2);
	WebElement search = locateById("Submit");
	search.click();
	WebElement radioButton = locateById("radiobutton_0");
	radioButton.click();
	WebElement continue1 = locateById("continue");
	continue1.click();
	WebElement firstName = locateById("first_name");
   inputText(firstName,excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1,1));
	
	WebElement lastName = locateById("last_name");
	inputText(lastName,excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1,2));
	
	WebElement address = locateById("address");
	inputText(address,excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1,3));
	
	WebElement ccNo = locateById("cc_num");
	inputText(ccNo,excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1,4));
	
	WebElement creditCardType= locateById("cc_type");
	dropDown(creditCardType, 2);
	WebElement expiryMonth= locateById("cc_exp_month");
	dropDown(expiryMonth, 3);
	WebElement expiryYear = locateById("cc_exp_year");
	dropDown(expiryYear, 12);
	WebElement cvvNo = locateById("cc_cvv");
	
	inputText(cvvNo,excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx","Sheet1",2,5));
	WebElement bookNow = locateById("book_now");
	bookNow.click();
	Thread.sleep(10000);
	WebElement textOrderNo = locateById("order_no");
	getAttribute(textOrderNo);
	// getAttributeFinal1(textOrderNo);
	//getAttribute(textOrderNo);
	
	
	
	//WebElement textOrderNo = b.locateByXpath("//input[@name='order_no']");
	//String text2 =textOrderNo.getAttribute(); 
	//System.out.println(text2);	
}
	
	public static String getAttributeFinal1(WebElement element) {
		String text = element.getAttribute("value");
		System.out.println(text);
		return text;
	}
}

