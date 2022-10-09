package pavanYoutubeApachePOI_DataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingWithDateCells {

	public static void main(String[] args) throws IOException {
//create blank workbook
XSSFWorkbook workbook =new 	XSSFWorkbook();

//create a blank sheet
XSSFSheet sheet = workbook.createSheet("Date formats");

//Date in number format
XSSFCell cell = sheet.createRow(0).createCell(0);
cell.setCellValue(new Date());

XSSFCreationHelper creationHelper=workbook.getCreationHelper();

//format1: dd-mm-yyyy
XSSFCellStyle style1 = workbook.createCellStyle();
style1.setDataFormat(creationHelper.createDataFormat().getFormat("dd-mm-yyyy"));
XSSFCell cell1 = sheet.createRow(1).createCell(0);
cell1.setCellValue(new Date());
cell1.setCellStyle(style1);


//format2: dd-mm-yyyy
XSSFCellStyle style2 = workbook.createCellStyle();
style2.setDataFormat(creationHelper.createDataFormat().getFormat("mm-dd-yyyy"));
XSSFCell cell2 = sheet.createRow(2).createCell(0);
cell2.setCellValue(new Date());
cell2.setCellStyle(style2);


//format3: dd-mm-yyyy hh:mm:ss
XSSFCellStyle style3 = workbook.createCellStyle();
style3.setDataFormat(creationHelper.createDataFormat().getFormat("mm-dd-yyyy hh:mm:ss"));
XSSFCell cell3 = sheet.createRow(3).createCell(0);
cell3.setCellValue(new Date());
cell3.setCellStyle(style3);


//format4:  hh:mm:ss
XSSFCellStyle style4 = workbook.createCellStyle();
style4.setDataFormat(creationHelper.createDataFormat().getFormat("hh:mm:ss"));
XSSFCell cell4 = sheet.createRow(4).createCell(0);
cell4.setCellValue(new Date());
cell4.setCellStyle(style4);

FileOutputStream outputstream=new FileOutputStream(".\\dataFiles\\dataformats.xlsx");
workbook.write(outputstream);	
workbook.close();
outputstream.close();
System.out.println("File written successfully");
	}

}
