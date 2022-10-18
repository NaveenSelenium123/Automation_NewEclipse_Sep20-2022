package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExe1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day12_GreemsMaterial_JavaScript\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement down = driver.findElement(By.xpath("//img[@alt='DMCA.com Protection Status']"));
	WebElement up = driver.findElement(By.xpath("//a[text()='HOME']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(true)",down);
	System.out.println(driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]")).getText());
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(false)",up);
	
	for(int i=0;i<10;i++) {
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)",up);
		Thread.sleep(3000);
	}
}
}
