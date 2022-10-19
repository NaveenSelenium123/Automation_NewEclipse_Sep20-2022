package JunitGreensPracticeExe4;

import JunitGreensPracticeExe1.BaseClass;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;


public class FlipkartMethodCall extends BaseClass{
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
			driver.quit();

		}

}
