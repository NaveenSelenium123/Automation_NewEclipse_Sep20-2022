package calender;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TripAdvisor {
	public static void main(String[] args) throws InterruptedException, AWTException {
		String expectedDay = "28";
		String expectedMonthYear = "September 2023";
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open url
		driver.get("https://www.travanya.com/domestic-flights/cheap-flights-from-trichy-to-chennai-trz-maa/");
		// find date picker webelement to perform click action
Thread.sleep(4000);
		WebElement datepicker = driver.findElement(By.id("txtFDept"));
		datepicker.click();
		Thread.sleep(4000);
		while (true) {//  (//span[@class='ui-datepicker-month'])[1]
			String calenderMonthYear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
			System.out.println(calenderMonthYear);
			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						driver.findElement(By.xpath("//button[text()='Done']")).click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
	}
}
