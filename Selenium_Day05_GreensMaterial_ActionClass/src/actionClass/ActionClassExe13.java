package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe13 {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get(" https://www.snapdeal.com/");
		Actions a =new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		a.moveToElement(mobile).perform();
		 driver.findElement(By.xpath("//span[text()='Printed Back Covers']")).click();
		
		

}
}
