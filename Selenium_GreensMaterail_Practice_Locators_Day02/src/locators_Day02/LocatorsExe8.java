package locators_Day02;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExe8 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement txtUsername = driver.findElement(By.name("username"));
	txtUsername.sendKeys("Naveen");
	WebElement txtPass= driver.findElement(By.name("password"));
	txtPass.sendKeys("Naveen");
	
}
}
