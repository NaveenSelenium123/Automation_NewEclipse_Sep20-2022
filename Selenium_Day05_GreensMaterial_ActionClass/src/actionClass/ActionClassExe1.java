package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest= driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement dest1= driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions a =new Actions(driver);
		a.dragAndDrop(source, dest).perform();
		a.dragAndDrop(source, dest1).perform();
		
}
}
