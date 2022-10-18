package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotExe3 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.findElement(By.xpath("//*[@id=\"heading20\"]/h2")).click();
	WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
	Actions a =new Actions(driver);
	a.doubleClick(cts).perform();
	
}
}
