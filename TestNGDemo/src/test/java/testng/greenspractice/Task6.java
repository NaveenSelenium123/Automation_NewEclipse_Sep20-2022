package testng.greenspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task6 {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
public  void tc(String bwsr) {
	if(bwsr.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(bwsr.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(bwsr.equals("mozila")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
}
}
