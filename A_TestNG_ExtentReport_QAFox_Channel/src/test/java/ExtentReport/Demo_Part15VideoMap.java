package ExtentReport;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Demo_Part15VideoMap {
public static void main(String[] args) throws IOException {
	ExtentReports extent=new ExtentReports();
	File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
HashMap<String,Object> a=new HashMap<String,Object>();
a.put("FirstName","Siva");
a.put("LastName","Kumar");
a.put("Experience","16");
a.put("Location","Vhennai");
ExtentTest eTest1=extent.createTest("TestOne");
eTest1.log(Status.INFO, MarkupHelper.createOrderedList(a));
System.out.println("=================================================================");
ExtentTest eTest2=extent.createTest("TestOne");
eTest2.log(Status.INFO, MarkupHelper.createUnorderedList(a));
extent.flush();
Desktop.getDesktop().browse(file.toURI());
}
}
