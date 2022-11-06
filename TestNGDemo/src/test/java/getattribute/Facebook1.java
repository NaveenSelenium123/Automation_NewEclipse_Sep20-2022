package getattribute;

public class Facebook1 extends BaseClass {
	public static void main(String[] args) {
		browserConChrome();
		openApplication("https://www.facebook.com/");
		maximizeWindow();
		Facebook l =new Facebook();
		 jsSetText(l.getTxtUserName());
		 jsGetText(l.getTxtUserName());
		 click(l.getBtnLogin());
		 jsSetText(l.getTxtPassword());
	}

}
