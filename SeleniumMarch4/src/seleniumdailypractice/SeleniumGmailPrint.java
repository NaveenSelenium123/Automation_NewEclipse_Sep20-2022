package seleniumdailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGmailPrint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("(//a[@class='gb_d'])[1]")).click();
		String s = driver.getTitle();
		System.out.println(s);
		if(s.equals("Gmail: Free, Private & Secure Email | Google Workspace")) {
			System.out.println("Gmail Account creation");
		}else {
			System.out.println("Invalid");
		}
}
}

