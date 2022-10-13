package locators_Day02;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExe9 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement txtUsername = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	txtUsername.sendKeys("Naveen");
	WebElement txtUser1= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	txtUser1.sendKeys("Naveen");
	WebElement txtUser2= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	txtUser2.sendKeys("Theni");
	WebElement txtUser3= driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
	txtUser3.sendKeys("Naveen@gmail.com");
	WebElement txtUser4= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	txtUser4.sendKeys("8374839279202");
	WebElement txtUser6= driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
	txtUser6.sendKeys("Naveen");
	WebElement txtUser7=driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
	txtUser7.sendKeys("Naveen");
}
}
