package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotExe5 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement resume= driver.findElement(By.xpath("//*[@id=\"heading201\"]/h2"));
	resume.click();
	WebElement model4 = driver.findElement(By.xpath("//*[@id=\"collapse201\"]/div/div/ul/li[4]/a"));
	Actions a =new Actions(driver);
	a.contextClick(model4).perform();
	Robot r =new Robot();
	for(int i=0;i<4;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
	
}
}
