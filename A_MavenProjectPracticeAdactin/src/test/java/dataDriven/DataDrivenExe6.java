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

public class DataDrivenExe6 {
	public static void main(String[] args) {
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
		b.inputText(txtEmail, "welcome");
		
		//Locate the password textbox
		
		WebElement txtPass = b.webElementLocateById("pass");
		
		//pass input data  to textbox
		
		b.inputText(txtPass, "testing");
		
		//Locate the login button
		WebElement btnLogin = b.locateByName("login");
		
		//click the login button
		
		btnLogin.click();
	}

}
