package testng.greenspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPractice  {
	WebDriver driver;
    @BeforeClass
    public void beforeClass() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
    WebDriverManager.chromedriver().setup();
    }
    @Test
    public void validateForm() {
    	DemoQAPom s =PageFactory.initElements(driver, DemoQAPom.class);
    	s.setFirstName("Naveen");
    	s.setLastName("Kumar");
    	s.setEmail("naveen.@gmail.com");
    	s.setAddress("chennai-600044");
    	s.setPhonenumber("1234567890");
    	s.setPassword("123456789");
    	s.setConfirmPassword("123456789");
	}
    @Test
    public void checkBox() {
    	DemoQAPom1 s1 =PageFactory.initElements(driver, DemoQAPom1.class);
    	s1.setRadio();
    	s1.setHobbiesCricket();
    	s1.setHobbiesMovies();
    	s1.setHobbiesHockey();
    	s1.setSubmitButton();

	}
    @Test
    public void dropDowm() throws InterruptedException {
    	DemoQAPom2 s2 =PageFactory.initElements(driver, DemoQAPom2.class);
    	s2.setTextLanguage(3);
    	s2.setTextSkill(4);
    	s2.setTextSelectCountry(4);
    	s2.setTextDay(2);
    	s2.setTextMonth(4);
         s2.setTextYear(4);
	}
    @AfterClass
    public void afterClass() {
		//driver.close();
	}
}
