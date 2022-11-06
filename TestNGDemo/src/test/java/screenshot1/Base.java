package screenshot1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");	
	}
	public void failed() {
	File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(scr, new File("C:\\Users\\navee\\OneDrive\\Desktop\\TestNGDemo\\ErrorScreenshot\\s.jpg"));
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
	}
}
