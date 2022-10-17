package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[@id=\"mobileNoInp\"]")).sendKeys("744783773878"+Keys.ENTER);
		Thread.sleep(5000);
		//driver.switchTo().frame(1);
//driver.findElement(By.id("recaptcha-anchor")).click();
	}
}