package calender;    //not working
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BookingCom {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDailyOct10\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.booking.com/");	
	String checkInMonth="October 2022";
	String dateVal="30";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
while(true) {  //(//div[@class='bui-calendar__month'])[1]
	 String month = driver.findElement(By.xpath("(//h3[@aria-live='polite'])[1]")).getText();
if(month.equals(checkInMonth)) {
	break;
}
else{
//driver.findElement(By.xpath("//div[contains(@class,'bui-calendar__control bui-calendar__control--next')]//*[local-name()='svg']")).click();
	driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();

}

 //List<WebElement> ele = driver.findElements(By.xpath("(//tbody)[1]//tr//td/span"));  // //span[@tabindex='-1']
List<WebElement> ele = driver.findElements(By.xpath("//span[@tabindex='-1']"));  
for (WebElement element : ele) {
	String date = element.getText();
	if(date.equals(dateVal)) {
		element.click();
		Thread.sleep(3000);
		break;
	}
}
}
}
}