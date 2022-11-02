package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class DataDrivenExe6copy {
	public static void main(String[] args) throws IOException {
		BaseClass b =new BaseClass();
		//browser configuration
		b.browserConChrome();
		//open any application
		b.openApplication("https://www.facebook.com");
		//maximize window
		b.maximizeWindow();
		//Locate the Email TextBox
		WebElement txtEmail = b.webElementLocateById("email");
		//pass input data to text box
		b.inputText(txtEmail,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\TestDatagit.xlsx","Sheet1", 3, 1));
		//Locate the password textbox
		WebElement txtPass = b.webElementLocateById("pass");
		//pass input data to textbox
		b.inputText(txtPass,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\TestDatagit.xlsx","Sheet1", 3, 3)); 
		//Locate the login button
		WebElement btnLogin = b.locateByName("login");
		WebElement txtFacebook = 
		b.locateByXpath("//h2[contains(text(),'Face')]");
		String text = b.getText(txtFacebook);
		b.excelWrite("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\TestDatagit.xlsx", "Sheet1", 4, 2, text);
		//click the login button
		btnLogin.click();		
		
	}
}
