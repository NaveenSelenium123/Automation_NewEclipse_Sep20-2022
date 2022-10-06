package org_Practice_Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-hamburger-menu")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//div[text()='shop by department']"));
		
		int size = menu.size();

System.out.println(size);
List<WebElement> menu1 = driver.findElements(By.tagName("a"));

int size1 = menu1.size();

System.out.println(size1);
for (int i = 0; i < size1; i++) {
	String attribute = menu1 .get(i).getAttribute("hmenu-item");
	System.out.println(attribute);
}
	}
}
