package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDailyOct10\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(3000);
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
		int size = dates.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			String date = dates.get(i).getText();
			if(date.equals("31")) {
				dates.get(i).click();
				break;
			}
		}
	}
}
