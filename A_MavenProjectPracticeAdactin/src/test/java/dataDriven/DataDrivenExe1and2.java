package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExe1and2 {
public static void main(String[] args) throws IOException {
	File f=new File("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\Book1.xlsx");
	FileInputStream fin=new FileInputStream(f);
	
	Workbook w =new XSSFWorkbook(fin);
	Sheet s = w.getSheet("Sheet1");
	int physicalNumberOfRows = s.getPhysicalNumberOfRows();
	System.out.println("Rows Count:"+physicalNumberOfRows);
	Row row = s.getRow(2);
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
System.out.println("cell count:"+physicalNumberOfCells);
System.out.println("**************************************************************************");
for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
Row row2 = s.getRow(i);	
for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
Cell cell = row2.getCell(j);
System.out.println(cell);
}
}
Row createRow = s.createRow(4);
System.out.println(createRow);
}
}
