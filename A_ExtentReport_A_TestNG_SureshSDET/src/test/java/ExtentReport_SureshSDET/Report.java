package ExtentReport_SureshSDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
		report =new ExtentReports("E:\\Windows_Old Eclipse Projects\\A_ExtentReport_A_TestNG_SureshSDET\\report\\report.html",true);
		Test=report.startTest("Extent report demo");
		driver.get("https://www.google.com/");
	}
	@AfterTest
	public void tearDown() {
		//driver.close();
		report.endTest(Test);
		report.flush();
	}
	
	@Test
	public void validateTitle() {
		Test.log(LogStatus.INFO, "Test cases validate title is started");
	String title = driver.getTitle();
	System.out.println(title);
	Test.log(LogStatus.PASS,title);
	}
	@Test
	public void GmailNavigate() {
		Test.log(LogStatus.INFO, "Test cases Gmail Navigate is started");
		driver.findElement(By.linkText("Gmail")).click();
		Test.log(LogStatus.WARNING,"User is navigating to Sign In");
		driver.findElement(By.linkText("Sign in")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		Test.log(LogStatus.PASS,title1);
	}
	@Test
	public void skipTest() {
		Test.log(LogStatus.SKIP,"Skip test");
	}
	@Test
	public void failTest() {
		Test.log(LogStatus.FAIL,"Fail test");
		Assert.assertTrue(false);
	}

}
