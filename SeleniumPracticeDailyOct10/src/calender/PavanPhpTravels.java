package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PavanPhpTravels {
	public static void main(String[] args) throws InterruptedException {
		String month="March 2023";
		String day="20";
		
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDailyOct10\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/");
		//To click the particular place
		driver.findElement(By.id("departure")).click();
		Thread.sleep(3000);
while(true) {
	// to select the next year
	String text = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[10]/div[1]/table/thead/tr[1]/th[2]")).getText();
if(text.equals(month)) {
	break;
}
else {
	//to select next value
	driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[10]/div[1]/table/thead/tr[1]/th[3]")).click();
}
}
// to select the date
driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[10]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();

	}
}
