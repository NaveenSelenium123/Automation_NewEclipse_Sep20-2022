package practiceExternal;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\SeleniumDayOne\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(" http://automationpractice.com/index.php");
		String pri = driver.getWindowHandle();
		System.out.println(pri);
		WebElement btnLogin = driver.findElement(By.xpath("//a[@class='login']"));
		btnLogin.click();
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("naveen.jan9@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("passwd"));
		txtPassword.sendKeys("Auto@123");
		WebElement btnSignIn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		btnSignIn.click();
		driver.manage().window().maximize();
		WebElement btnAddress = driver.findElement(By.xpath("//span[text()='My addresses']"));
		btnAddress.click();
		WebElement btnAddAddresses = driver.findElement(By.id("addresses"));
		btnAddAddresses.click();
		WebElement txtTshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		txtTshirt.click();
		Thread.sleep(3000);
		
		WebElement inStock = driver.findElement(By.xpath("//span[@class='available-now']"));
		inStock.click();
		WebElement txtAddToCart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
	
		 txtAddToCart.click();
		
}
}