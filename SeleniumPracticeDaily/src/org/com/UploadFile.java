package org.com;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UploadFile {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://monsterindia.com");
	driver.findElement(By.xpath("(//a[@title='Click to upload your resume'])[1]")).click();
	//driver.findElement(By.id("file-upload")).sendKeys("D:\\Naveen_Resume.pdf");
	// normal click method not working so go far javascript executor
	WebElement button = driver.findElement(By.id("file-upload"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()",button);
	Robot rb =new Robot();
	rb.delay(2000);
	StringSelection ss =new StringSelection("C:\\Naveen_Resume.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.delay(2000);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}
}
