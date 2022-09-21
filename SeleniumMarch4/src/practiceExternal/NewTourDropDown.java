package practiceExternal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTourDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\SeleniumDayOne\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement txtRadio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		txtRadio.click();
		WebElement btnPassenger = driver.findElement(By.xpath("//select[@name='passCount']"));
		Select s =new Select(btnPassenger);
		s.selectByIndex(2);////select[@name='fromPort']
		WebElement btnFrom = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s2 =new Select(btnFrom);
		s2.selectByIndex(2);
		WebElement btnMnth = driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select s3 =new Select(btnMnth);
		s3.selectByIndex(2);
		
		WebElement btnDay = driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select s4 =new Select(btnDay);
		s4.selectByIndex(2);
		
		WebElement btnPort = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s5 =new Select(btnPort);
		s5.selectByIndex(2);
		
		WebElement btnToMnth = driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select s6 =new Select(btnToMnth);
		s6.selectByIndex(2);
		
		WebElement btnToDay = driver.findElement(By.xpath("//select[@name='toDay']"));
		Select s7 =new Select(btnToDay);
		s7.selectByVisibleText("30");
		
		WebElement serviceClass = driver.findElement(By.xpath("(//input[@name='servClass'])[3]"));
		serviceClass.click();////select[@name='airline']
		
		WebElement btnAirLine = driver.findElement(By.xpath("//select[@name='airline']"));
		Select s8 =new Select(btnAirLine);
		s8.selectByVisibleText("Pangea Airlines");
		
		WebElement btnClick = driver.findElement(By.xpath("//input[@type='image']"));
		btnClick.click();
		
		
}
}