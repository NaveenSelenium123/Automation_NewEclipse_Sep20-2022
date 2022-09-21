package com.lao.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.lao.constants.Constants;
import com.lao.utilities.CommonUtils;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_Step_Definition {

	public static WebDriver driver;
	
	@Before
	public void beforeScenario() {
		
try {
	CommonUtils.loadProperties();
	if(driver== null) {
	launchBrowser();
} 
}
catch (Exception e) {
	e.printStackTrace();
}
	}
	public void launchBrowser() {
		try {
			switch ("ie") {
			case "chrome":
				System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_LOCATION);
				driver=new ChromeDriver();
				break;
			case "firefox":
				System.setProperty(Constants.FIREFOX_DRIVER,Constants.FIREFOX_DRIVER_LOCATION);
				driver=new FirefoxDriver();
				break;
			case "ie":
				System.setProperty(Constants.EDGE_DRIVER,Constants.EDGE_DRIVER_LOCATION);
				driver=new EdgeDriver();
				break;
			default:
				System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_LOCATION);
				driver=new ChromeDriver();
				break;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
