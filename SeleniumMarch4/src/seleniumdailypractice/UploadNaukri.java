package seleniumdailypractice;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadNaukri {//https://www.naukri.com/mnjuser/homepage
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(" http://the-internet.herokuapp.com/upload");
		String path="E:\\xerox copy\\SELENIUM AND GREENS OTHER\\GREENS\\framework.pdf";
}
}