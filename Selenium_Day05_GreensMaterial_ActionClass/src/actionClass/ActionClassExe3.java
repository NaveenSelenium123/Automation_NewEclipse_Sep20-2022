package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
		Actions a =new Actions(driver);
		a.moveToElement(home).perform();
		Thread.sleep(3000);
		WebElement bath = driver.findElement(By.xpath("//a[text()='Cleaning & Bath']"));
		a.moveToElement(bath).perform();
		WebElement clean = driver.findElement(By.xpath("//a[text()='Cleaning Supplies']"));
		a.moveToElement(clean).perform();
		clean.click();
}
}
