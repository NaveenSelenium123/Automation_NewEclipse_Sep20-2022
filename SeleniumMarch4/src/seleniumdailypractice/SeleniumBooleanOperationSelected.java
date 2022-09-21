package seleniumdailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBooleanOperationSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		boolean logo = driver.findElement(By.xpath("//a[text()='Create New Account']")).isSelected();
		if(logo == true) {
			System.out.println("Button is selected");
		}
		else {
			System.out.println("not selected");
		}
		
}
}