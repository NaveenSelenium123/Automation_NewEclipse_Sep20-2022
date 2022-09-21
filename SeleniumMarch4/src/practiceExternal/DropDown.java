package practiceExternal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {   ///http://the-internet.herokuapp.com/dropdown
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");		
		WebDriver driver =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		Select  s=new Select(dropDown);
		s.selectByIndex(1);
	
	
	
}
}