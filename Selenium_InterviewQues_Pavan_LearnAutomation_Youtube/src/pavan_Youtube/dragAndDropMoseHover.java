package pavan_Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropMoseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		WebElement source=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		Actions a =new Actions(driver);
		a.dragAndDrop(source, dest).perform();
		a.dragAndDrop(source1, dest).perform();
	}
}
