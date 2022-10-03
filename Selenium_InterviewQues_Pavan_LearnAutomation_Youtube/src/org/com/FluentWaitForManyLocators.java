package org.com;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;
public class FluentWaitForManyLocators {
	public static void main(String[] args) {	
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
    driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	By elementLoc=By.xpath("//h3[text()='Selenium']");
	waitForElementWithFluentWait(driver,elementLoc);
}
	public static WebElement waitForElementWithFluentWait(WebDriver driver,By locator) {
		Wait<WebDriver>wait =new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
		
		WebElement element=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//h3[text()='Selenium']"));
			}
			});
		element.click();
		return element;
		
	}	
}