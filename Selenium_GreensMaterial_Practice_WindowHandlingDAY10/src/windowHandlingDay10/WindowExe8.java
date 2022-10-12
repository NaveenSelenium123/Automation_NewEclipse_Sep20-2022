package windowHandlingDay10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExe8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.snapdeal.com/");
		WebElement btnSearch = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		btnSearch.sendKeys("Hand Sanitizer"+Keys.ENTER);
		String pri = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='product-tuple-description '])[1]")).click();
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		for (String string : allwin) {
			if(!string.equals(pri)) {
driver.switchTo().window(string);				
		}
		
	}
		driver.findElement(By.xpath("(//span[@class='intialtext'])[1]")).click();
}
}