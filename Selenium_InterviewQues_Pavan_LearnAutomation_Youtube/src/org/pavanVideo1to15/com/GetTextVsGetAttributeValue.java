package org.pavanVideo1to15.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttributeValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Flogin");
		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("naveen@gmail.com");
		Thread.sleep(4000);
		Email.clear();
		Email.sendKeys("naveen@gmail.com");
		System.out.println(Email.getAttribute("value"));
		WebElement btnLogintext = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
		System.out.println(btnLogintext.getAttribute("type"));
System.out.println(btnLogintext.getText());
	}

}
