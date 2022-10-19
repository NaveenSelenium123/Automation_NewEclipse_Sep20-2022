package POMPracticeExe3_1;

import java.awt.AWTException;

public class GreensMethodCall extends BaseClassPOM {
	public static void main(String[] args) throws AWTException, InterruptedException {
		browserConChrome();
		openApplication("http://www.greenstechnologys.com/");
		maximizeWindow();
		Thread.sleep(3000);
		GreensPOM a =new GreensPOM();
		scrollUp(a.getScroll());
		gettext(a.getGettext());
		Thread.sleep(5000);
		scrollDown(a.getScrollUp());
		gettext(a.getGettext1());
	
	}

}
