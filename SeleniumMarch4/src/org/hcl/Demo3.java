package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	JavascriptExecutor jk =(JavascriptExecutor) driver;

	WebElement txtUserName = driver.findElement(By.id("email"));
	jk.executeScript("arguments[0].setAttribute('value','Greens')",txtUserName );
	Object att = jk.executeScript("return arguments[0].getAttribute('value')",txtUserName);

	String s=(String) att;
	System.out.println(s);
	
	
	//Object att = jk.executeScript("return argument[0].getAttribute('value')",txtEmail);
	//System.out.println(att);
	//String s=(String) att;
	
	
	
	
	
	
	WebElement txtPassword = driver.findElement(By.id("pass"));
	jk.executeScript("arguments[0].setAttribute('value','GREENS')",txtPassword);
	Object attr = jk.executeScript("return arguments[0].getAttribute('value')",txtPassword);
	String s1=(String) attr;
	System.out.println(s1);

		}

	}



