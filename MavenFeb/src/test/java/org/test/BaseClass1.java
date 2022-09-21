package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	WebDriver driver;// instance
	public void browserConChrome() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();

	}
	public void openApplication(String url) {
	driver.get(url);
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public WebElement webElementLocateById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}
	public WebElement locateByXpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}
	public WebElement locateByTagName(String tagName) {
		WebElement findElement = driver.findElement(By.tagName(tagName));
		return findElement;
	}
	//element.sendkey("value")
	public void inputText(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void click(WebElement element) {
		element.click();
			}

	
}


