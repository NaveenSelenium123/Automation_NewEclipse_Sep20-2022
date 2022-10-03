package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
	    driver.get("http://automationpractice.com/index.php");
WebElement features = driver.findElement(By.xpath("//a[@title='Women']"));
// Actions ------------------Class
	Actions a =new Actions(driver);
	//a.moveToElement(features).perform();
	//a.moveToElement(features).build().perform();
	
// Action ---------Interface
	Action action=a.moveToElement(features).build();
	action.perform();
	}
}