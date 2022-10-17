package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe11 {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.homedepot.com/");
		
		WebElement dept = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[4]/div/ul/li[1]/a"));
		
		
		Actions a =new Actions(driver);
		a.moveToElement(dept).perform();
		WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		a.moveToElement(heat).perform();
		WebElement ac = driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[2]/div/ul/li[9]/a"));
		a.moveToElement(ac).perform();
		driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']")).click();
		

}
}
