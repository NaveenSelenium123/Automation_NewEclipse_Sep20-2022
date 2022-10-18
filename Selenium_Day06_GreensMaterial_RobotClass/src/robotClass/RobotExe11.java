package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotExe11 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement cross= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	cross.click();
	driver.findElement(By.name("q")).sendKeys("Redmi Note10"+Keys.ENTER);
	Thread.sleep(4000);
	WebElement product = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
	Actions a =new Actions(driver);
	a.contextClick(product).perform();
	Thread.sleep(5000);
	Robot r =new Robot();
	for(int i=0;i<=3;i++) {
		Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_Q);
	
}
}
