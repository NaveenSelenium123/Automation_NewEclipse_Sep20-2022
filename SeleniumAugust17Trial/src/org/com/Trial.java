package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\OneDrive\\Desktop\\SeleniumAugust17Trial\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			}

}

