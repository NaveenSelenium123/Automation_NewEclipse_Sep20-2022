package AdctinUsingDropdownMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class dropDownExe8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("NaveenSelenium");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("login")).click();
		//select hotel
		WebElement ddnLocation = driver.findElement(By.id("location"));
		WebElement ddnHotel = driver.findElement(By.id("hotels"));
		WebElement ddnRoom = driver.findElement(By.id("room_type"));
		WebElement ddnNoofRoom = driver.findElement(By.id("room_nos"));
		WebElement ddnAdult = driver.findElement(By.id("adult_room"));
		WebElement ddnChildern = driver.findElement(By.id("child_room"));
		dropDownStat(ddnLocation,3);
		dropDownStat(ddnHotel,2);
		dropDownStat(ddnRoom,3);
		dropDownStat(ddnNoofRoom,2);
		dropDownStat(ddnAdult,3);
		dropDownStat(ddnChildern,2);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		//Book  a hotel
		driver.findElement(By.id("first_name")).sendKeys("Naveen");
		driver.findElement(By.id("last_name")).sendKeys("Naveen");
		driver.findElement(By.id("address")).sendKeys("Chennai");
		driver.findElement(By.id("cc_num")).sendKeys("0123456789123456");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		WebElement expMonth= driver.findElement(By.id("cc_exp_month"));
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		dropDownStat(ccType,3);
		dropDownStat(expMonth,2);
		dropDownStat(expYear,12);
		driver.findElement(By.id("book_now")).click();
	Thread.sleep(10000);
		WebElement txtOrder = driver.findElement(By.id("order_no"));
		String text = txtOrder.getAttribute("value");
		System.out.println(text);

	}
	public static void dropDownStat(WebElement element,int value) {
		Select s =new Select(element);
		s.selectByIndex(value);
		}
	public static void click(WebElement element) {
		element.click();
	}
}
