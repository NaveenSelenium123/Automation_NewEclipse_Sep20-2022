package iFrameAndWindowHandling;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleIframe {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\projects\\\\automation_testing\\\\March4\\\\driver\\\\chromedriver.exe");		
		WebDriver driver =new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		List<WebElement> iframeCount = driver.findElements(By.tagName("iframe"));
		System.out.println("iframsCount"+iframeCount.size());
		driver.switchTo().frame("frame1");
		WebElement txt = driver.findElement(By.xpath("//body//input"));
		txt.sendKeys("ABCD");
		driver.switchTo().frame("frame3");
		WebElement check = driver.findElement(By.id("a"));
		check.click();
		driver.switchTo().parentFrame();
		//WebElement txt1 = driver.findElement(By.xpath("//body//input"));
		//txt1.sendKeys("ABCD");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement ddn = driver.findElement(By.id("animals"));
		Select s =new Select(ddn);
		s.selectByIndex(3);
		
}
}