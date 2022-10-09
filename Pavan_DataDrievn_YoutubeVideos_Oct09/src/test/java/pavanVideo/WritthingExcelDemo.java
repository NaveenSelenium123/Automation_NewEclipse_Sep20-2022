package pavanVideo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritthingExcelDemo {

	public static void main(String[] args) throws IOException {
XSSFWorkbook workbook =new 	XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("Emp Info1");
Object empdata[][]= { {"EmpId","Name","Job"},
	{"101","Name1","Job3"},
	{"102","Name2","Job3"},
	{"103","Name2","Job4"},
};

//int rows = empdata.length;
//int cols=empdata[0].length;
//
//
//System.out.println(rows);
//System.out.println(cols);
//
//for(int r=0;r<rows;r++)
//{
//	XSSFRow row=sheet.createRow(r);
//	for(int c=0;c<cols;c++) {
//		XSSFCell cell = row.createCell(c);
//		Object value=empdata[r][c];
//		if(value instanceof String)
//		cell.setCellValue((String)value);
//		if(value instanceof Integer)
//			cell.setCellValue((Integer)value);
//		if(value instanceof Boolean)
//			cell.setCellValue((Boolean)value);
//		
//		
//	}
//}


int rowCount=0;
for (Object emp[] : empdata) {
	XSSFRow row = sheet.createRow(rowCount++);
	int columnCount=0;
	for (Object value : emp) {
		XSSFCell cell = row.createCell(columnCount++);
		if(value instanceof String)
			cell.setCellValue((String)value);
			if(value instanceof Integer)
				cell.setCellValue((Integer)value);
			if(value instanceof Boolean)
				cell.setCellValue((Boolean)value);
	
	
	
	}
}




String filePath=".\\dataFiles\\Employee.xlsx";
FileOutputStream outputstream=new FileOutputStream(filePath);
workbook.write(outputstream);	
outputstream.close();
System.out.println("File written successfully");
	}

}

