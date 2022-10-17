package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe4 {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.shopclues.com/wholesale.html");
		
		//WebElement home = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		//WebElement home2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[5]"));
		//Actions a =new Actions(driver);
		//a.moveToElement(home).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Mobiles & More']")).click();
		driver.findElement(By.xpath("//label[@for='Above 5000']")).click();
			//driver.findElement(By.xpath("//*[@id=\"facet_shopclues_surety_fct\"]/li/label")).click();
	//driver.findElement(By.xpath("//a[text()='Realme']")).click();	
	//Thread.sleep(5000);
	//driver.findElement(By.xpath("//label[@for='Rs. 10000 and Above']")).click();
		WebElement offer = driver.findElement(By.xpath("//a[text()='Offers']"));
		
		Actions a =new Actions(driver);
		a.moveToElement(offer).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Mens Tshirt']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"sort_price_fct\"]/li[5]/label")).click();
		
}
}
