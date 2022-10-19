package TestNGGreensPracticeSet_04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart extends BaseClass {
	@BeforeClass
	public void beforeClass() {
			browserConChrome();
			maximizeWindow();
	}
		@Test
		public void tc1() {
			openApplication("https://www.flipkart.com/account/login");
			POMLocators a =new POMLocators();
			inputText(a.getTxtEmail(),"Naveen");
			inputText(a.getTxtPass(),"Kumar");
			click(a.getBtnLogin());
		}
		public void afterClass() {
			//driver.quit();

		}

}
