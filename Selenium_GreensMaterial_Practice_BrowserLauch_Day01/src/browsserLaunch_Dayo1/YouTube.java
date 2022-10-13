package browsserLaunch_Dayo1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=eE1TeW5-URs");
	Thread.sleep(3000);
	WebElement movie = driver.findElement(By.xpath("//*[@id=\"container\"]/h1/yt-formatted-string"));
	String text = movie.getText();
	System.out.println(text);
	System.out.println(movie.getText());
	WebElement movie1 = driver.findElement(By.xpath("//*[@id=\"movie-title\"]"));
	System.out.println(movie1.getText());
	System.out.println("Done");
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(".\\Images\\movie.png");
	

}
}
