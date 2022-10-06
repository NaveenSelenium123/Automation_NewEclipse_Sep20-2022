package pavan_Youtube;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction_You23 {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
			Actions a =new Actions(driver);
			a.contextClick(button).perform();
		}
}
