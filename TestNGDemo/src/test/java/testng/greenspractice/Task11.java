package testng.greenspractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Task11 {
	WebDriver driver;
    @BeforeClass
    public void beforeClass() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    WebDriverManager.chromedriver().setup();
    }
    @Test(groups="Regression")
    public void Facebook() {
	                 WebElement txtUserName = driver.findElement(By.id("email"));
	                 txtUserName.sendKeys("Naveen");
	                 WebElement txtPassword = driver.findElement(By.id("pass"));
	                 txtPassword.sendKeys("Limat");
	}
    @Test(groups="smoke")
    public void Facebook1() {
	                 WebElement txtUserName = driver.findElement(By.id("email"));
	                 txtUserName.sendKeys("Naveen1");
	                 WebElement txtPassword = driver.findElement(By.id("pass"));
	                 txtPassword.sendKeys("Limat1");
	}
    @Test(groups="sanity")
    public void Facebook2() {
	                 WebElement txtUserName = driver.findElement(By.id("email"));
	                 txtUserName.sendKeys("Naveen2");
	                 WebElement txtPassword = driver.findElement(By.id("pass"));
	                 txtPassword.sendKeys("Limat3");
	}
    @Test(groups="adhoc")
    public void Facebook3() {
	                 WebElement txtUserName = driver.findElement(By.id("email"));
	                 txtUserName.sendKeys("Naveen4");
	                 WebElement txtPassword = driver.findElement(By.id("pass"));
	                 txtPassword.sendKeys("Limat4");
	}
    @AfterClass
    public void afterClass() {
		driver.close();
	}
    
}
