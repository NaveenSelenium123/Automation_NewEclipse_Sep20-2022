package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatePopupsAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//https://admin:admin@the-internet.herokuapp.com/basic_auth"
		//https://user:password@URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
