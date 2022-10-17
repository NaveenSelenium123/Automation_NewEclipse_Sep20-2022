package getText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExe11 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
	driver.findElement(By.id("autocomplete")).sendKeys("Redmi mobile"+Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"product_list\"]/div[3]/div[1]/a/h2")).click();
}
}
