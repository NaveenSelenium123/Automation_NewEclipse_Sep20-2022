package org.com;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;
public class FluentWaitExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Fluent wait declaration
		Wait<WebDriver> mywait =new FluentWait<WebDriver>(driver)
                               .withTimeout(Duration.ofSeconds(30))
                                .pollingEvery(Duration.ofSeconds(5))
                                .ignoring(NoSuchElementException.class);
		
        driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
		// usage of fluent wai
WebElement element=mywait.until(new Function<WebDriver,WebElement>(){
	public WebElement apply(WebDriver driver) {
		return driver.findElement(By.xpath("//h3[text()='Selenium']"));
	}
	});
element.click();
}
	}

