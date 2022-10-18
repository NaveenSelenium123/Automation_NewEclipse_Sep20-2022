package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExe6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day12_GreemsMaterial_JavaScript\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.flipkart.com/");
//	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//	WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//	WebElement pass = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//	WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].setAttribute('value','greens@gmail.com')",email);
//	js.executeScript("arguments[0].setAttribute('value','password')",pass);
//	js.executeScript("arguments[0].click()", login);
//	Thread.sleep(3000);
//	Object email1 = js.executeScript("return arguments[0].getAttribute('value')",email);
//	System.out.println(email1);
//	Object pass1 = js.executeScript("return arguments[0].getAttribute('value')",pass);
//	System.out.println(pass1);

	driver.get("https://www.flipkart.com/");
	JavascriptExecutor jk =(JavascriptExecutor) driver;

	WebElement txtUserName = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	jk.executeScript("arguments[0].setAttribute('value','naveen.ja@gmail.com')",txtUserName );
	Object att = jk.executeScript("return arguments[0].getAttribute('value')",txtUserName);
	String s=(String) att;
	System.out.println(s);
	Thread.sleep(5000);
	WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	jk.executeScript("arguments[0].setAttribute('value','GREENS')",txtPassword);
	Object attr = jk.executeScript("return arguments[0].getAttribute('value')",txtPassword);
	String s1=(String) attr;
	System.out.println(s1);
	Thread.sleep(5000);
	WebElement btnLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	jk.executeScript("arguments[0].click()",btnLogin);



}
}
