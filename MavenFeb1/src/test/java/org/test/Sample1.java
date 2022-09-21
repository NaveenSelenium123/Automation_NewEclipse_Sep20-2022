package org.test;

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

import io.github.bonigarcia.wdm.WebDriverManager;
public class Sample1 {
	public static void main(String[] args) throws IOException {
File f =new File("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb1\\folder\\TestData.xlsx");
FileInputStream fin=new FileInputStream(f);
Workbook w =new XSSFWorkbook(fin);
Sheet createSheet = w.createSheet("Naveen0_09-9000000---00000_0");
Row createRow = createSheet.createRow(2);
Cell createCell = createRow .createCell(2);
createCell.setCellValue("Hello User New...787878");
FileOutputStream fout =new FileOutputStream(f);
w.write(fout);
System.out.println("Done----------------========***********");
//WebDriverManager.
//WebDriverManager.chromedriver().setup();
}
}


