package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiwi2 {
	public static void main(String[] args) throws InterruptedException {
		String expectedDay = "29";
		String expectedMonthYear = "September '23";
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open url
		driver.get("https://paytm.com/flights/chennai-to-tiruchirapally-flight-tickets");
		// find date picker webelement to perform click action
Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@id=\"ddate\"]")).click();
		WebElement datepicker = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		datepicker.click();
		while (true) {
			String calenderMonthYear = driver.findElement(By.xpath("(//p[@class='QyCw'])[1]")).getText();
			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//div[@class='_2JMZ']"));
				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"moveToNext\"]")).click();
			}
		}
	}
}
