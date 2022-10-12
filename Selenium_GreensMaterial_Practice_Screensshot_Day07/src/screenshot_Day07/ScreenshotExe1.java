package screenshot_Day07;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExe1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		//TakesScreenshot ts=driver();
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//ScreenshotImages//1.png");
		FileUtils.copyFile(f, dest);
		System.out.println("============Done========");
	}

}
