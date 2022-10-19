package POMPracticeExe3_3;

import java.awt.AWTException;

import POMPracticeExe3_1.BaseClassPOM;

public class GreensMethodCall extends BaseClassPOM{
	public static void main(String[] args) throws AWTException, InterruptedException {
		browserConChrome();
		openApplication("http://www.greenstechnologys.com/");
		maximizeWindow();
		Thread.sleep(3000);
		GreensPOM a =new GreensPOM();
		actionClass1(a.getClickCourse());
		actionClass1(a.getJavaTraining());
		click(a.getCoreJavaTraining());
		scrollUp(a.getScroll());
		gettext(a.getPrintParagraph());
	}

}
