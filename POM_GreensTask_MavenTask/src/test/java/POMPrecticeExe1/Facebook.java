package POMPrecticeExe1;

public class Facebook extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browserConChrome();
		openApplication("https://www.facebook.com");
		maximizeWindow();
		Login l =new Login();
		inputText(l.getTxtEmail(),"welcome");
		inputText(l.getTxtPass(),"testing");
		driver.navigate().refresh();
		inputText(l.getTxtEmail(),"naveen");
	
		
	}

}
