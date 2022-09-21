package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	WebElement btnUpload = driver.findElement(By.id("imagesrc"));
	btnUpload.sendKeys("D:\\JAVA --FILE HANDLING\\DAY10S--1.1.png");
	System.out.println("File Upload Successfully");
	
//	WebElement btnYear = driver.findElement(By.id("yearbox"));
//	
//	
//	Select  s =new Select(btnYear);
//	s.selectByValue("1916");////select[@placeholder='Month']
////	WebElement findElement = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
//	WebElement findElement = driver.findElement(By.xpath("//select[@placeholder='Month']"));
//	Select s1 =new Select(findElement);
//	s.selectByValue("January");
//	
//	
//	// findElement.click();
//	// WebElement findElement2 = driver.findElement(By.id("signInLink"));
//	 //findElement2.click();
//	
//	
//	
//	//String s=(String) att;
//	//System.out.println(att);
//	
//	//WebElement btnLogin = driver.findElement(By.name("login"));
//	//jk.executeScript("arguments[0].click()", btnLogin);

	}
}