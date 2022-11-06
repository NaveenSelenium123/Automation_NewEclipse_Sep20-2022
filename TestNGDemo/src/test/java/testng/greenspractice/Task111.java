package testng.greenspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task111 {
	WebDriver driver;
    @BeforeClass
    public void beforeClass() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    WebDriverManager.chromedriver().setup();
    }
    @Test(groups="adhoc")
    public void Facebook() {
	                 WebElement txtUserName = driver.findElement(By.id("email"));
	                 txtUserName.sendKeys("Naveen8");
	                 WebElement txtPassword = driver.findElement(By.id("pass"));
	                 txtPassword.sendKeys("Limat8");
	}
    @Test(groups="sanity")
    public void Facebook1() {
	                 WebElement txtUserName = driver.findElement(By.id("email"));
	                 txtUserName.sendKeys("Naveen18");
	                 WebElement txtPassword = driver.findElement(By.id("pass"));
	                 txtPassword.sendKeys("Limat18");
	}
    @Test(groups="smoke")
    public void Facebook2() {
	                 WebElement txtUserName = driver.findElement(By.id("email"));
	                 txtUserName.sendKeys("Naveen28");
	                 WebElement txtPassword = driver.findElement(By.id("pass"));
	                 txtPassword.sendKeys("Limat38");
	}
    @Test(groups="Regression")
    public void Facebook3() {
	                 WebElement txtUserName = driver.findElement(By.id("email"));
	                 txtUserName.sendKeys("Naveen48");
	                 WebElement txtPassword = driver.findElement(By.id("pass"));
	                 txtPassword.sendKeys("Limat47");
	}
    @AfterClass
    public void afterClass() {
		driver.close();
	}
}
