package pavan_Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement source=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		Actions a =new Actions(driver);
		a.dragAndDrop(source, dest).perform();
	}
}
