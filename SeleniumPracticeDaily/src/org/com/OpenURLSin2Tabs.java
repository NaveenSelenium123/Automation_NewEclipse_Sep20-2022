package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLSin2Tabs {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	//driver.switchTo().newWindow(WindowType.TAB);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.opencart.com/");
}
}
