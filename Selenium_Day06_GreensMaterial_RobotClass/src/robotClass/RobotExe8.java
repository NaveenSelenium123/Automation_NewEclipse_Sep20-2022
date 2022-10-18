package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotExe8 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement selenium= driver.findElement(By.xpath("//*[@id=\"heading303\"]/h2"));
	selenium.click();
	WebElement day6 = driver.findElement(By.xpath("//*[@id=\"collapse303\"]/div/div/ul/li[6]/a"));
	Actions a =new Actions(driver);
	a.contextClick(day6).perform();
	Robot r =new Robot();
	for(int i=0;i<5;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
	
}
}
