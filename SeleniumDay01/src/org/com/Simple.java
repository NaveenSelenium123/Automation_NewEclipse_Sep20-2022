package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\SeleniumDay01\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("Naveen");
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("Naveen");
	
}
}
