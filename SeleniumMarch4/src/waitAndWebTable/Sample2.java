package waitAndWebTable;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://letcode.in/waits");
	WebElement simple = driver.findElement(By.id("accept"));
	simple.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	Alert until= wait.until(ExpectedConditions.alertIsPresent());
	String text = until.getText();
	System.out.println(text);
	Alert alert =driver.switchTo().alert();
	alert.accept();
	
}
}
