package alertFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExe5 { //USE F12 KEY FOR TAKE XPATH
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	WebElement button = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	button.click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(3000);
	a.accept();
}
}
