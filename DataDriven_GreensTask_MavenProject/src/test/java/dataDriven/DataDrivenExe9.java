package dataDriven;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class DataDrivenExe9 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		BaseClassAdactin b =new BaseClassAdactin();
	b.browserConfigChrome();
	b.openApplication("http://www.adactin.com/HotelApp/");
	b.maximizeWindow();
	WebElement txtUser = b.locateById("username");
	b.inputText(txtUser,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1, 7));
	WebElement txtPass = b.locateById("password");
	b.inputText(txtPass,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1, 6));
	WebElement txtLogin = b.locateById("login");
	WebElement txtAdactin = b.locateByXpath("//td[contains(text(),'The best')]");
	String text = b.getText(txtAdactin);
	b.excelWrite("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 4, 2, text);
	 txtLogin.click();
	 
	 
	 
	 WebElement location= b.locateById("location");
	 
	b.dropDown(location, 3);
	WebElement btnHotels = b.locateById("hotels");
	b.dropDown(btnHotels, 3);
	WebElement roomType = b.locateById("room_type");
	b.dropDown(roomType, 2);
	WebElement roomnos = b.locateById("room_nos");
	b.dropDown(roomnos, 4);
	WebElement adultRoom= b.locateById("adult_room");
	b.dropDown(adultRoom, 3);
	WebElement childRoom = b.locateById("child_room");
	b.dropDown(childRoom, 2);
	WebElement search = b.locateById("Submit");
	search.click();
	WebElement radioButton = b.locateById("radiobutton_0");
	radioButton.click();
	WebElement continue1 = b.locateById("continue");
	continue1.click();
	WebElement firstName = b.locateById("first_name");
	b.inputText(firstName,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1,1));
	
	WebElement lastName = b.locateById("last_name");
	b.inputText(lastName,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1,2));
	
	WebElement address = b.locateById("address");
	b.inputText(address,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1,3));
	
	WebElement ccNo = b.locateById("cc_num");
	b.inputText(ccNo,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1,4));
	
	WebElement creditCardType= b.locateById("cc_type");
	b.dropDown(creditCardType, 2);
	WebElement expiryMonth= b.locateById("cc_exp_month");
	b.dropDown(expiryMonth, 3);
	WebElement expiryYear = b.locateById("cc_exp_year");
	b.dropDown(expiryYear, 12);
	WebElement cvvNo = b.locateById("cc_cvv");
	
	b.inputText(cvvNo,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx","Sheet1",2,5));
	WebElement bookNow = b.locateById("book_now");
	bookNow.click();
	
	WebElement textOrderNo = b.locateById("order_no");
textOrderNo.getAttribute("value");
	
	
	//WebElement textOrderNo = b.locateByXpath("//input[@name='order_no']");
	//String text2 =textOrderNo.getAttribute(); 
	//System.out.println(text2);	
}
}

