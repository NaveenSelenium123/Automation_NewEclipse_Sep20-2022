package ExtentReport;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Demo_Part12Video {
public static void main(String[] args) throws IOException {
	ExtentReports extent=new ExtentReports();
	File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
ExtentTest eTest1=extent.createTest("TestOne");
eTest1.log(Status.INFO, "<b>Chrome browser launched</b>");
eTest1.log(Status.INFO, "<i>Chrome browser launched</i>");
eTest1.log(Status.INFO, "<u>Chrome browser launched</u>");
eTest1.log(Status.INFO, "<h1>Chrome browser launched</h1>");
extent.flush();
Desktop.getDesktop().browse(file.toURI());

}
}
