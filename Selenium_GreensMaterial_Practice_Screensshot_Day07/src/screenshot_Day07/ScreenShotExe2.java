package screenshot_Day07;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShotExe2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement articles = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/div[2]/div/a"));
		js.executeScript("arguments[0].scrollIntoView(true)",articles);
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//ScreenshotImages//2.png");
		FileUtils.copyFile(f, dest);
		System.out.println("============Done========");
	
	}

}
