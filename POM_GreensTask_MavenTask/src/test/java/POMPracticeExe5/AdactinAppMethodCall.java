package POMPracticeExe5;

public class AdactinAppMethodCall extends BaseClass{
	public static void main(String[] args) {
		browserConChrome();
		openApplication("https://adactinhotelapp.com/");
		maximizeWindow();
		Login1 a=new Login1();
		inputText(a.getTxtUserName(),"NaveenSelenium");
		inputText(a.getTxtPassword(),"123456");
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
		inputText(d.getFirstName(),"NAVEEN");
		inputText(d.getLastName(),"KUMAR");
		inputText(d.getBillingAddress(),"16 east street,chennai-600044");
		inputText(d.getCreditCardNo(),"1234567890123456");
		dropdown(d.getCreditCardType(),2);
		dropdown(d.getExpyMonth(),2);
		dropdown(d.getExpyYear(),12);
		inputText(d.getCvvNo(),"123");
		click(d.getBookNow());
		BookConfirmation5 e =new BookConfirmation5();
		 getAttribute(e.getBookingConfirm());	
	}	

}
