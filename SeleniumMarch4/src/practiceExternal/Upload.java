package practiceExternal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {    //http://the-internet.herokuapp.com/upload
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\SeleniumDayOne\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		WebElement btnChooseFile = driver.findElement(By.id("file-upload"));
		btnChooseFile.sendKeys("D:\\JAVA --FILE HANDLING\\flower.jpeg");
		WebElement btnSubmit = driver.findElement(By.id("file-submit"));
		btnSubmit.click();
}
}