package windowHandlingDay10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowExe5 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement mouseCourse = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/a"));
		Actions a =new Actions(driver);
		a.moveToElement(mouseCourse).perform();
		driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/ul/li[2]/a/span")).click();
		WebElement mouseCC = driver.findElement(By.xpath("//*[@id=\"masterprgm-container\"]/div/div/div[2]/a/button"));
Robot r =new Robot();
a.doubleClick(mouseCC).perform();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

	}

}
