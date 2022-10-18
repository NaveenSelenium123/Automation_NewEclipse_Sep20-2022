package alertFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExe6 {// NOT WORKING
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	driver.manage().window().maximize();
	WebElement button = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
	button.click();
	driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]")).click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(3000);
	a.accept();
}
}
