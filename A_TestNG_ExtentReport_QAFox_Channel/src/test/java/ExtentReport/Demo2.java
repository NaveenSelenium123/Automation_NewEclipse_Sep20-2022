package ExtentReport;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Demo2 {
public static void main(String[] args) throws IOException {
	ExtentReports extent=new ExtentReports();
	File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
ExtentTest eTest1=extent.createTest("TestOne");
eTest1.log(Status.INFO, "Chrome browser launched");
eTest1.log(Status.PASS, "Chrome browser maximized");
eTest1.log(Status.WARNING, "valid product got searched");
eTest1.log(Status.SKIP, "valid product dispalyed");
eTest1.log(Status.FAIL, "Add to card added");
eTest1.log(Status.INFO, "Browser got closed");
eTest1.log(Status.WARNING, "Alignment button can be better");
extent.flush();
Desktop.getDesktop().browse(file.toURI());

}
}
