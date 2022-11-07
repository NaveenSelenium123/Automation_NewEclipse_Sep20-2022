package org.com;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookExtentReport {
	ExtentReports extent;
	File file;
	ExtentSparkReporter sparkReporter;
	WebDriver driver;
	@BeforeClass
	public void tc1() {
		 extent=new ExtentReports();
		file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
	 sparkReporter=new ExtentSparkReporter(file);
	extent.attachReporter(sparkReporter);
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https:www.facebook.com");
	

}
@Test	
public void tc2() {
	driver.findElement(By.id("email")).sendKeys("Greens");
	
	driver.findElement(By.id("pass")).sendKeys("Greens");
}
@AfterClass
public void tc3() throws IOException {
//	File sourceScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	String destinationScreenshotPath=System.getProperty("user.dir")+"\\Screenshots\\Tutorialninja.png";
//	FileUtils.copyFile(sourceScreenshot,new File(destinationScreenshotPath));
	
	ExtentTest eTest1=extent.createTest("TestOne","This text is describing TestOne1");
	eTest1.log(Status.INFO,"TestOne Started");
	eTest1.log(Status.INFO,"TestOne Progress");
	//eTest1.addScreenCaptureFromPath(destinationScreenshotPath);
	 eTest1=extent.createTest("TestOne","This text is describing TestOne1");
	eTest1.log(Status.INFO,"TestOne Started");
	extent.flush();
	Desktop.getDesktop().browse(file.toURI());	
driver.close();
}
}
