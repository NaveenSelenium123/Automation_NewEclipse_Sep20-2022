package getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExe8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement txtUsername = driver.findElement(By.id("username"));
	txtUsername.sendKeys("Naveen");
	System.out.println(txtUsername.getAttribute("value"));
	WebElement txtUserpass = driver.findElement(By.id("password"));
	txtUserpass.sendKeys("Pass");
	System.out.println(txtUserpass.getAttribute("value"));

}
}
