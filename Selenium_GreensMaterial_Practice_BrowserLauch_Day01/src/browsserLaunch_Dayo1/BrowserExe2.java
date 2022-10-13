package browsserLaunch_Dayo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserExe2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.get("http://gmail.com/");
	driver.get("http://www.flipkart.com/");
	driver.get("http://greenstech.in/selenium-course-content.html");
}
}
