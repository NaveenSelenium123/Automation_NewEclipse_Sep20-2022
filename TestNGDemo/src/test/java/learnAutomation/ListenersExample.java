package learnAutomation;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenersExample implements ITestListener {
	public void onFinish(ITestContext arg0) {
		
		System.out.println("after everything");			
	}
	public void onStart(ITestContext arg0) {
		System.out.println("before everything");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	public void onTestFailure(ITestResult arg0) {
	System.out.println("test case is failed");
	}

	public void onTestSkipped(ITestResult arg0) {
System.out.println("test case is skipped");
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Test case is going to execute");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("test case is passed");
	}
	

}
