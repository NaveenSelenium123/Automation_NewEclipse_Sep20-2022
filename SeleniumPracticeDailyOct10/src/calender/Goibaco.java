package calender;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Goibaco {
	public static void main(String[] args) throws InterruptedException {
		String expectedDay = "1";
		String expectedMonthYear = "October 2023";
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open url
		driver.get("https://www.goibibo.com/");
		// find date picker webelement to perform click action
Thread.sleep(4000);
		WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]"));
		datepicker.click();
		while (true) {
			String calenderMonthYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//p[@class='fsw__date']"));
				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
						break;
					}
				}
				
				break;
			} else {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
		//dummy
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[5]/div[2]/div[3]/a[2]")).click();
	}
}