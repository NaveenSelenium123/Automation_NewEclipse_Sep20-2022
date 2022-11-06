package getattribute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
public static  void browserConChrome() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
public static void openApplication(String url) {
	driver.get(url);
}
public static void maximizeWindow() {
	driver.manage().window().maximize();
}
public static  void inputText(WebElement element,String value) {
	element.sendKeys(value);
}
public static void click(WebElement element) {
element.click();	
}

public static void jsSetText(WebElement element) {
JavascriptExecutor jk =(JavascriptExecutor) driver;
jk.executeScript("arguments[0].setAttribute('value','Naveen')",element);
}
public static void jsGetText(WebElement element) {
	JavascriptExecutor jk =(JavascriptExecutor) driver;
	Object att = jk.executeScript("return arguments[0].getAttribute('value')", element);
	System.out.println(att);
}
public static void browserClose() {
	driver.quit();
}
}
