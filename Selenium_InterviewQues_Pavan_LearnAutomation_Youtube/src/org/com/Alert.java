package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//Normal Alert
	//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Thread.sleep(3000);
	//driver.switchTo().alert().accept();
	
	// Alert with ok and cancel button
	//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	//Thread.sleep(3000);
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	
	
	// ALERT WITH SEND KEYS METHOD
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert a = (Alert) driver.switchTo().alert();
	
	Thread.sleep(3000);
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
}
}
