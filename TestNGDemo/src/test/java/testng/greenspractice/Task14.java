package testng.greenspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task14 {
	WebDriver driver;
	@Parameters({"email","pass"})
	@Test
public void openEmail(String email,String pass) {
		WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
        driver.get("https://mail.google.com/");
        driver.manage().window().maximize();
    WebDriverManager.chromedriver().setup();
    WebElement txtEmail = driver.findElement(By.id("identifierId"));
    txtEmail.sendKeys(email);
    WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
    txtPassword.sendKeys(pass);

}
}
