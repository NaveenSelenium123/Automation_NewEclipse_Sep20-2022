package testng.greenspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	WebDriver driver;
    @BeforeClass
    public void beforeClass() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/account/login");
        driver.manage().window().maximize();
    WebDriverManager.chromedriver().setup();
    }
    @Test
    private void Flipkart() {
    	Task2Pom a =PageFactory.initElements(driver, Task2Pom.class);
    	a.setEmail("naveeen.jan9@gmail.com");
    	a.setPassword("1234567889");
    	a.setLogin();
	}
    @AfterClass
    private void closeBrowser() {
		//driver.close();

	}

}
