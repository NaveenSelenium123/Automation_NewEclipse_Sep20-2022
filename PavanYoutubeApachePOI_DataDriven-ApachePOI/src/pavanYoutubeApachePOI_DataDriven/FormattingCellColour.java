package pavanYoutubeApachePOI_DataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormattingCellColour {
public static void main(String[] args) throws IOException {
	XSSFWorkbook workbook =new XSSFWorkbook ();
	XSSFSheet sheet = workbook.createSheet("Sheet1");
	XSSFRow row = sheet.createRow(1);
	
	//setting background colour
	XSSFCellStyle style = workbook.createCellStyle();
	style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
style.setFillPattern(FillPatternType.BIG_SPOTS);

XSSFCell cell = row.createCell(1);
cell.setCellValue("Naveen");
cell.setCellStyle(style);
	

//setting foreground colour
style = workbook.createCellStyle();
style.setFillBackgroundColor(IndexedColors.RED.getIndex());
//style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//style.setFillPattern(FillPatternType.BIG_SPOTS);
//style.setFillPattern(FillPatternType.THICK_VERT_BANDS);
style.setFillPattern(FillPatternType.DIAMONDS);



cell = row.createCell(2);
cell.setCellValue("Naveen1234");
cell.setCellStyle(style);


String filePath=".\\dataFiles\\COLOURSNEW.xlsx";
FileOutputStream outputstream=new FileOutputStream(filePath);
workbook.write(outputstream);	
outputstream.close();
System.out.println("File written successfully");


}
}
