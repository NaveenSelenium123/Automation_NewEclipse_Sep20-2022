package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe17 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions a =new Actions(driver);
		WebElement elect = driver.findElement(By.xpath("//div[text()='Electronics']"));
		a.moveToElement(elect).perform();
		WebElement electronics = driver.findElement(By.xpath("//a[text()='Electronics GST Store']"));
		electronics.click();
		//WebElement women = driver.findElement(By.xpath("//span[text()='Women']"));
		Thread.sleep(3000);
		WebElement women = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[4]"));
		a.moveToElement(women).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Flats']")).click();
	
}
}