package pavan_Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class You30pdfFileDownload_FirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		String location=System.getProperty("user.dir")+"\\Downloads";	
FirefoxProfile profile=new FirefoxProfile();
profile.setPreference("pdfjs.disabled",true);
profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/pdf");
profile.setPreference("browser.download.folderList",2);//0-desktop;1-download;2-desired location
profile.setPreference("browser.download.dir",location);
			FirefoxOptions options =new FirefoxOptions();
			options.setProfile(profile);
			
System.setProperty("webdriver.gecko.driver","E:\\New folder\\New folder\\New folder\\Greens_NewEclipse_Sep20-2022\\Selenium_InterviewQues_Pavan_LearnAutomation_Youtube\\driver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver(options);
			driver.get("https://demo.imacros.net/Automate/PDFdemo");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/section/div/div/p[2]/a")).click();
		}
}
