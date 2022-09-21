package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
	public static void main(String[] args) throws IOException {
		File f =new File("E:\\projects\\DataDrivenFramework\\folder\\TestDatagit.xlsx");
		FileInputStream fin =new FileInputStream(f);
		Workbook w =new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Sheet1");
		Row r= s.getRow(2);
		Cell cell = r.getCell(4);
		int cellType = cell.getCellType();
		System.out.println(cellType);
		if(cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}else if(cellType == 0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat =new SimpleDateFormat("dd/mm/yyyy");
				String format = dateformat.format(dateCellValue);
				System.out.println( format);
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long l =(long) numericCellValue;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
			}
		}
		
		
	}

}
