package LoginTestCase1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginExcel {
	String[] []data =null;
			
		@DataProvider(name="loginData")
		public String[][] loginDataProvider() {
			
	      return data;
		}
		
public void getExcelData() throws IOException {
File f =new File("C:\\Users\\navee\\OneDrive\\Desktop\\TestNGDemo\\ddnTestNGEXCEL\\ddnTestng.xlsx");
FileInputStream excel =new FileInputStream(f);
Workbook w =new XSSFWorkbook(excel);
Sheet s = w.getSheet("Sheet1");
int rowCount = s.getPhysicalNumberOfRows();
Row row = s.getRow(2);
int Cells = row.getPhysicalNumberOfCells();

String testData[][] =new String[rowCount-1][Cells];
for(int i=1;i<rowCount;i++) {
	for(int j=0;j<Cells;j++) {
		//testData[i-1][j]=s.getSheetName(j,i)
		//s.getCellComment(j, i).get
	}
}
}
		
		@Test(dataProvider="loginData")
		public void loginWithBothCorrect(String uName,String pword) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			WebElement txtUserName= driver.findElement(By.id("txtUsername"));
			txtUserName.sendKeys(uName);
			WebElement txtPassword = driver.findElement(By.id("txtPassword"));
			txtPassword.sendKeys(pword);
			WebElement btnLogin= driver.findElement(By.id("btnLogin"));
			btnLogin.click();
			driver.quit();
		}
}
