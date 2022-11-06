package BrowserLaucnch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {
	WebDriver driver;
@BeforeClass
private void tc1() {
	WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
driver.manage().window().maximize();
	driver.get("https://www.facebook.com");

}
@Test
public void tc2() {
driver.findElement(By.id("email")).sendKeys("Test");
driver.findElement(By.id("pass")).sendKeys("Test1234");
driver.findElement(By.name("login")).click();
}

@AfterClass
private void tc3() {
	driver.close();
}

}
