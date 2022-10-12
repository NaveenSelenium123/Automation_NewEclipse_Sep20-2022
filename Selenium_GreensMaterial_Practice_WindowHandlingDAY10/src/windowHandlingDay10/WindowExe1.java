package windowHandlingDay10;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExe1 {
public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.amazon.com/");
		String pri = driver.getWindowHandle();
		System.out.println(pri);
		WebElement btnSearch = driver.findElement(By.id("twotabsearchtextbox"));
		btnSearch.sendKeys("iphones X"+Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		WebElement phoneX = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		phoneX.click();
		Set<String> allwindow = driver.getWindowHandles();
		//System.out.println(allwindow);
		for (String string : allwindow) {
			System.out.println(string);
			if(!string.equals(pri)) {
				driver.switchTo().window(string);
			}
		}
		
		//driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement priceTag = driver.findElement(By.xpath("(//span[text()='$329.00'])[8]"));
		//WebElement priceTag = driver.findElement(By.xpath("(//span[text()='$13.99'])[2]"));
		Set<String> allwinPrice = driver.getWindowHandles();
		System.out.println(allwinPrice);
		WebElement priceTag = driver.findElement(By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr/td[2]/span[1]/span[2]"));
		System.out.println(priceTag.getText());
//		driver.findElement(By.id("add-to-cart-button")).click();
		//Thread.sleep(10000);
//		
//driver.switchTo().window(pri);
//		Thread.sleep(10000);
//		WebElement lnk2 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[22]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
//		lnk2.click();
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles);
}
}
