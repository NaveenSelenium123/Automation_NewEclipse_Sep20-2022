package ExtentReport;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Demo_Part15VideoSet {
public static void main(String[] args) throws IOException {
	ExtentReports extent=new ExtentReports();
	File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
HashSet<String> alist=new HashSet<String>();
alist.add("Sunday");
alist.add("Monday");
alist.add("Tuesday");
alist.add("Wednesday");
alist.add("Thursday");
alist.add("Friday");
alist.add("Saturday");
ExtentTest eTest1=extent.createTest("TestOne");
eTest1.log(Status.INFO, MarkupHelper.createOrderedList(alist));
System.out.println("=================================================================");
HashSet<String> alist1=new HashSet<String>();
alist1.add("Red");
alist1.add("Black");
alist1.add("Yellow");
alist1.add("Green");
alist1.add("Pink");
alist1.add("Orange");
alist1.add("Rose");
ExtentTest eTest2=extent.createTest("TestOne");
eTest2.log(Status.INFO, MarkupHelper.createUnorderedList(alist1));
extent.flush();
Desktop.getDesktop().browse(file.toURI());
}
}
