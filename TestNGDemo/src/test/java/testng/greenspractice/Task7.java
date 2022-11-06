package testng.greenspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task7 {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
public  void tc(String bwsr) {
	if(bwsr.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(bwsr.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(bwsr.equals("mozila")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	driver.get("https://www.flipkart.com/account/login");
	driver.manage().window().maximize();
	WebElement txtMail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	txtMail.sendKeys("8344350473");
	WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
	txtPassword.sendKeys("1234567890");
	WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	btnLogin.click();
}
}
