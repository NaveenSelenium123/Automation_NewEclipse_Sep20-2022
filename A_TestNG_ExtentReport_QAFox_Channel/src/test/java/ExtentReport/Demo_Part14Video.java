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
public class Demo_Part14Video {
public static void main(String[] args) throws IOException {
	ExtentReports extent=new ExtentReports();
	File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
String jsonContent="{\"menu\": {\r\n" + 
		"  \"id\": \"file\",\r\n" + 
		"  \"value\": \"File\",\r\n" + 
		"  \"popup\": {\r\n" + 
		"    \"menuitem\": [\r\n" + 
		"      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n" + 
		"      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n" + 
		"      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n" + 
		"    ]\r\n" + 
		"  }\r\n" + 
		"}}";

ExtentTest eTest1=extent.createTest("TestOne");
eTest1.log(Status.INFO, MarkupHelper.createCodeBlock(jsonContent,CodeLanguage.JSON));
extent.flush();
Desktop.getDesktop().browse(file.toURI());

}
}
