package windowHandlingDay10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExe7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//*[@id=\"heading302\"]/h2")).click();
		Thread.sleep(3000);
		String pri = driver.getWindowHandle();
		System.out.println(pri);
	driver.findElement(By.xpath("//*[@id=\"collapse302\"]/div/div/ul/li[1]/a")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		for (String string : allwin) {
			//System.out.println(string);
			if(!string.equals(pri)) {
				driver.switchTo().window(string);
			}
		}
			
			WebElement txtQuestion = driver.findElement(By.xpath("//pre[contains(text(),'QUESTION')]"));
			String text = txtQuestion.getText();
			System.out.println(text);

	}

}
