package calender;//not working
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OneTravel {
	public static void main(String[] args) throws InterruptedException {
		String expectedDay = "29";
		String expectedMonthYear = "Oct22,2022";
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open url
		driver.get("https://www.onetravel.com/");
		// find date picker webelement to perform click action
Thread.sleep(4000);
		WebElement datepicker = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		datepicker.click();
		while (true) {////nav[@class='calendar__nav']
			String calenderMonthYear = driver.findElement(By.xpath("//header[@class='calendar__header']")).getText();
			System.out.println(calenderMonthYear);
			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//a[@class=' month-date']"));
				System.out.println(daysList);
				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//a[@class='calendar-nav__next icon  rightNav']")).click();
			}
		}
	}
}
