package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.findElement(By.id("from_station")).sendKeys("Chennai");
		driver.findElement(By.id("to_station")).sendKeys("Madurai");
		driver.findElement(By.id("trainFormButton")).click();
	}
}