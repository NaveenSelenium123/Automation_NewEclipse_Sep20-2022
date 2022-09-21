package org.com;

import org.testng.annotations.Test;

public class Groupig2 {
	@Test(groups="Regression")
	public void tc1000() {
	System.out.println("TC1000");	
	}
	@Test(groups="Sanity")
	public void tC2000() {
		System.out.println("TC2000");
	}
	@Test(groups="Retest")
public void tc3000() {
	System.out.println("TC3000");

}
}
