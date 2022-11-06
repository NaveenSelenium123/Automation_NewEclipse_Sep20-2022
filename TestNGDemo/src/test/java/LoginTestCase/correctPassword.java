package LoginTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class correctPassword {
	@Test
	@Parameters({"userName","password"})
	public void loginWithCorrectPassword(String uName,String pword) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement txtUserName= driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys(uName);
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		txtPassword.sendKeys(pword);
		WebElement btnLogin= driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		driver.quit();
	}
}
