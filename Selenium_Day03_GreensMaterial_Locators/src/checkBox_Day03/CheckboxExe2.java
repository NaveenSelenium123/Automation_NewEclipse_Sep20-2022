package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Apple mobile");
	driver.findElement(By.id("pass")).sendKeys("Apple");
	driver.findElement(By.name("login")).click();
	

}
}
