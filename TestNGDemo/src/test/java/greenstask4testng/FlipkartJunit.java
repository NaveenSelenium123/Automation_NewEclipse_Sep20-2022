package greenstask4testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junitgreenstask8.BaseClassPom;

public class FlipkartJunit extends BaseClassPom {
	@BeforeClass
public void beforeClass() {
		browserConChrome();
		maximizeWindow();
}
	@Test
	public void tc1() {
		openApplication("https://www.flipkart.com/account/login");
		FlipkartPOM a =new FlipkartPOM();
		inputText(a.getTxtEmail(),"Naveen");
		inputText(a.getTxtPass(),"Kumar");
		click(a.getBtnLogin());
	}
	public void afterClass() {
		//driver.quit();

	}
}
