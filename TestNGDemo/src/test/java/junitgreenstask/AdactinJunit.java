package junitgreenstask;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import io.github.bonigarcia.wdm.WebDriverManager;
import testng.greenspractice.DemoQAPom;

public class AdactinJunit {
	static WebDriver driver;
    @BeforeClass
    public static void beforeClass() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
        driver.get(" http://www.adactin.com/HotelApp/");
        driver.manage().window().maximize();
    WebDriverManager.chromedriver().setup();
    }
    @Test
    public void login() {
    	AdactinLogin a =PageFactory.initElements(driver, AdactinLogin.class);
    	a.setTxtUserName("NAVEENREDMINOTE10");
    	a.setTxtPassword("Adactin@123");
    	a.setTxtLogin();

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
}
