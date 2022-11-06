package ExtentReport;
import java.awt.Desktop;
import java.io.File;

import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;


public class Demo_Part30Video {
public static void main(String[] args) throws IOException, InterruptedException {
	
ExtentReports extent=new ExtentReports();
File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);


File filePass=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReportPass.html");
ExtentSparkReporter sparkReporterPass=new ExtentSparkReporter(filePass);
sparkReporterPass.filter().statusFilter().as(new Status [] {Status.PASS}).apply();
extent.attachReporter(sparkReporterPass);

File fileFail=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReportFail.html");
ExtentSparkReporter sparkReporterFail=new ExtentSparkReporter(fileFail);
sparkReporterFail.filter().statusFilter().as(new Status [] {Status.FAIL}).apply();
extent.attachReporter(sparkReporterFail);


File fileSkip=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReportSkip.html");
ExtentSparkReporter sparkReporterSkip=new ExtentSparkReporter(fileSkip);
sparkReporterSkip.filter().statusFilter().as(new Status [] {Status.SKIP}).apply();
extent.attachReporter(sparkReporterSkip);




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
eTest2.assignDevice("Windows 11 FireFoix");

ExtentTest eTest3=extent.createTest("TestThree","This is the description test three");
eTest3.log(Status.INFO,"TestThree Execution started");
eTest3.log(Status.SKIP,"TestThree got successfully executed");
eTest3.assignAuthor("Arun1");
eTest3.assignCategory("Regression");
eTest3.assignDevice("Windows 11 FireFoix");

ExtentTest eTest4=extent.createTest("TestFour","This is the description test four");
eTest4.log(Status.INFO,"TestFour Execution started");
eTest4.log(Status.PASS,"TestFoure got successfully executed");
eTest4.assignAuthor("Kamal");
eTest4.assignCategory("Smoke");
eTest4.assignDevice("Windows 11 Chrome 106");

ExtentTest eTest5=extent.createTest("TestFIVE","This is the description test five");
eTest5.log(Status.INFO,"TestFIVE Execution started");
eTest5.log(Status.FAIL,"TestFIVE got successfully executed");
eTest5.assignAuthor("Kamal","Arun","Arun1");
eTest5.assignCategory("Smoke","Regression");
eTest5.assignDevice("Windows 11 Chrome 106");


ExtentTest eTest6=extent.createTest("Testsix","This is the description test five");
eTest6.log(Status.INFO,"Testsix Execution started");
eTest6.log(Status.FAIL,"Testsix got successfully executed");
eTest6.assignAuthor("Kamal");
eTest6.assignAuthor("Arun");
eTest6.assignAuthor("Arun1");
eTest6.assignCategory("Smoke");
eTest6.assignCategory("Sanity");
eTest6.assignCategory("Regression");
eTest6.assignDevice("Windows 11 Chrome 106");
eTest6.fail(new Exception("Sample Exception"));

ExtentTest eTest7=extent.createTest("Testseven","This is the description test seven");
eTest7.log(Status.INFO,"Testseven Execution started");
eTest7.log(Status.FAIL,"Testseven got successfully executed");
eTest7.assignAuthor(new String[] {"Kamal","Arun","Arun1"});
eTest7.assignCategory(new String[] {"Smoke","Sanity","Regression"});
eTest7.assignCategory("Windows 11 Edge");

extent.flush();
Desktop.getDesktop().browse(file.toURI());
Desktop.getDesktop().browse(filePass.toURI());
Desktop.getDesktop().browse(fileFail.toURI());
Desktop.getDesktop().browse(fileSkip.toURI());
}
}
