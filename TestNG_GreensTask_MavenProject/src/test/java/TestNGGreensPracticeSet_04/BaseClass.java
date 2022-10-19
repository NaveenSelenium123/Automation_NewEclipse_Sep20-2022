package TestNGGreensPracticeSet_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

}
