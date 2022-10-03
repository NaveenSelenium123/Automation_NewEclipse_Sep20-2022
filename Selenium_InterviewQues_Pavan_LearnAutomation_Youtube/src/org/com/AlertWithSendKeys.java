package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithSendKeys {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	// ALERT WITH SEND KEYS METHOD
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		org.openqa.selenium.Alert a =driver.switchTo().alert();
		System.out.println("The message dispalyed in alert:" +a.getText());
		Thread.sleep(3000);
		a.sendKeys("Welcome");
		Thread.sleep(3000);
		a.accept();
}
}
