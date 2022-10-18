package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExe5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day12_GreemsMaterial_JavaScript\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement email = driver.findElement(By.id("username"));
	WebElement pass = driver.findElement(By.id("password"));
	WebElement login = driver.findElement(By.id("login"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','greens')",email);
	js.executeScript("arguments[0].setAttribute('value','password')",pass);
	js.executeScript("arguments[0].click()", login);
	
}
}
