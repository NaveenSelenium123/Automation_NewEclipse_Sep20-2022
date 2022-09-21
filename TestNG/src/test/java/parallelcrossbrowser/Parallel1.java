package parallelcrossbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel1 {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc(String bwsr) {
	if(bwsr.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(bwsr.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(bwsr.equals("ie")) {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
	else if(bwsr.equals("safari")) {
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
	}
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	}


}
