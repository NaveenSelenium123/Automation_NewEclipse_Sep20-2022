package waitAndWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[contains(text(),'N')]")).click();
	driver.findElement(By.name("firstname")).sendKeys("Greens");
	
}
}
