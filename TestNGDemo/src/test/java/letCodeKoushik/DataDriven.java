package letCodeKoushik;

import java.io.IOException;
import java.text.DateFormat;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void main(String[] args) throws IOException {
	String fileLocation ="./ExcelSheet/TestData.xlsx";
	XSSFWorkbook wbook =new XSSFWorkbook(fileLocation);
	XSSFSheet sheet= wbook.getSheetAt(0);
	int lastRowNum = sheet.getLastRowNum();
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	System.out.println(physicalNumberOfRows);
	short lastCellNum = sheet.getRow(0).getLastCellNum();
	System.out.println(lastCellNum);
	for (int i = 1; i <= lastRowNum; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; i <lastCellNum ; j++) {
			XSSFCell cell = row.getCell(j);
			DataFormatter dft =new DataFormatter();
			String value= dft.formatCellValue(cell);
			//String value = cell.getStringCellValue();
			System.out.println(value);
		} 
	}

}
}
