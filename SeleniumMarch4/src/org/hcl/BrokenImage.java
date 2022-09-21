package org.hcl;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {
	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");		
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
		List<WebElement> img = driver.findElements(By.tagName("img"));
		int size = img.size();
		System.out.println("IMAGE count" +size);
		int count=0;
		for (int i = 0; i <img.size(); i++) {
			String attribute = img.get(i).getAttribute("href");
			if(!(attribute == null)) {
				URL url =new URL(attribute);
				URLConnection openConnection=url.openConnection();
				HttpsURLConnection connection =(HttpsURLConnection)openConnection;
				 int responseCode = connection.getResponseCode();
				 if(!(responseCode == 200)) {
					count++;
					System.out.println(attribute);
				 }
			}
		}
		System.out.println("broken image" + count);
	}
}
