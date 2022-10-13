package browsserLaunch_Dayo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserExe3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:\\Windows_Old Eclipse Projects\\Selenium_GreensMaterial_Practice_BrowserLauch_Day01\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://gmail.com/");
		driver.get("http://www.flipkart.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");
		System.out.println(driver.getTitle());

	}

}
