package greensjunittask88;   // for adactin pom framework6     (1-2-3-4-5)[total ]
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import junitgreenstask8.BaseClassPom;
public class FacebookPOM extends BaseClassPom   {
	@BeforeClass
	public static  void beforeclass() {
		browserConChrome();
		openApplication("https://adactinhotelapp.com/");
		maximizeWindow();	
	}
	@Test
	public  void tc1() throws IOException {
		AdactinPOM a=new AdactinPOM();
		inputText(a.getTxtUserName(),excelRead("C:\\Users\\navee\\git\\PageObjectModel\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 7));
		inputText(a.getTxtPassword(),excelRead("C:\\Users\\navee\\git\\PageObjectModel\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 6));
		click(a.getTxtLogin());	
		SearchHotel1 b =new SearchHotel1();
		dropdown(b.getLocation(),5);
		dropdown(b.getHotels(),2);
		dropdown(b.getRoomType(),3);
		dropdown(b.getNumberOfRooms(),1);
		dropdown(b.getAdultPerRoom(),3);
		dropdown(b.getChildrenPerRoom(),2);
		click(b.getSearch());
		SelectHotel2 c =new SelectHotel2();
		click(c.getSelect());
		click(c.getContinue1());
		bookAHotel3 d =new bookAHotel3();
		inputText(d.getFirstName(),excelRead("C:\\Users\\navee\\git\\PageObjectModel\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 1));
		inputText(d.getLastName(),excelRead("C:\\Users\\navee\\git\\PageObjectModel\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 2));
		inputText(d.getBillingAddress(),excelRead("C:\\Users\\navee\\git\\PageObjectModel\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 3));
		inputText(d.getCreditCardNo(),excelRead("C:\\Users\\navee\\git\\PageObjectModel\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 4));
		dropdown(d.getCreditCardType(),2);
		dropdown(d.getExpyMonth(),2);
		dropdown(d.getExpyYear(),12);
		inputText(d.getCvvNo(),excelRead("C:\\Users\\navee\\git\\PageObjectModel\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1, 5));
		click(d.getBookNow());
		//BookingConfirmation4 e =new BookingConfirmation4();
		//gettext(e.getBookingConfirm()); 
		//jsGetText(e.getBookingConfirm());

	}
	
	}	


