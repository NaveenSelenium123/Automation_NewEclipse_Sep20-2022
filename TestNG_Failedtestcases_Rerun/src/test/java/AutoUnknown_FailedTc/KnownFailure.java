package AutoUnknown_FailedTc;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class KnownFailure implements IRetryAnalyzer {
	int min=0,max=8;
	public boolean retry(ITestResult arg0) {
		if(min<max) {
			min++;
			return true;
		}
		
		return false;
	}

}
