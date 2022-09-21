package org.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "E:\\projects\\RedBusLogin\\driver\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		driver.get(" https://www.redbus.in/");
		List<WebElement> count = driver.findElements(By.tagName("iframe"));
		System.out.println(count.size());
		
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("sign-in-icon-down"));
		 findElement.click();
		 WebElement findElement2 = driver.findElement(By.id("signInLink"));
		 findElement2.click();
		 Thread.sleep(3000);
		driver.switchTo().frame(1);
		 WebElement findElement3 = driver.findElement(By.id("mobileNoInp"));
		 findElement3.sendKeys("8344350473");
		 //driver.switchTo().defaultContent();
		 //driver.switchTo().frame(0);
		//WebElement findElement4 = driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]"));
		 //findElement4.click();
		
	}

}
