package learnAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SuiteLA {
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	@BeforeSuite
	public void launchBrowser() {
		 startTime  = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
	}
	@Test
	public void openGoogle() {
		driver.get("https://www.google.co.in/");	
	}
@Test
public void openBing() {	
	driver.get("https://www.bing.com/");
}
@Test
	public void openYahoo() {
		driver.get("https://in.search.yahoo.com/?fr2=inr");
	}
@AfterSuite
public void closeBrowser() {
	driver.quit();
	 endTime = System.currentTimeMillis();
	 totalTime=endTime-startTime;
	System.out.println("Total Time taken"+totalTime);
}	
}
