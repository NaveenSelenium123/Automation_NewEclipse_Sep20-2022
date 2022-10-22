package calender;// not working

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDailyOct10\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	//to remove popup
	driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
	driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[@class=\\\"DayPicker-Day\\\"][contains(@aria-label,'Nov 12 2022')]")).click();
	
	WebElement click1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[1]"));
	Thread.sleep(3000);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click",click1);
	System.out.println(click1.getText());













}
}
