package calender;//working
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FareCompare {
	public static void main(String[] args) throws InterruptedException, AWTException {
		String expectedDay = "10";
		String expectedMonthYear = "April 2023";
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open url
		driver.get("https://www.kayak.co.in/");
		// find date picker webelement to perform click action
Thread.sleep(4000);
		WebElement datepicker = driver.findElement(By.xpath("(//span[@role='button'])[1]"));
		datepicker.click();
		Thread.sleep(4000);
		while (true) {
			String calenderMonthYear = driver.findElement(By.xpath("(//div[@class='wHSr-monthName'])[1]")).getText();
			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//div[@class='mkUa mkUa-pres-mcfly']"));
				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						Robot r =new Robot();
						r.keyPress(KeyEvent.VK_ENTER);
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("(//button[@role='button'])[8]")).click();
			}
		}
	}
}
