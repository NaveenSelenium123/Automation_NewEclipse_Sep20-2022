package org.com;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nopcommerce.com/");
	//how to capture the cookies from the browser
	Set<Cookie> cookies = driver.manage().getCookies();
	System.out.println("size of cookies" +cookies.size());
	for (Cookie cookie : cookies) {
		System.out.println(cookie.getName()+ " : " +cookie.getValue());
		
	}
	//how add cookie to the browser
Cookie cokkiobj=new Cookie("MyCookie","123456");
driver.manage().addCookie(cokkiobj);
cookies= driver.manage().getCookies();
System.out.println("size of cookies" +cookies.size());

//how to delete specific cookie
//driver.manage().deleteCookie(cokkiobj);
driver.manage().deleteCookieNamed("MyCookie");
cookies= driver.manage().getCookies();
System.out.println("size of cookies after deletion" +cookies.size());
driver.manage().deleteAllCookies();
cookies= driver.manage().getCookies();
System.out.println("all cookies deletion" +cookies.size());
}
}
