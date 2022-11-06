package testng.greenspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task12 {
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
	txtFirstName.sendKeys("NaveenSmoke");
	WebElement txtLastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	txtLastName.sendKeys("NaveenSmoke");
	WebElement txtAddress = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	txtAddress.sendKeys("chennai-60004");
	WebElement txtEmail = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
	txtEmail.sendKeys("naveen@gmail.com");
	WebElement txtPhonenumber = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	txtPhonenumber.sendKeys("0123456789");
}
    @Test
    public void dropDown() throws InterruptedException {
		WebElement selectYear = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
		Select s =new Select(selectYear);
		s.selectByValue("1917");
		WebElement selectMonth = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select s2 =new Select(selectMonth);
		s2.selectByValue("January");
		WebElement selectDay = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select s3=new Select(selectDay);
		s3.selectByValue("12");
		WebElement selectSkills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Select s4=new Select(selectSkills);
		s4.selectByValue("Adobe InDesign");
		//WebElement selectCountry = driver.findElement(By.xpath("//span[@role='combobox']"));
		//Select s5=new Select(selectCountry);
		//s5.selectByValue("Denmark");
		//WebElement selectLanguage = driver.findElement(By.id("msdd"));
		WebElement selectLanguage = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		Select s6=new Select( selectLanguage);
		s6.selectByVisibleText("Croatian");
		//s6.selectByValue("English");
		
		
	}
    @AfterClass
    public void afterClass() {
		//driver.close();
	}   
    
}
