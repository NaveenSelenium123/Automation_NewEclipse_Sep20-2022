package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe6 {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement course = driver.findElement(By.xpath("//*[@id=\"main-header-top-greens\"]/div/div/div[2]/div[1]"));
		WebElement testing = driver.findElement(By.xpath("//*[@id=\"browse_courses-greens\"]/ul/li[7]/div[1]/span[1]"));
		Actions a =new Actions(driver);
		a.moveToElement(course).moveToElement(testing).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"submenu-6\"]/ul/li[5]/a/span")).click();
		

}
}
