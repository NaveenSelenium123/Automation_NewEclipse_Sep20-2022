package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomation {
public static void main(String[] args) throws InterruptedException {
	int count=0;
for(int i=0;i<=4;i++) {
	
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
//	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]")).click();
//	Thread.sleep(3000);
//	WebElement baby = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
//	baby.click();
//	Thread.sleep(3000);
//	WebElement remoteControl = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[3]/a[4]"));
//	//remoteControl.click();
//	System.out.println(remoteControl.getText());
//	System.out.println(remoteControl.getTagName());
driver.quit();
count=count+1;
}
System.out.println(count);
}
}