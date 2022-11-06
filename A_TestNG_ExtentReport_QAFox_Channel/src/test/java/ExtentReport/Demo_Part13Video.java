package ExtentReport;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Demo_Part13Video {
public static void main(String[] args) throws IOException {
	ExtentReports extent=new ExtentReports();
	File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
String xmlContent="<menu id=\"file\" value=\"File\">\r\n" + 
		"  <popup>\r\n" + 
		"    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n" + 
		"    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n" + 
		"    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n" + 
		"  </popup>\r\n" + 
		"</menu>";

ExtentTest eTest1=extent.createTest("TestOne");
eTest1.log(Status.INFO, MarkupHelper.createCodeBlock(xmlContent,CodeLanguage.XML));
extent.flush();
Desktop.getDesktop().browse(file.toURI());

}
}
