package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Naveen");
		driver.findElement(By.id("lastName")).sendKeys("Naveen");
		driver.findElement(By.id("username")).sendKeys("Naveen");
		driver.findElement(By.id("firstName")).sendKeys("Naveen");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Naveen");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Naveen");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
		
		
		
	}
}