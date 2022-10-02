package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeys {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://text-compare.com/");
	WebElement text1 = driver.findElement(By.id("inputText1"));
	WebElement text2 = driver.findElement(By.id("inputText2"));
	 text1.sendKeys("welcome to selenium");
	 Actions a =new Actions(driver);
	 //ctrl + A
	 a.keyDown(Keys.CONTROL);
	 a.sendKeys("a");
	 a.keyUp(Keys.CONTROL);
	 a.perform();
	 
	 //ctrl +C
	 a.keyDown(Keys.CONTROL);
	 a.sendKeys("c");
	 a.keyUp(Keys.CONTROL);
	 a.perform();
	 
	 //TAB -Shift to text2 box
	 a.sendKeys(Keys.TAB);
	 a.perform();
	 
	 // ctrl + v
	 a.keyDown(Keys.CONTROL);
	 a.sendKeys("v");
	 a.keyUp(Keys.CONTROL);
	 a.perform();
	 
	 // compare texts\
	 if(text1.getAttribute("value").equals(text2.getAttribute("value")))
	 System.out.println("Text Copied");
	 else
		 System.out.println("Text Copied");	 
}
}
