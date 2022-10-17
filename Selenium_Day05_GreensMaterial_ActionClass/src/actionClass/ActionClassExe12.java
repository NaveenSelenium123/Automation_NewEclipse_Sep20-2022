package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe12 {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.homedepot.com/");
		Actions a =new Actions(driver);
		WebElement dept = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[4]/div/ul/li[1]/a"));
		a.moveToElement(dept).perform();
		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
		WebElement interior = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(interior).perform();
		driver.findElement(By.xpath("//a[text()='Ceiling Paint']")).click();
		

}
}
