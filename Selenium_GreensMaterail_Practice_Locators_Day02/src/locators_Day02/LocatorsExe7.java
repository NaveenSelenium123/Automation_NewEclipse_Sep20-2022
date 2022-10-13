package locators_Day02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExe7 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/");
	List<WebElement> count = driver.findElements(By.tagName("frame"));
	System.out.println(count.size());
	//driver.switchTo().frame(0);
	driver.switchTo().frame("login_page");
	Thread.sleep(3000);
	WebElement txtCustomerID = driver.findElement(By.xpath("//input[@type='text']"));
	txtCustomerID.sendKeys("Naveen");
	
}
}
