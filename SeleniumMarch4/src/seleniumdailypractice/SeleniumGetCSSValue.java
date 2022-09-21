package seleniumdailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetCSSValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement btnLogin = driver.findElement(By.name("login"));
		String x1 = btnLogin.getCssValue("font-size");
		System.out.println(x1);
		String x2 = btnLogin.getCssValue("color");
		System.out.println(x2);
		String x3 = btnLogin.getCssValue("font-weight");
		System.out.println(x3);
		String x4 = btnLogin.getCssValue("font-family");
		System.out.println(x4);
		String x5 = btnLogin.getCssValue("background");
		System.out.println(x5);
}
}