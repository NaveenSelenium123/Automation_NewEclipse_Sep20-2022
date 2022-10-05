package dropDown_Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownExe5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(3000);
	WebElement ddnYear = driver.findElement(By.id("day"));
	Select s=new Select(ddnYear);
	List<WebElement> all = s.getOptions();
	int size = all.size();
	System.out.println(size);
	System.out.println("Total month displayed here");
	for(int i=0;i<size;i++) {
		if(i%2 == 1) {
			System.out.println(all.get(i).getText());
		}
	}
	
}	

}
