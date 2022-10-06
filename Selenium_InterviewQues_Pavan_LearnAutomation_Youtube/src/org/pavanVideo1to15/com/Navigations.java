package org.pavanVideo1to15.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.get("https://www.amazon.com");
		driver.navigate().to("https://www.snapdeal.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
