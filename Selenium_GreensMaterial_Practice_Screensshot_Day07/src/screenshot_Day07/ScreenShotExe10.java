package screenshot_Day07;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShotExe10 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("iphone" +Keys.ENTER);
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		Thread.sleep(3000);
		WebElement phone = driver.findElement(By.xpath("(//div[@class='a-section'])[1]"));
		File f = phone.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//ScreenshotImages//10phone.png");
		FileUtils.copyFile(f, dest);
		System.out.println("============Done========");
		//System.out.println(search.getText());
		//Thread.sleep(3000);
		
	}

}
