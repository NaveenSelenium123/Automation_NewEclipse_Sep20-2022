package alertFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExe8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		driver.findElement(By.id("DUMMY1")).sendKeys("GreenOMR");
		driver.findElement(By.xpath("(//img[@class='goahead'])[1]")).click();
		Thread.sleep(3000);
		//Alert a = driver.switchTo().alert();
		//Thread.sleep(3000);
		//a.accept();
		//driver.findElement(By.xpath("(//img[@class='goahead'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("Greens");
		driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("password");
		driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();

	}
}
