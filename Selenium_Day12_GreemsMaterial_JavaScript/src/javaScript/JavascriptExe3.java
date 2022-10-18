package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExe3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day12_GreemsMaterial_JavaScript\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement down = driver.findElement(By.xpath("(//h2[@class='mb-0'])[7]"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(true)",down);

	
}
}
