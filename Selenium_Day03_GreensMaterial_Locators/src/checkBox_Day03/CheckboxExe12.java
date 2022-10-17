package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']")).click();
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("132323435445");
		driver.findElement(By.id("checkUser")).click();
	}
}