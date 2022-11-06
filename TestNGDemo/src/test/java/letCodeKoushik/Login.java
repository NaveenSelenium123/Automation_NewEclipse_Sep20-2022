package letCodeKoushik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Login {
	@DataProvider(name="tc1")
	public String[] [] LearnDataProvider() {
	String [][] data =new String[2][2];
	data[0][0] ="naveen@gmail.com";
	data[0][1] ="pass!223";
	
	data[1][0] ="naveen1@gmail.com";
	data[1][1]="pass123";
	return data;
	

	}
	@Test(dataProvider="tc1")
	public void tc1(String email,String pass)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement txtEmail= driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}
