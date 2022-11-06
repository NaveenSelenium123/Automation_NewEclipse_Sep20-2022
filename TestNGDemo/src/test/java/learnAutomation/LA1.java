package learnAutomation;
// TO CALCULATE THE TIME
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LA1 {
	@Test(priority=1)
		public void openGoogle() {
		long startTime  = System.currentTimeMillis();
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.quit();	
			long endTime = System.currentTimeMillis();
			long totalTime=endTime-startTime;
			System.out.println("Total Time taken"+totalTime);
		}
	@Test(priority=2)
	public void openBing() {
		long startTime  = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total Time taken"+totalTime);
	}
	@Test(priority=3)
		public void openYahoo() {
		long startTime  = System.currentTimeMillis();
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://in.search.yahoo.com/?fr2=inr");
			driver.quit();
			long endTime = System.currentTimeMillis();
			long totalTime=endTime-startTime;
			System.out.println("Total Time taken"+totalTime);
		}
	}


