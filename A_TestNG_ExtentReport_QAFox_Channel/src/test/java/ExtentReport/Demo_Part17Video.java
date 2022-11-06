package ExtentReport;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Demo_Part17Video {
public static void main(String[] args) throws IOException {
	ExtentReports extent=new ExtentReports();
	File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
ExtentTest eTest1=extent.createTest("TestOne");
eTest1.log(Status.INFO,"TestOne Started");
eTest1.log(Status.INFO,MarkupHelper.createLabel("TestOne Started",ExtentColor.GREEN));
try {
int a =9/0;
}
catch(Exception e) {
	eTest1.fail(e);	
}
extent.flush();
Desktop.getDesktop().browse(file.toURI());

}
}
