package learnAutomation;

import org.testng.annotations.Test;

public class LearnAutomationPractice {
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High School");	
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary School");

	}
	@Test(dependsOnMethods="higherSecondary")
	public void colleg() {
		System.out.println("College");
	}

}
