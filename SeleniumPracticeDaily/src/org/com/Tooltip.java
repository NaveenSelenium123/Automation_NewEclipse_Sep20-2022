package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/tooltip/");
	driver.switchTo().frame(0);
	WebElement toolTip = driver.findElement(By.id("age"));
	String attribute = toolTip.getAttribute("title");
	System.out.println(attribute);
}
}
