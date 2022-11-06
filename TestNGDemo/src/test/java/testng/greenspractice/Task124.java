package testng.greenspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task124 {
	WebDriver driver;
    @BeforeClass
    public void beforeClass() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
    WebDriverManager.chromedriver().setup();
    }
    @Test(groups="smoke")
   public void registerationForm() {
	WebElement txtFirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	txtFirstName.sendKeys("NaveenSmoke1");
	WebElement txtLastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	txtLastName.sendKeys("NaveenSmoke");
	WebElement txtAddress = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	txtAddress.sendKeys("chennai-60004");
	WebElement txtEmail = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
	txtEmail.sendKeys("naveen@gmail.com");
	WebElement txtPhonenumber = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	txtPhonenumber.sendKeys("0123456789");
}
    @AfterClass
    public void afterClass() {
		driver.close();
	}   
}
