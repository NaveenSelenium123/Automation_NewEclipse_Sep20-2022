package AutoKnown_FailedTc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	private void tc1() {
		System.out.println(1);
	}
		@Test(retryAnalyzer=Failure.class)	
	private void tc2() {
			Assert.assertTrue(false);
		System.out.println(2);
	}
		@Test
	private void tc3() {
		System.out.println(3);
	}
}
