package org.pavanVideo1to15.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofWebElement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	WebElement searchElements = driver.findElement(By.id("small-searchterms"));
	System.out.println("Dispaly status===   " +searchElements.isDisplayed());
	System.out.println("Enabled status===   " +searchElements.isEnabled());
	WebElement radio = driver.findElement(By.id("pollanswers-1"));
	radio.click();
	WebElement radio1 = driver.findElement(By.id("pollanswers-2"));
	System.out.println("radio button selected   " +radio.isSelected());
	System.out.println("radio button not selected    " +radio1.isSelected());
}
}
