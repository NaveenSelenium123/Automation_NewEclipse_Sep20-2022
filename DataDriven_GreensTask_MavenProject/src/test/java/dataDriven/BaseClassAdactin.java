package dataDriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClassAdactin {
	WebDriver driver;	
	public void browserConfigChrome() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	public void openApplication(String url) {
		driver.get(url);
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public WebElement locateById(String id) {
		WebElement findElement= driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement locateByName(String name) {
	WebElement findElement = driver.findElement(By.name(name));
	return findElement;
	}
	public WebElement locateByXpath(String xapth) {
		WebElement findElement = driver.findElement(By.xpath(xapth));
		return findElement;	
	}
	public WebElement locateByTagName(String tagName) {
		WebElement findElement = driver.findElement(By.tagName(tagName));
		return findElement;	
	}
	public void inputText(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void click(WebElement element) {
		element.click();
	}
public String getText(WebElement element) {	
String text = element.getText();
return text;
}
public String getAttribute(WebElement element) {
	String attribute = element.getAttribute("value");
	return attribute;
	
}
public void dropDown(WebElement element,int value) {
	Select s =new Select(element);
	s.selectByIndex(value);
}
public String excelRead(String path,String sheetName,int rowNo,int cellNo) throws IOException {
	String value=null;
	File f= new File(path);
	FileInputStream fin =new FileInputStream(f);
	Workbook w =new XSSFWorkbook(fin);
	Sheet s= w.getSheet(sheetName);
	Row r = s.getRow(rowNo);
	Cell c= r.getCell(cellNo);
	int cellType = c.getCellType();
	if(cellType == 1) {
		value = c.getStringCellValue();
		System.out.println(value);
	}
	else if(cellType == 0) {
		if(DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
		SimpleDateFormat sim =new SimpleDateFormat("dd-mm-yyyy");
		value= sim.format(dateCellValue);
		}else {
			double numericCellValue = c.getNumericCellValue();
			long l =(long) numericCellValue;
			value = String.valueOf(l);
		}
		
}
	return value;
}
public void excelWrite(String path,String sheetName,int rowNo,int cellNo,String data) throws IOException {
	File f= new File(path);
	FileInputStream fin =new FileInputStream(f);
	Workbook w =new XSSFWorkbook(fin);
	Sheet s= w.getSheet(sheetName);
	Row r = s.getRow(rowNo);
	Cell c= r.getCell(cellNo);	
	c.setCellValue(data);
	FileOutputStream fout =new FileOutputStream(f);
	w.write(fout);
}
private void dropDown(WebElement ddn) {
	Select s =new Select(ddn);
	s.selectByIndex(0);

}

}
