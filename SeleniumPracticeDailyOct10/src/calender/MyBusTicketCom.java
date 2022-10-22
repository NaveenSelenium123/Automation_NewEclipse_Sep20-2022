package calender;// not working

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyBusTicketCom {
	public static void main(String[] args) throws InterruptedException {
		String expectedDay = "23";
		String expectedMonthYear = "November 2022";
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open url
		driver.get("https://www.mybustickets.in/Bus-Booking/Chennai-to-Trichy");
		// find date picker webelement to perform click action
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='button'])[7]")).click();
		Thread.sleep(4000);
		WebElement datepicker = driver.findElement(By.xpath("//input[@class='txtbox hasDatepicker']"));
		datepicker.click();
		while (true) {
	String calenderMonthYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				//break;
			}
		}
	}
}
