package ITestListener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends testUtils implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Here the test case is started");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Here the test case is failed and screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
		
	}

}
