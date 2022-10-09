package pavanVideo;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WritthingExcelDemo2 {
	public static void main(String[] args) throws IOException {
XSSFWorkbook workbook =new 	XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("Emp Info1");
ArrayList<Object[]> empdata =new ArrayList<Object[]>();
empdata.add(new Object[]{"EmpId","Name","Job"});
empdata.add(new Object[]{"EmpId1","Name2","Job2"});
empdata.add(new Object[]{"EmpId2","Namke","Jobj"});
empdata.add(new Object[]{"EmpId2","Namke","Jo7b"});
empdata.add(new Object[]{"EmpId2","Nam3e","Jo4b"});
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
String filePath=".\\dataFiles\\Employee123.xlsx";
FileOutputStream outputstream=new FileOutputStream(filePath);
workbook.write(outputstream);	
outputstream.close();
System.out.println("File written successfully");
	}
}

