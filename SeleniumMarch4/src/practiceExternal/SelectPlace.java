package practiceExternal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPlace {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		WebElement txtUserName = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		 txtUserName.sendKeys("user@phptravels.com");
		 WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		 txtPassword.sendKeys("demouser");
		 WebElement txtCheck = driver.findElement(By.xpath("(//label[@for='rememberchb'])[1]"));
		 txtCheck.click();
		 WebElement btnLogin = driver.findElement(By.xpath("(//span[@class='ladda-label'])[1]"));
		 btnLogin.click();
		 WebElement selectFlight = driver.findElement(By.xpath("(//a[@title='home'])[3]"));
		 selectFlight.click();
		 WebElement txtFrom = driver.findElement(By.id("autocomplete"));
		 txtFrom.sendKeys("Chennai");
		 WebElement txtTo = driver.findElement(By.id("autocomplete2"));
		 txtTo.sendKeys("Trichy");
		 //WebElement dropDown = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		 //dropDown.click();
		 //WebElement  dropDown= driver.findElement(By.xpath("//span[text()='2']"));
		// Thread.sleep(3000);
	 //WebElement dropDown = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		///Select s =new Select(dropDown);
		//s.selectByIndex(1);
		//s.selectByVisibleText("1");
		 WebElement btnSearch = driver.findElement(By.id("flights-search"));
		 btnSearch.click();
		
}
}