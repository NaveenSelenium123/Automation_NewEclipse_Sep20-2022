package getText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExe9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement txtSearch= driver.findElement(By.name("keyword"));
	txtSearch.sendKeys("Hand Sanitizer"+Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"626837652238\"]/div[3]/div[1]/a/p")).click();
}
}
