package practiceExternal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TheDemoSite {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");		
		WebDriver driver =new ChromeDriver();
		//driver.get("http://thedemosite.co.uk/addauser.php –");
		//driver.get("http://thedemosite.co.uk/login.php –");
		//driver.get("http://newtours.demoaut.com/");
		//driver.get("http://the-internet.herokuapp.com/");
		//driver.get("http://the-internet.herokuapp.com/");
		//WebElement link = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
		//link.click();
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		WebElement src = driver.findElement(By.id("column-a"));
		WebElement desc = driver.findElement(By.id("column-b"));
		Actions a =new Actions(driver);
		a.dragAndDrop(src, desc);
}
}