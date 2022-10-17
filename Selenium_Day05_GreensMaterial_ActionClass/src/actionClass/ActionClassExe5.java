package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe5 {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.shopclues.com/wholesale.html");
		
		WebElement home = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions a =new Actions(driver);
		a.moveToElement(home).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"facet_brand_fct\"]/li[1]/label")).click();

}
}
