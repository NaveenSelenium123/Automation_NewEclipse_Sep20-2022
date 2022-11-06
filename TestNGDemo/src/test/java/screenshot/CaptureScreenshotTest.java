package screenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshotTest extends MainTest {
	@Test
 public void captureScrrenshot() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("http://www.automationtesting.in");
	String title = driver.getTitle();
	Assert.assertEquals("Home -Automtion Test", title);
	driver.close();
	
}
}