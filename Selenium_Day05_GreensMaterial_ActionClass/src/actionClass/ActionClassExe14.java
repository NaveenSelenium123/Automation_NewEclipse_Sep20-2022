package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe14 {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get(" https://www.snapdeal.com/");
		Actions a =new Actions(driver);
		Thread.sleep(3000);
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[2]/a/span[2]"));
		a.moveToElement(mobile).perform();
		 driver.findElement(By.xpath("//*[@id=\"category2Data\"]/div[1]/div/div/p[9]/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"655702803921\"]/div[3]/div[1]/a/p")).click();	
		

}
}
