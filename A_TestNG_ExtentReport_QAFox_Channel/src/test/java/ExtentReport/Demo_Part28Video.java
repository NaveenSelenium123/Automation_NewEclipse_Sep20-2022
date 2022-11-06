package ExtentReport;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Demo_Part28Video {
public static void main(String[] args) throws IOException, InterruptedException {
Properties prop=new Properties();	
File propFile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\data-properties");	
FileInputStream fis=new FileInputStream(propFile);
prop.load(fis);
	
ExtentReports extent=new ExtentReports();
File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
Capabilities cap=((RemoteWebDriver)driver).getCapabilities();
extent.setSystemInfo("Browser Name:", cap.getBrowserName());
extent.setSystemInfo("Browser Version:", cap.getVersion());
extent.setSystemInfo("Operating System:",System.getProperty("os.name"));
extent.setSystemInfo("Java version:",System.getProperty("java.version"));
extent.setSystemInfo("Username:",System.getProperty("user.name"));
driver.manage().window().maximize();
driver.get(prop.getProperty("url"));
extent.setSystemInfo("Application URL: ",prop.getProperty("url") );
driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
driver.findElement(By.linkText("Login")).click();
driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
extent.setSystemInfo("Email Address:",prop.getProperty("email"));

driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
extent.setSystemInfo("Password: ",prop.getProperty("password"));

driver.quit();
ExtentTest eTest1=extent.createTest("TestOne","This is the description test one");
eTest1.log(Status.INFO,"TestOne Execution started");
eTest1.log(Status.PASS,"TestOne got successfully executed");
eTest1.assignAuthor("Arun");
eTest1.assignCategory("Smoke");
eTest1.assignDevice("Windows 11 Chrome 106");


ExtentTest eTest2=extent.createTest("TestTwo","This is the description test two");
eTest2.log(Status.INFO,"TestTwo Execution started");
eTest2.log(Status.FAIL,"TestTwo got successfully executed");
eTest2.assignAuthor("Arun");
eTest2.assignCategory("Sanity");
eTest2.assignCategory("Windows 11 FireFoix");

ExtentTest eTest3=extent.createTest("TestThree","This is the description test three");
eTest3.log(Status.INFO,"TestThree Execution started");
eTest3.log(Status.SKIP,"TestThree got successfully executed");
eTest3.assignAuthor("Arun1");
eTest3.assignCategory("Regression");
eTest3.assignCategory("Windows 11 FireFoix");

ExtentTest eTest4=extent.createTest("TestFour","This is the description test four");
eTest4.log(Status.INFO,"TestFour Execution started");
eTest4.log(Status.PASS,"TestFoure got successfully executed");
eTest4.assignAuthor("Kamal");
eTest4.assignCategory("Smoke");
eTest4.assignCategory("Windows 11 Chrome 106");

ExtentTest eTest5=extent.createTest("TestFIVE","This is the description test five");
eTest5.log(Status.INFO,"TestFIVE Execution started");
eTest5.log(Status.FAIL,"TestFIVE got successfully executed");
eTest5.assignAuthor("Kamal","Arun","Arun1");
eTest5.assignCategory("Smoke","Regression");
eTest5.assignCategory("Windows 11 Chrome 106");


ExtentTest eTest6=extent.createTest("Testsix","This is the description test five");
eTest6.log(Status.INFO,"Testsix Execution started");
eTest6.log(Status.FAIL,"Testsix got successfully executed");
eTest6.assignAuthor("Kamal");
eTest6.assignAuthor("Arun");
eTest6.assignAuthor("Arun1");
eTest6.assignCategory("Smoke");
eTest6.assignCategory("Sanity");
eTest6.assignCategory("Regression");
eTest6.assignCategory("Windows 11 Chrome 106");

ExtentTest eTest7=extent.createTest("Testseven","This is the description test seven");
eTest7.log(Status.INFO,"Testseven Execution started");
eTest7.log(Status.FAIL,"Testseven got successfully executed");
eTest7.assignAuthor(new String[] {"Kamal","Arun","Arun1"});
eTest7.assignCategory(new String[] {"Smoke","Sanity","Regression"});
eTest7.assignCategory("Windows 11 Edge");

extent.flush();
Desktop.getDesktop().browse(file.toURI());

}
}
