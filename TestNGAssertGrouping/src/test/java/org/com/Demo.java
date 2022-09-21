package org.com;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
	@Test
public void tc1() {
	System.out.println(1);

}
	@Test
	public void tc2() {
		SoftAssert s =new SoftAssert();
		System.out.println(1);

	}
}
