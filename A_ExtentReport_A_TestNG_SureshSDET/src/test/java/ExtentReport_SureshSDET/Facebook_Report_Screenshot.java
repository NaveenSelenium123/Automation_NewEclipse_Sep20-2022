package ExtentReport_SureshSDET;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class Facebook_Report_Screenshot {
WebDriver driver;
static ExtentReports report;
static ExtentTest Test;
@BeforeTest
public void browserLanuch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	 report= new ExtentReports("E:\\Windows_Old Eclipse Projects\\A_ExtentReport_A_TestNG_SureshSDET\\report\\Facebook1.html",false);
	 Test = report.startTest("Extent report to Validate the login functionality");
	driver.get("https://www.facebook.com");
}

@AfterTest
public void tearDown() {
	driver.close();
	report.endTest(Test);
	report.flush();
}
@Test
public void loginToFacebook() throws IOException {
	Test.log(LogStatus.INFO,"This test case to login the Facebook Application");
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("123456");
	Test.log(LogStatus.PASS, Test.addScreenCapture(captureScreen(driver))+"login test case passeed");
	driver.findElement(By.name("login")).click();
	Test.log(LogStatus.WARNING,"This test case to login the Facebook Application unsuccessfull");
}

@Test
public void validateTitle() {
	Test.log(LogStatus.INFO, "Test cases validate title is started");
String title = driver.getTitle();
System.out.println(title);
Test.log(LogStatus.PASS,title);
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
public static String  captureScreen(WebDriver driver) throws IOException {
	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File d=new File("E:\\Windows_Old Eclipse Projects\\A_ExtentReport_A_TestNG_SureshSDET\\report\\fb.jpeg");
	String absolutepath_screen = d.getAbsolutePath();
	FileUtils.copyFile(s, d);
	return absolutepath_screen;

}
}
