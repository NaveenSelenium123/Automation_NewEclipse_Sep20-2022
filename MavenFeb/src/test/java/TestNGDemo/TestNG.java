package TestNGDemo;

import org.testng.annotations.BeforeClass;
//import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeClass
	public void tc2() {
		System.out.println("beforeclass");
	}
	@Test
public void tc1() {
	System.out.println("one---");
}
	@Test
	public void t32() {
	System.out.println("two-----");	
	}	
	@Test
	public void t312() {
	System.out.println("three----");	
	}	
	
	
	
}
