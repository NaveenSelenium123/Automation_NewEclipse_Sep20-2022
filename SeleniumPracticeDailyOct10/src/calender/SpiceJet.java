package calender;  // not working

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {
public static void main(String[] args) throws InterruptedException {
	String expectedDay = "30";
	String expectedMonthYear = "March 2023";
	// launch chrome browser
	System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	// open url
	driver.get("https://www.spicejet.com/");
	// find date picker webelement to perform click action
Thread.sleep(4000);
	WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[1]/div[1]/div[2]/div[1]"));
	datepicker.click();// (//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[6]
	while (true) {//
		String calenderMonthYear = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-k8qxaj'])[1]")).getText();
		System.out.println(calenderMonthYear);
		if (calenderMonthYear.equals(expectedMonthYear)) {////div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']
			List<WebElement> daysList = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41']"));
			for (WebElement e : daysList) {
				String calenderDay = e.getText();
				if (calenderDay.equals(expectedDay)) {
					e.click();
					break;
				}
			}
			break;
		} else {
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[1]")).click();
		}
	}
}
}
