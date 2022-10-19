package POMPracticeExe5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver; 
	public static void browserConChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
public static void openApplication(String url) {
	driver.get(url);
}
public static void maximizeWindow() {
	driver.manage().window().maximize();
}
public static void inputText(WebElement element,String value) {
	element.sendKeys(value);
}
public static  void click(WebElement element) {
	element.click();
}
public static void dropdown(WebElement element,int value) {
	Select s =new Select(element);
	s.selectByIndex(value);	
}
public static  String   getAttribute(WebElement element) {
	String attribute = element.getAttribute("value");
	return attribute;
}

}
