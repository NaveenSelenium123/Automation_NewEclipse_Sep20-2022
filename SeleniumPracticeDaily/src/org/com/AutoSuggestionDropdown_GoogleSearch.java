package org.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java tutorial");
		Thread.sleep(3000);
List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));
Thread.sleep(3000);
System.out.println("Size of auto suggestion" +list.size());
	for (WebElement listitem : list) {
	if(listitem.getText().contains("beginners"))	{
		listitem.click();
		break;
	}
	}
	
	

	}

}
