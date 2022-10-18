package alertFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExe3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement button = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
	button.click();
	driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(3000);
	a.sendKeys("Welcome To Alert");
	a.dismiss();
}
}
