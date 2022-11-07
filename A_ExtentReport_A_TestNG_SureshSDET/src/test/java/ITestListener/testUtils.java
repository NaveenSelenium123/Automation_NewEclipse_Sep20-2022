package ITestListener;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class testUtils extends BaseTest {
public void getScreenshot() throws IOException {
Date currentDate=new Date();	
String screenshotfilename = currentDate.toString().replace(" ","_").replace(":","-");
File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile,new File(".//screenshot//" + screenshotfilename + ".png"));

}
}
