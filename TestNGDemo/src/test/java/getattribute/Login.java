package getattribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends BaseClass {
WebDriver driver;
@BeforeMethod
public  void beforeClass() {
	BaseClass a =new BaseClass();
	a.browserConChrome();
}
@AfterMethod
public void afterClass() {
	BaseClass b =new BaseClass();
	b.browserClose();
}
@Test
public void tc1() {
	BaseClass c =new BaseClass();
	c.openApplication("https://www.facebook.com/");	
	Facebook l =new Facebook();
	inputText(l.getTxtUserName(),"Naveen");
	inputText(l.getTxtPassword(),"Kumar");
	jsGetText(l.getTxtUserName());
//	 jsSetText(l.getTxtUserName());
//	 jsGetText(l.getTxtUserName());
//	 click(l.getBtnLogin());
//	 jsSetText(l.getTxtPassword());
}
}

