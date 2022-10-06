package pavan_Youtube;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class You30pdf_FileDownload {
	public static void main(String[] args) throws InterruptedException {
		String location=System.getProperty("user.dir")+"\\Downloads";	
			HashMap preferences=new HashMap();
			preferences.put("plugins.always_open_pdf_externally", true);	
			preferences.put("download.default_directory",location);
					
			ChromeOptions options =new ChromeOptions();
			options.setExperimentalOption("prefs",preferences);
			System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://demo.imacros.net/Automate/PDFdemo");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"main\"]/p[2]/a")).click();
		}
}
