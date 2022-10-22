package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PavanExpediaTravels2 {
	public static void main(String[] args) throws InterruptedException {
		String month="March 2023";
		String day="20";
		
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDailyOct10\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.ca/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
//String text = driver.findElement(By.xpath("//h2")).getText();	
		List<WebElement> text = driver.findElements(By.xpath("uitk-date-picker-month-name uitk-type-medium"));
		
		for (WebElement webElement : text) {
			String text2 = webElement.getText();
			//System.out.println(text2);
		}
		
	}
}
