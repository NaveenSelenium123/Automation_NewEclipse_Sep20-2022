package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermisssionPopupNotification {

	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");	
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		//driver.get("https://redbus.in");
		driver.get("https://bazaar.shopclues.com/");
		

	}

}
