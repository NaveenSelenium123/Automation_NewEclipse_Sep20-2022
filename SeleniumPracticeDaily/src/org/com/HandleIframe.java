package org.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(3000);
		// 1 st frame
driver.switchTo().frame("packageListFrame");
driver.findElement(By.xpath("/html/body/main/ul/li[4]/a")).click();
driver.switchTo().defaultContent();
Thread.sleep(3000);
//2 st frame
driver.switchTo().frame("packageFrame");
driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[4]/a")).click();
driver.switchTo().defaultContent();
Thread.sleep(3000);

//3 st frame
driver.switchTo().frame("classFrame");
driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
driver.switchTo().defaultContent();

	}

}
