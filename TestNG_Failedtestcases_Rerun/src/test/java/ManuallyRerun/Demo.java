package ManuallyRerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	private void tc1() {
		System.out.println(1);
	}
		@Test	
	private void tc2() {
			Assert.assertTrue(true);
		System.out.println(2);
	}
		@Test
	private void tc3() {
		System.out.println(3);
	}

}
