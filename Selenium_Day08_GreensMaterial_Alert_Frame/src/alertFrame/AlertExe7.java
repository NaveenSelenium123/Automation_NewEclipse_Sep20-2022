package alertFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExe7 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame(0);
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Greens");
	 driver.findElement(By.xpath("//a[@onclick='return fLogon();']")).click();
	 driver.findElement(By.id("fldPasswordDispId")).sendKeys("password");
	 driver.findElement(By.xpath("//a[@ondblclick='return fLogon()']")).click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(3000);
	a.accept();
}
}
