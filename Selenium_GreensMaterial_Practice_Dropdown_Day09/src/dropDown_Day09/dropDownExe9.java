package dropDown_Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownExe9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("NaveenSelenium");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("login")).click();
		WebElement ddnRoom = driver.findElement(By.id("room_type"));
		Select s =new Select(ddnRoom);
		List<WebElement> all = s.getOptions();
		int size = all.size();
		System.out.println(size );
		for (WebElement x : all) {
			System.out.println(x.getAttribute("value"));
		}
	}

	public static void dropDownStat(WebElement element,int value) {
		Select s =new Select(element);
		s.selectByIndex(value);
		}
}
