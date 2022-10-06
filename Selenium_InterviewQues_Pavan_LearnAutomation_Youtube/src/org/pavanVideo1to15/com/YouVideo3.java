package org.pavanVideo1to15.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouVideo3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	System.out.println("Title of the Webpage    " +driver.getTitle());
	System.out.println("Title of the currenturl   " +driver.getCurrentUrl());
	System.out.println("=======================page resorce of the web page===========================");
	System.out.println("Title of the Pageresource  " +driver.getPageSource());
}
}
