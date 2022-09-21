package seleniumdailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightButtonColour {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		JavascriptExecutor j =(JavascriptExecutor)driver;
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		j.executeScript("arguments[0].setAttribute('style','background:orange;border: solid 10px orange');",txtEmail );
		txtEmail.sendKeys("Naveen");
		WebElement txtPass = driver.findElement(By.id("pass"));
		j.executeScript("arguments[0].setAttribute('style','background:blue;border: solid 10px blue');",txtPass );
		txtPass.sendKeys("Testing123");
		//WebElement btnLogin = driver.findElement(By.name("login"));
		//btnLogin.click();
		
	}
}
