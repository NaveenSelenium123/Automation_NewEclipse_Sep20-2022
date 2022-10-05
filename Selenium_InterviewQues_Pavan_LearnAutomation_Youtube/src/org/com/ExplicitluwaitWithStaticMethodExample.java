package org.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitluwaitWithStaticMethodExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	    WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
				By elelocator=By.xpath("//h3[text()='Selenium']");
				waitForElementPresent(driver,elelocator,10).click();
				
	}
	public static WebElement  waitForElementPresent(WebDriver driver,By locator,int timeout) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
wait.until(ExpectedConditions.presenceOfElementLocated(locator));
return driver.findElement(locator);
	}
}
