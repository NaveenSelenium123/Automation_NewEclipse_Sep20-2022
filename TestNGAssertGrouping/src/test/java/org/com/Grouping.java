package org.com;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="Regression")
	public void tc1() {
	System.out.println("TC1");	
	}
	@Test(groups="smoke")
	public void tC2() {
		System.out.println("TC2");
	}
	@Test(groups="sanity")
public void tc3() {
	System.out.println("TC3");

}

}
