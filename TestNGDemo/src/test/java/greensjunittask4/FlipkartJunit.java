package greensjunittask4;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;

import junitgreenstask8.BaseClassPom;

public class FlipkartJunit extends BaseClassPom {
	@BeforeClass
public static void beforeClass() {
		browserConChrome();
		maximizeWindow();
}
	@Test
	public  void tc1() {
		openApplication("https://www.flipkart.com/account/login");
		FlipkartPOM a =new FlipkartPOM();
		inputText(a.getTxtEmail(),"Naveen");
		inputText(a.getTxtPass(),"Kumar");
		click(a.getBtnLogin());
	}
	@AfterClass
	public static void afterClass() {
		//driver.quit();

	}
}
