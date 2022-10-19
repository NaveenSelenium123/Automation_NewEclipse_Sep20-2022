package JunitGreensPracticeExe8;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class AdactinAppMethodCall extends BaseClass {
	@BeforeClass
	public static  void beforeclass() {
		browserConChrome();
		openApplication("https://adactinhotelapp.com/");
		maximizeWindow();	
	}
	@Test
	public  void tc1() throws IOException {
		Login1 a=new Login1();
		inputText(a.getTxtUserName(),excelRead("E:\\Windows_Old Eclipse Projects\\Junit_GreensTask_MavenProject\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 7));
		inputText(a.getTxtPassword(),excelRead("E:\\Windows_Old Eclipse Projects\\Junit_GreensTask_MavenProject\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 6));
		click(a.getTxtLogin());	
		SearchHotel2 b =new SearchHotel2();
		dropdown(b.getLocation(),5);
		dropdown(b.getHotels(),2);
		dropdown(b.getRoomType(),3);
		dropdown(b.getNumberOfRooms(),1);
		dropdown(b.getAdultPerRoom(),3);
		dropdown(b.getChildrenPerRoom(),2);
		click(b.getSearch());
		SelectHotel3 c =new SelectHotel3();
		click(c.getSelect());
		click(c.getContinue1());
		BookHotel4 d =new BookHotel4();
		inputText(d.getFirstName(),excelRead("E:\\Windows_Old Eclipse Projects\\Junit_GreensTask_MavenProject\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 1));
		inputText(d.getLastName(),excelRead("E:\\Windows_Old Eclipse Projects\\Junit_GreensTask_MavenProject\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 2));
		inputText(d.getBillingAddress(),excelRead("E:\\Windows_Old Eclipse Projects\\Junit_GreensTask_MavenProject\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 3));
		inputText(d.getCreditCardNo(),excelRead("E:\\Windows_Old Eclipse Projects\\Junit_GreensTask_MavenProject\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 4));
		dropdown(d.getCreditCardType(),2);
		dropdown(d.getExpyMonth(),2);
		dropdown(d.getExpyYear(),12);
		inputText(d.getCvvNo(),excelRead("E:\\Windows_Old Eclipse Projects\\Junit_GreensTask_MavenProject\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 5));
		click(d.getBookNow());
		//BookingConfirmation4 e =new BookingConfirmation4();
		//gettext(e.getBookingConfirm()); 
		//jsGetText(e.getBookingConfirm());
	}

}
