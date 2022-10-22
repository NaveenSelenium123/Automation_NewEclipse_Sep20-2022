package calender;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ixigo {
	public static void main(String[] args) throws InterruptedException {
		String expectedDay = "29";
		String expectedMonthYear = "December 2022";
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open url
		driver.get("https://www.ixigo.com/buses/chennai-tiruchirapalli-bus-booking");
		// find date picker webelement to perform click action
Thread.sleep(4000);
		WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div[4]/div/div/input"));
		datepicker.click();
		while (true) {
			String calenderMonthYear = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//div[@class='day']"));
				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
			}
		}
	}
}
