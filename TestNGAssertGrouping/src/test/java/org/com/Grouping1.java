package org.com;

import org.testng.annotations.Test;

public class Grouping1 {
	@Test(groups="Restest")
	public void tc100() {
	System.out.println("TC100");	
	}
	@Test(groups="Regression")
	public void tC200() {
		System.out.println("TC200");
	}
	@Test(groups="smoke")
public void tc300() {
	System.out.println("TC300");

}
}
