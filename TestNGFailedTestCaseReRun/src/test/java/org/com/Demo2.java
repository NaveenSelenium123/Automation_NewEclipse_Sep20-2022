package org.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void tc1() {
	System.out.println(1);	
	}
		@Test(retryAnalyzer=KnownFailure.class)
		public void tc2() {
			Assert.assertTrue(false);
		System.out.println(2);
		}
		@Test
		public void tc3() {
		System.out.println(3);
		}
}
