package dropDown_Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownExe6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	WebElement country =driver.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]"));
	Thread.sleep(3000);
	Select s=new Select(country );
	List<WebElement> all = s.getOptions();
	int size = all.size();
	System.out.println(size);
	for (WebElement x : all) {
		System.out.println(x.getText());
	}
	
}
}
