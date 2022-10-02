package org.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
//driver.findElement(By.id("dob")).click();
	WebElement findElement = driver.findElement(By.id("dob"));
	 findElement.sendKeys("05/07/2021");

	 
Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
year.selectByVisibleText("1993");
Select month=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
month.selectByVisibleText("Jan");
String date="15";
List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
for (WebElement ele : allDates) {
	String dt = ele.getText();
	if(dt.equals(date)) {
		ele.click();
		break;
	}
}
}
	
}
