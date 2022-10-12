package windowHandlingDay10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExe2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/ ");
	String pri = driver.getWindowHandle();
	System.out.println(pri);
	WebElement btnSearch = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
	btnSearch.sendKeys("iphones 7"+Keys.ENTER);
	System.out.println(driver.getWindowHandle());
	WebElement phoneX = driver.findElement(By.xpath("(//p[contains(text(),'Apple Silicon Soft cases For Apple iPh')])[1]"));
	phoneX.click();
	Set<String> allwindow = driver.getWindowHandles();
	System.out.println("Before switching all window id");
System.out.println(allwindow);
	for (String string : allwindow) {
		System.out.println(string);
		if(!string.equals(pri)) {
			driver.switchTo().window(string);
		}
	}
	
 driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	Thread.sleep(5000);////span[text()='400']
	WebElement priceTag = driver.findElement(By.xpath("(//span[text()='Rs. 400'])[2]"));
	System.out.println(priceTag.getText());
	driver.switchTo().window(pri);
	WebElement lnk = driver.findElement(By.xpath("//*[@id=\"672128669850\"]/div[3]/div[1]/a/p"));
	lnk.click();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println("After switching");
System.out.println(windowHandles);
}
}
