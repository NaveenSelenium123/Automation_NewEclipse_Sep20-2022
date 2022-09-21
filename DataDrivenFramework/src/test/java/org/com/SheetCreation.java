package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SheetCreation {
public static void main(String[] args) throws IOException {
	File f =new File("E:\\projects\\DataDrivenFramework\\folder\\TestDatagit.xlsx");
	FileInputStream fin =new FileInputStream(f);
	Workbook w =new XSSFWorkbook(fin);
	Sheet createSheet = w.createSheet("New");
	Row createRow = createSheet.createRow(2);
	Cell createCell = createRow.createCell(2);
	createCell.setCellValue("hello world---");
	FileOutputStream fout =new FileOutputStream(f);
	w.write(fout);

	System.out.println("Done...........");
	
}
}
