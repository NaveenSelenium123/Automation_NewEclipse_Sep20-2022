package windowHandlingDay10;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowExe4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("http://www.greenstechnologys.com/python-training.html");
//		Thread.sleep(5000);
//		//WebElement seleniumTitle = driver.findElement(By.id("Python-Solutions-Architect-Training"));
//		
//		driver.findElement(By.xpath("/html/body/section[1]/div/div[1]/div[1]/div/div[2]/div[1]/a")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"Curricu-accordiannn1\"]/div")).click();
//		
//		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
//		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		driver.get(" https://www.amazon.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("REDMI NOTE10" +Keys.ENTER);
		Thread.sleep(5000);
driver.findElement(By.xpath("//span[contains(text(),'Xiaomi Redmi Note 10 Pro (128GB, 6GB) 6.67\", Snap')]")).click();
Thread.sleep(5000);
driver.findElement(By.id("exportsUndeliverable-cart-announce")).click();
System.out.println(driver.findElement(By.xpath("//span[text()='Redmi Note 10 Pro']")).getText());
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"mbc-buybutton-addtocart-1\"]/span/input")).click();
System.out.println("Done");
	}

}
