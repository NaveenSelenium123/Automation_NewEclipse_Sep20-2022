package org.com;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/key_presses");
Actions a =new Actions(driver);
a.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);
a.sendKeys(Keys.BACK_SPACE).perform();
Thread.sleep(3000);
a.sendKeys(Keys.ESCAPE).perform();
Thread.sleep(3000);
a.sendKeys(Keys.SPACE).perform();
Thread.sleep(3000);
}
}
