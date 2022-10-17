package locators_Day02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExe4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	driver.navigate().to("https://infinity.icicibank.com/corp/Login.jsp");
	Thread.sleep(3000);
	WebElement txtUsername = driver.findElement(By.id("DUMMY1"));
	txtUsername.sendKeys("Naveen"+Keys.ENTER);
	Alert a=driver.switchTo().alert();
	a.accept();
	driver.switchTo().frame(0);
	WebElement btnArrow = driver.findElement(By.xpath("//*[@id=\"user-id-goahead\"]"));
	btnArrow.click();
	Thread.sleep(3000);
	WebElement btnUsername = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
	btnUsername.sendKeys("Naveen");
	WebElement txtPassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	txtPassword.sendKeys("123456780");
	
}
}
