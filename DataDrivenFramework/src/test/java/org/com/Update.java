package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Update {
	public static void main(String[] args) throws IOException {
		
	
	File f =new File("E:\\projects\\DataDrivenFramework\\folder\\TestDatagit.xlsx");
	FileInputStream fin =new FileInputStream(f);
	Workbook w =new XSSFWorkbook(fin);
	Sheet s = w.getSheet("Sheet1");
	Row r= s.getRow(3);
	Cell cell = r.getCell(1);
	int cellType = cell.getCellType();
	System.out.println(cellType);
	//String value = cell.getStringCellValue();
	//if(value.equals("kumar")) {
		//cell.setCellValue("VALUE");
	//}
	//FileOutputStream fout =new FileOutputStream(f);
	//w.write(fout);
	cell.setCellValue("JOHN");
	FileOutputStream fout =new FileOutputStream(f);
	w.write(fout);

	System.out.println("Done...........");
	}
	


	
}
