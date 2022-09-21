package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	File f=new File("E:\\projects\\DataDrivenFramework\\folder\\TestDatagit.xlsx");
	FileInputStream fin =new FileInputStream(f);
	Workbook w =new XSSFWorkbook(fin);
	Sheet s= w.getSheet("Sheet1");
	Row row = s.getRow(3);
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	System.out.println("cell count" +physicalNumberOfCells);
	//for (Row row1 : s) {
		//for (Cell cell : row1) {
			//System.out.println(cell);
			
	//	}
	//}
	System.out.println("===========================");
for (int i = 0; i < 2; i++) {
	Row row2 = s.getRow(i);
	for (int j = 0; j < 2; j++) {
		Cell cell = row2.getCell(j);
		System.out.println(cell);
	}
	
}

	
	
	//Cell cell = r.getCell(4);
	//System.out.println(cell);
	
	
}
}
//for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
		//Row row2 = s.getRow(i);
		//for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
			//Cell cell = row2.getCell(j);
			//System.out.println(cell);
		//}
