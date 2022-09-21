package seleniumdailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBooleanOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		boolean logo = driver.findElement(By.id("email")).isEnabled();
		if(logo == true) {
			System.out.println("Text box is enable to print");
		}
		else {
			System.out.println("not enable");
		}
		
}
}