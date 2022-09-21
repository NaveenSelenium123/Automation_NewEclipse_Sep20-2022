package iFrameAndWindowHandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowClass {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		String pri = driver.getWindowHandle();
		System.out.println(pri);
		WebElement scr = driver.findElement(By.id("twotabsearchtextbox"));
		scr.sendKeys("iphone",Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		WebElement ink1 = driver.findElement(By.xpath("(//span[contains(text(),'Apple')])[9]"));
		ink1.click();
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		for (String string : allWin) {
			if(!string.equals(pri)) {
				driver.switchTo().window(string);
			}
		}
		System.out.println("After switching");
		WebElement add = driver.findElement(By.id("add-to-cart-button"));
		add.click();
		driver.switchTo().window(pri);
		WebElement lnk2 = driver.findElement(By.xpath("(//span[contains(text(),'Apple')])[19]"));
		lnk2.click();
		Set<String> allwin2 = driver.getWindowHandles();
		System.out.println(allwin2);
		List<String>l =new ArrayList<String>();
		l.addAll(allwin2);
		for (int i = 0; i <l.size(); i++) {
			String string = l.get(2);
			driver.switchTo().window(string);
		}
		WebElement add1 = driver.findElement(By.id("add-to-cart-button"));
		add1.click();
		
		
}
}