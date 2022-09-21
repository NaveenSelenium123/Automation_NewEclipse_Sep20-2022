package org.sample;//DAY01--POM

import org.test.BaseClass2;

public class FaceBook extends BaseClass2 {
public static void main(String[] args) {
	browserConChrome();
	openApplication("https://www.facebook.com");
	maximizeWindow();
	Login l =new Login();
	inputText(l.getTxtEmail(),"welcome");
	inputText(l.getTxtPass(),"testing");
	//click(l.getBtnLogin());
	driver.navigate().refresh();
	inputText(l.getTxtEmail(),"hello");
	
}
}
