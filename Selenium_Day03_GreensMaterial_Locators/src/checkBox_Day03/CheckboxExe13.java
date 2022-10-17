package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]")).click();
		
	}
}