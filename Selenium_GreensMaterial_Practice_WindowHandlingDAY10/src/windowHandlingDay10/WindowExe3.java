package windowHandlingDay10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExe3 {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		String pri = driver.getWindowHandle();
		System.out.println(pri);
		WebElement btnSearch = driver.findElement(By.id("headerSearch"));
		btnSearch.sendKeys("celling fan "+Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		WebElement phoneX = driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[5]"));
		phoneX.click();
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("Before switching all window id");
	System.out.println(allwindow);
		for (String string : allwindow) {
			System.out.println(string);
			if(!string.equals(pri)) {
				driver.switchTo().window(string);
			}
		}
		

		
//		
//	//	WebElement lnk = driver.findElement(By.xpath("//*[@id=\"672128669850\"]/div[3]/div[1]/a/p"));
//		//lnk.click();
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println("After switching");
//	System.out.println(windowHandles);
//	}

	}

}
