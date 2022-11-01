package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDailyOct10\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.findElement(By.id("onward_cal")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//td[@class='current day']")).click();
	//driver.findElement(By.id("onward_cal")).sendKeys("29-Oct-2022");

////*[@id="rb-calendar_onward_cal"]/table/tbody/tr[8]/td[1]
}
}
