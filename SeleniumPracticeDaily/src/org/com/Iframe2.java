package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width_css");
	
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	driver.switchTo().frame(0);
	
	System.out.println("Text present in inner frmae:   " +driver.findElement(By.xpath("/html/body/h1")).getText());
	driver.switchTo().parentFrame();
	String text = driver.findElement(By.xpath("/html/body/p")).getText();
	System.out.println("text present in outer frmae:  " +text);
}
}
