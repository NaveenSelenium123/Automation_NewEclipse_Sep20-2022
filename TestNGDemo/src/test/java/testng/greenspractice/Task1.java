package testng.greenspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import datadrivenpractice.Facebook;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	WebDriver driver;
    @BeforeClass
    public void beforeClass() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    WebDriverManager.chromedriver().setup();
    }
    @Test
    private void Facebook() {
		WebElement txtUserName= driver.findElement(By.id("email"));
		txtUserName.sendKeys("naveen@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("123456");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
    @AfterClass
    private void closeBrowser() {
		driver.close();

	}

}
