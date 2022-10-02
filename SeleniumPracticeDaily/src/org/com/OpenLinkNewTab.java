package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkNewTab {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
	driver.findElement(By.linkText("Register")).sendKeys(tab);
	
}
}
