package browsserLaunch_Dayo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserExe1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Windows_Old Eclipse Projects\\Selenium_GreensMaterial_Practice_BrowserLauch_Day01\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://gmail.com/");
		driver.get("http://www.flipkart.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");		

	}

}
