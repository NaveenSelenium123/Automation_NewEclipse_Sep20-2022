package listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Base;
import utilities.ExtentReportGenerator;

public  class MyListeners extends Base implements ITestListener {
	ExtentReports report=ExtentReportGenerator.getExtentReport();
	ExtentTest eTest;
	@Override
	public void onFinish(ITestContext result) {
		report.flush();		
File file=new File(System.getProperty("user.dir")+"ExtentReport1\\eReport1.html");	
	
try {
	Desktop.getDesktop().browse(file.toURI());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();			
		eTest.log(Status.FAIL,testName+"execution started");			

	WebDriver driver = null;
	try {
		driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		eTest.addScreenCaptureFromPath(takeScreenshot(testName,driver),testName); 	
		eTest.log(Status.INFO,result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	String testName = result.getName();	
	eTest.log(Status.SKIP,testName+"got skipped");	
	eTest.log(Status.INFO,result.getThrowable());	
	
	}

	@Override
	public void onTestStart(ITestResult result) {
		String testName = result.getName();		
		eTest=report.createTest(testName);
		eTest.log(Status.INFO,testName+"execution started");		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();	
		eTest.log(Status.PASS,testName+"got execution successfully");	
	}
	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stu
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}
