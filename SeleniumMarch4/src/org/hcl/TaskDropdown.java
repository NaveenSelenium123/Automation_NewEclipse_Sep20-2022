package org.hcl;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\OneDrive\\Desktop\\SeleniumAugust01\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String pri = driver.getWindowHandle();
		System.out.println(pri);
		driver.get("http://greenstech.in/selenium-course-content.html");
		// to click the frame work 
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]"));
		src.click();
		
		WebElement sampleText = driver.findElement(By.xpath("//p[@class='course-desc']"));
		String text2 = sampleText.getText();
		System.out.println(text2);
		
		Thread.sleep(4000);
			System.out.println(driver.getWindowHandle());
		WebElement textControlStat = driver.findElement(By.xpath("(//a[@target='_blank'])[184]")); 
			Thread.sleep(5000);	
		textControlStat.click();
		Set<String> allwin = driver.getWindowHandles();
	for (String string : allwin) {
		System.out.println(string);
		if(!string.equals(pri)) {
			driver.switchTo().window(string);
		}
	}
		WebElement txtQuestion = driver.findElement(By.xpath("//pre[contains(text(),'QUESTION')]"));
		String text = txtQuestion.getText();
		System.out.println(text);
		}
	}

		
		
		
