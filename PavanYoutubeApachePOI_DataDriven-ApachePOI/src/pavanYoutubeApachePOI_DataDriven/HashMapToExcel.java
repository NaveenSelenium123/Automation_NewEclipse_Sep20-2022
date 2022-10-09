package pavanYoutubeApachePOI_DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMapToExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook =new XSSFWorkbook ();
		XSSFSheet sheet = workbook.createSheet("Student Sheet1");
		Map<String,String> data=new HashMap<String,String>();
data.put("101","Naveen");
data.put("102","Narenn");
data.put("103","Nadgethn");
data.put("104","NpABn");
data.put("105","seleen");

int rowno=0;
for(Map.Entry entry:data.entrySet()) {
	XSSFRow row = sheet.createRow(rowno++);
row.createCell(0).setCellValue((String)entry.getKey());
row.createCell(1).setCellValue((String)entry.getValue());	
}
String filePath=".\\dataFiles\\student.xlsx";
FileOutputStream outputstream=new FileOutputStream(filePath);
workbook.write(outputstream);	
outputstream.close();
System.out.println("File written successfully");
	}
}
