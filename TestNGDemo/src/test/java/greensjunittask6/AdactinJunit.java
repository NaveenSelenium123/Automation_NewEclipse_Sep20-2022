package greensjunittask6;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import io.github.bonigarcia.wdm.WebDriverManager;
import testng.greenspractice.DemoQAPom;

public class AdactinJunit extends BaseClassPom{
	static WebDriver driver;
    @BeforeClass
    public static void beforeClass() {
    	BaseClassPom a=new BaseClassPom();
    	a.browserConChrome();
    	a.openApplication("http://www.adactin.com/HotelApp/");
    }
    @Test
    public void login() {
    	AdactinLogin b =PageFactory.initElements(driver, AdactinLogin.class);
    	b.setTxtUserName("NAVEENREDMINOTE10");
    	b.setTxtPassword("Adactin@123");
    	b.setTxtLogin();

	}
    @Test
    public void searchHotel() throws InterruptedException {
    	SearchHotel1 b=PageFactory.initElements(driver, SearchHotel1.class);
    	Thread.sleep(3000);
    	b.setLocation("Sydney");
    	b.setHotels(2);
    	b.setRoomType(3);
    	b.setNumberOfRooms(1);
    	b.setAdultPerRoom(2);
    	b.setChildrenPerRoom(1);
    	b.setSearch();
	}
    @Test
    public void selectHotel() {
    	SelectHotel2 c=PageFactory.initElements(driver, SelectHotel2.class); 	
        c.getSelect();
        c.getContinue1();
	}
}
