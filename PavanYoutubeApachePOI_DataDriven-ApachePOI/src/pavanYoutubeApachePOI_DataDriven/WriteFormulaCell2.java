package pavanYoutubeApachePOI_DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFormulaCell2 {

	public static void main(String[] args) throws IOException {
String path=".\\dataFiles\\Books.xlsx";
FileInputStream fis=new FileInputStream(path);
XSSFWorkbook workbook =new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheetAt(0);
sheet.getRow(7).getCell(2).setCellFormula("SUM(C2:C6)");
	fis.close();
	FileOutputStream outputstream=new FileOutputStream(path);
	workbook.write(outputstream);	
	workbook.close();
	outputstream.close();
	System.out.println("cal.xlsx File written successfully");	
	
	}

}
