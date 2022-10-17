package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("7387398399390");
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Naveen");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
	}
}