package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		Actions a =new Actions(driver);
		a.moveToElement(prime).perform();
		Thread.sleep(3000);
	driver.findElement(By.id("multiasins-img-link")).click();	
}
}
