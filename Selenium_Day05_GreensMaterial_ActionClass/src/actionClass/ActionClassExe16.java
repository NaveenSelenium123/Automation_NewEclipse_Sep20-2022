package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe16 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a =new Actions(driver);
		Thread.sleep(3000);
		WebElement sign = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		a.moveToElement(sign).perform();
		 driver.findElement(By.xpath("//span[text()='Your Wish List']")).click();
		
	

}
}
