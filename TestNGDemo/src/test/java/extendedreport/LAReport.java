package extendedreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LAReport {
	WebDriver driver;
	ExtentReports extentReport;
	//ExtentHtmlReporter
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		//extentReport=new ExtentReports(null);
		driver.manage().window().maximize();
	}
	@Test
	public void openGoogle() {
		driver.get("http://www.google.co.in");
		String title = driver.getTitle();
		if(title.equals("Google")){
		System.out.println("Passed");	
		}else {
			System.out.println("Failed");	
		}
	}
	@Test
	public void openBing() {
		driver.get("http://www.bing.com");
		String title = driver.getTitle();
		if(title.equals("bing")){
		System.out.println("Passed");	
		}else {
			System.out.println("Failed");	
		}
	}
	@Test
	public void openWikipedia() {
		driver.get("http://www.wikipedia.org");
		String title = driver.getTitle();
		if(title.equals("wikipedia")){
		System.out.println("Passed");	
		}else {
			System.out.println("Failed");	
		}
	}
	
}
