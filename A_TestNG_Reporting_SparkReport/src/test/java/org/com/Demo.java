package org.com;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	ExtentReports extent;
	File file;
	ExtentSparkReporter sparkReporter;
	WebDriver driver;
	@BeforeClass
	public  void BrowserLaunch() {
		extent=new ExtentReports();
		file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
	 sparkReporter=new ExtentSparkReporter(file);
	 sparkReporter.viewConfigurer().viewOrder().as(new ViewName[] {
				ViewName.DASHBOARD,
				ViewName.CATEGORY,
				ViewName.EXCEPTION,
				ViewName.TEST,
				ViewName.DEVICE,
				ViewName.AUTHOR
		}).apply();

sparkReporter.config().setTheme(Theme.DARK);
sparkReporter.config().setReportName("Tutorial Ninja Execution Results");
sparkReporter.config().setDocumentTitle("TN App Test Results");
sparkReporter.config().setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
sparkReporter.config().setCss(".badge-primary{background-color:#058d0b}");
sparkReporter.config().setJs("document.getElementsByClassName('logo')[0].style.dispaly='none';");
	extent.attachReporter(sparkReporter);	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https:www.facebook.com");	

}
	@Test	
public void BusinessLogic() {
		ExtentTest eTest2=extent.createTest("TestTwo","This text is describing TestOne1");
		eTest2.log(Status.PASS,"TestTwo Started");
driver.findElement(By.id("email")).sendKeys("Greens");
	
	driver.findElement(By.id("pass")).sendKeys("Greens");

}
	@Test
	public void report() {
		ExtentTest eTest3=extent.createTest("TestThree","This is the description test three");
		eTest3.log(Status.INFO,"TestThree Execution started");
		eTest3.log(Status.SKIP,"TestThree got successfully executed");
		eTest3.assignAuthor("Arun1");
		eTest3.assignCategory("Regression");
		eTest3.assignCategory("Windows 11 FireFoix");

		ExtentTest eTest4=extent.createTest("TestFour","This is the description test four");
		eTest4.log(Status.INFO,"TestFour Execution started");
		eTest4.log(Status.PASS,"TestFoure got successfully executed");
		eTest4.assignAuthor("Kamal");
		eTest4.assignCategory("Smoke");
		eTest4.assignCategory("Windows 11 Chrome 106");

		ExtentTest eTest5=extent.createTest("TestFIVE","This is the description test five");
		eTest5.log(Status.INFO,"TestFIVE Execution started");
		eTest5.log(Status.FAIL,"TestFIVE got successfully executed");
		eTest5.assignAuthor("Kamal","Arun","Arun1");
		eTest5.assignCategory("Smoke","Regression");
		eTest5.assignCategory("Windows 11 Chrome 106");


		ExtentTest eTest6=extent.createTest("Testsix","This is the description test five");
		eTest6.log(Status.INFO,"Testsix Execution started");
		eTest6.log(Status.FAIL,"Testsix got successfully executed");
		eTest6.assignAuthor("Kamal");
		eTest6.assignAuthor("Arun");
		eTest6.assignAuthor("Arun1");
		eTest6.assignCategory("Smoke");
		eTest6.assignCategory("Sanity");
		eTest6.assignCategory("Regression");
		eTest6.assignCategory("Windows 11 Chrome 106");

		ExtentTest eTest7=extent.createTest("Testseven","This is the description test seven");
		eTest7.log(Status.INFO,"Testseven Execution started");
		eTest7.log(Status.FAIL,"Testseven got successfully executed");
		eTest7.assignAuthor(new String[] {"Kamal","Arun","Arun1"});
		eTest7.assignCategory(new String[] {"Smoke","Sanity","Regression"});
		eTest7.assignCategory("Windows 11 Edge");
		
		
		
		
		
		Capabilities cap=((RemoteWebDriver)driver).getCapabilities();
		extent.setSystemInfo("Browser Name:", cap.getBrowserName());
		extent.setSystemInfo("Browser Version:", cap.getVersion());
		extent.setSystemInfo("Operating System:",System.getProperty("os.name"));
		extent.setSystemInfo("Java version:",System.getProperty("java.version"));
		extent.setSystemInfo("Username:",System.getProperty("user.name"));

	}
	@AfterClass
public  void CloseBrowser() throws IOException {
		File sourceScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath=System.getProperty("user.dir")+"\\Screenshots\\Tutorialninja.png";
		FileUtils.copyFile(sourceScreenshot,new File(destinationScreenshotPath));
		ExtentTest eTest1=extent.createTest("TestOne","This text is describing TestOne1");
		eTest1.log(Status.INFO,"TestOne Started");
		eTest1.log(Status.INFO,"TestOne Progress");
		eTest1.addScreenCaptureFromPath(destinationScreenshotPath);
		eTest1.log(Status.INFO,"TestOne Started");
		eTest1.log(Status.INFO,"TestOne Started");
		eTest1.log(Status.INFO, "<b>Chrome browser launched</b>");
		eTest1.log(Status.INFO, "<i>Chrome browser launched</i>");
		eTest1.log(Status.INFO, "<u>Chrome browser launched</u>");
		eTest1.log(Status.INFO, "<h1>Chrome browser launched</h1>");
		eTest1.log(Status.INFO,MarkupHelper.createLabel("TestOne Started",ExtentColor.RED));
		HashSet<String> alist=new HashSet<String>();
		alist.add("Sunday");
		alist.add("Monday");
		alist.add("Tuesday");
		alist.add("Wednesday");
		alist.add("Thursday");
		alist.add("Friday");
		alist.add("Saturday");
		 eTest1=extent.createTest("TestOne");
		eTest1.log(Status.INFO, MarkupHelper.createOrderedList(alist));
		System.out.println("=================================================================");
		HashSet<String> alist1=new HashSet<String>();
		alist1.add("Red");
		alist1.add("Black");
		alist1.add("Yellow");
		alist1.add("Green");
		alist1.add("Pink");
		alist1.add("Orange");
		alist1.add("Rose");
		eTest1.log(Status.INFO, MarkupHelper.createUnorderedList(alist1));
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());	
	driver.close();	

}
}
