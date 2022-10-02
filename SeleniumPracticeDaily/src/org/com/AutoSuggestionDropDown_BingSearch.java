package org.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown_BingSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
	System.out.println("Size of auto suggestion" +list.size());
	for (WebElement listitem : list) {
	if(listitem.getText().contains("download"))	{
		listitem.click();
		break;
	}
	}
	
	
	}

}
