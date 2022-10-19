package TestNGGreensPracticeSet_15;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Data {  // Not Working
	WebDriver driver;
	@BeforeMethod
	public void beforeClass() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://mail.google.com/");
	driver.manage().window().maximize();
	}
	@AfterMethod
public void afterClass() {
//driver.close();	
}
	@Test(dataProvider="Authentication")
	public void tc(String email,String pass) {
		driver.findElement(By.xpath("(//span[text()='Create an account'])[1]")).click();
		 WebElement txtEmail = driver.findElement(By.id("firstName"));
		    txtEmail.sendKeys(email);
		    WebElement txtPassword = driver.findElement(By.id("lastName"));
		    txtPassword.sendKeys(pass);
	}
	@DataProvider(name="Authentication")
	public Object[][]  data() {
		return new Object[][] {
			{"user1","Test123"},
			{"user2","Test456"},
			{"user3","Test789"},
			{"user4","Testing"}
		};
	}

}
