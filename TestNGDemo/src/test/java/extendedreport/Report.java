package extendedreport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Report {
	WebDriver driver;
	static ExtentReports report;
	static ExtentTest Test;
	@BeforeTest
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		report =new ExtentReports("C:\\Users\\navee\\OneDrive\\Desktop\\TestNGDemo\\report\\report.html",true);
		Test=report.startTest("Extent report demo");
		driver.get("https://www.google.com/");
	}
	@AfterTest
	public void tearDown() {
		//driver.close();
		report.endTest(Test);
		report.flush();
	}
	
	@Test(priority=1)
	public void validateTitle() {
		Test.log(LogStatus.INFO, "Test cases validate title is started");
	String title = driver.getTitle();
	System.out.println(title);
	Test.log(LogStatus.PASS,title);
	}
	@Test(priority=2)
	public void GmailNavigate() throws IOException {
		Test.log(LogStatus.INFO, "Test cases Gmail Navigate is started");
		driver.findElement(By.linkText("Gmail")).click();
		Test.log(LogStatus.WARNING,"User is navigating to Sign In");
		driver.findElement(By.linkText("Sign in")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		Test.log(LogStatus.PASS,Test.addScreenCapture(captureScreen(driver)) +title1);
	}
	@Test(priority=4)
	public void skipTest() {
		Test.log(LogStatus.SKIP,"Skip test");
		throw new SkipException("The test is skipped");
	}
	@Test
	public void failTest() {
		Test.log(LogStatus.FAIL,"Fail test");
	}
	@Test(priority=3)
	public void LoginTest() throws IOException {
		try {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Naveen");
		Test.log(LogStatus.PASS,"User Entered password successfully");
		}catch (Exception e) {
			Test.log(LogStatus.FAIL,Test.addScreenCapture(captureScreen(driver)) +"Login test failed");
	}
	}
	public static String  captureScreen(WebDriver driver) throws IOException {
		File scrfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Destinationfile=new File("src/../images"+System.currentTimeMillis()+".png");
		String absolutepath_screen=Destinationfile.getAbsolutePath();
		FileUtils.copyFile(scrfile, Destinationfile);
		return absolutepath_screen;
		
		

	}
}
