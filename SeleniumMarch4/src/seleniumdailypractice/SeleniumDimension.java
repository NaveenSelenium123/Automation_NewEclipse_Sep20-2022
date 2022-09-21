package seleniumdailypractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDimension {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		Dimension d =new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p =new Point(250,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
}
}