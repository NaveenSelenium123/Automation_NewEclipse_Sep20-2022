package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//*[@id=\"heading20\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"collapse20\"]/div/div/ul/li[6]/a")).click();

	}
}
