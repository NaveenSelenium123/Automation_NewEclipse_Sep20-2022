package POMPracticeExe3_6;

import java.awt.AWTException;

import POMPracticeExe3_1.BaseClassPOM;

public class GreensMethodCall extends BaseClassPOM{
	public static void main(String[] args) throws AWTException, InterruptedException {
		browserConChrome();
		openApplication("http://www.greenstechnologys.com/");
		maximizeWindow();
		Thread.sleep(3000);
		GreensPOM a =new GreensPOM();
		click(a.getClick());
		gettext(a.getPrintOurMainBranches());
		scrollDown(a.getScrollDown());
		gettext(a.getPrintCopyRight());
		
		
		
	}

}
