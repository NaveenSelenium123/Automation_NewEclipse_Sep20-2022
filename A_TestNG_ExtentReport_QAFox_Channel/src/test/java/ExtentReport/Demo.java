package ExtentReport;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Demo {
public static void main(String[] args) throws IOException {
	ExtentReports extent=new ExtentReports();
	File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
ExtentTest eTest1=extent.createTest("TestOne");
eTest1.log(Status.INFO, "Chrome browser launched");
eTest1.log(Status.INFO, "Chrome browser maximized");
eTest1.log(Status.INFO, "valid product got searched");
eTest1.log(Status.INFO, "valid product dispalyed");
eTest1.log(Status.INFO, "Add to card added");
eTest1.log(Status.INFO, "Browser got closed");
eTest1.log(Status.WARNING, "Alignment button can be better");



////eTest1.pass("TestOne Passed");
//eTest1.log(Status.PASS, "TestOne Passed");
//ExtentTest eTest2=extent.createTest("TestOne");
////eTest2.fail("TestTwo failed");
//eTest2.log(Status.FAIL, "TestTwo failed");
//ExtentTest eTest3=extent.createTest("TestOne");
////eTest3.skip("TestOne skipped");
//eTest3.log(Status.SKIP, "TestOne skipped");

extent.flush();
Desktop.getDesktop().browse(file.toURI());

}
}
