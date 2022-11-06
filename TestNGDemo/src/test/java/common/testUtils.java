package common;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class testUtils extends BaseClass {
public void getScreenshot() throws IOException {
	Date currentdate =new Date();
	String screenshotfilename = currentdate.toString().replace(" "," _").replace(":","_");
	File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile,new File(".//screenshot" + screenshotfilename + ".png"));
}
}
