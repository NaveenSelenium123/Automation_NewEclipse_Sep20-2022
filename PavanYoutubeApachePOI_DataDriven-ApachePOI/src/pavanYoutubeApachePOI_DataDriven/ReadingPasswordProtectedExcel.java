package pavanYoutubeApachePOI_DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingPasswordProtectedExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path=".\\dataFiles\\customers.xlsx";
		FileInputStream fis=new FileInputStream(path);
String password="123456";
XSSFWorkbook workbook=(XSSFWorkbook) WorkbookFactory.create(fis,password);
XSSFSheet sheet = workbook.getSheetAt(0);

//int rows = sheet.getLastRowNum();
//	System.out.println(rows);
//int cols = sheet.getRow(0).getLastCellNum();
//System.out.println(cols);
//
//
//for(int r=0;r<=rows;r++) {
//	XSSFRow row = sheet.getRow(r);
//	for(int c=0;c<cols;c++) {
//		XSSFCell cell = row.getCell(c);
//		switch(cell.getCellType())
//	{
//	case STRING: System.out.print(cell.getStringCellValue());break;
//	case NUMERIC: System.out.print(cell.getNumericCellValue());break;
//	case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
//	}
//	System.out.print(" | ");
//	}
//	System.out.println();
//	}


//read data from using iterator

Iterator<Row> iterator = sheet.iterator();
while(iterator.hasNext()) {
	XSSFRow row= (XSSFRow) iterator.next();
	Iterator<Cell> cellIterator = row.cellIterator();
	while(cellIterator.hasNext()) {
		XSSFCell cell = (XSSFCell) cellIterator.next();
	
		switch(cell.getCellType())
	{
		case STRING: System.out.print(cell.getStringCellValue());break;
		case NUMERIC: System.out.print(cell.getNumericCellValue());break;
		case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
		}
		System.out.print(" | ");
		}
		System.out.println();
	}
workbook.close();
fis.close();
}
	}


