package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("naveen");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("naveen");
	}
}