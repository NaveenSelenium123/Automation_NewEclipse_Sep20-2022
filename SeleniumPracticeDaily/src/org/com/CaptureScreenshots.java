package org.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nopcommerce.com/en/demo");
	//Full Page Screenshot
//	TakesScreenshot ts=(TakesScreenshot) driver;
//	File src = ts.getScreenshotAs(OutputType.FILE);
//	File trg = new File(".\\screenshot\\homepage.png");
//	FileUtils.copyFile(src, trg);
	
	//Sectional Screenshot
	//WebElement section = driver.findElement(By.xpath("//img[@class='mobile-store-image']"));
	//File src = section.getScreenshotAs(OutputType.FILE);
    //File trg = new File(".\\screenshot\\section.png");
	//FileUtils.copyFile(src, trg);
	
	
	//single webelement screenshot
	WebElement element = driver.findElement(By.xpath("//a[@class='btn frontend-button']"));
	File src = element.getScreenshotAs(OutputType.FILE);
    File trg = new File(".\\screenshot\\element1.png");
	FileUtils.copyFile(src, trg);
	
}
}
