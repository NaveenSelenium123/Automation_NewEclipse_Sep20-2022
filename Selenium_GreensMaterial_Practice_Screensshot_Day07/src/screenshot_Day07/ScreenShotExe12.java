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
public class ScreenShotExe12 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement search = driver.findElement(By.xpath("//*[@id=\"inputValEnter\"]"));
		search.sendKeys("hp laptop" +Keys.ENTER);
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		WebElement laptop= driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[5]/div[3]"));
		File f = laptop.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//ScreenshotImages//12.png");
		FileUtils.copyFile(f, dest);
		System.out.println("============Done========");
		//System.out.println(search.getText());
		//Thread.sleep(3000);
		
	}

}
