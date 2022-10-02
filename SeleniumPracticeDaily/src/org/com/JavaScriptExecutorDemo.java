package org.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//draw border
	//WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	//Thread.sleep(3000);
	//JavaScriptUtil.drawBorder(logo,driver);
	
	//Get Title
	//String titleByJS = JavaScriptUtil.getTitleByJS(driver);
	//System.out.println(titleByJS);
	
//WebElement click = driver.findElement(By.xpath("//a[@class='ico-register']"));
//JavaScriptUtil.clickElementByJS(click, driver);	
	 //Generate Alert

//JavaScriptUtil.generateAlert(driver,"Welcome To Java----");

//JavaScriptUtil.refreshBrowserByJS(driver);
//Scroll page
//JavaScriptUtil.scrollPageDown(driver);
//Thread.sleep(5000);
//JavaScriptUtil.scrollPageUp(driver);
	//JavaScriptUtil.zoomPageByJS(driver);
	//WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	WebElement logo = driver.findElement(By.id("customerCurrency"));
	JavaScriptUtil.flash(logo, driver);
	
	//JavaScriptUtil.zoomPageByJS(driver);
	}

}
