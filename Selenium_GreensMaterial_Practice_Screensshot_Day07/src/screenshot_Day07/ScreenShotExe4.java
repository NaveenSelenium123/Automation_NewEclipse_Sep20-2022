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
public class ScreenShotExe4 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement address = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/div[6]/p"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",address);
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		WebElement perumbakkam = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		File f = address.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//ScreenshotImages//4perumpakkam.png");
		FileUtils.copyFile(f, dest);
		System.out.println("============Done========");
		System.out.println(address.getText());
	
	}

}
