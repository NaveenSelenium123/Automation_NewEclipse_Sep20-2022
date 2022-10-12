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
public class ScreenShotExe3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement training = driver.findElement(By.xpath("/html/body/footer/div[2]/div[3]/div[4]/ul/li[1]/a"));
		js.executeScript("arguments[0].scrollIntoView(true)",training);
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//ScreenshotImages//3.png");
		FileUtils.copyFile(f, dest);
		System.out.println("============Done========");
		System.out.println(training.getText());
	
	}

}
