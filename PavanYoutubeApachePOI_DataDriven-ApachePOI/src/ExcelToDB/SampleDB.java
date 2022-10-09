package ExcelToDB;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class SampleDB {
public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","system");
	Statement stmt = con.createStatement();
	String sql="create table shop9 (fruit varchar(20),juice varchar(20),sno int)";
	stmt.execute(sql);
	//excel
	String excelFilePath=".\\ExcelData\\pen.xlsx";
	FileInputStream inputstream=new FileInputStream(excelFilePath);
	XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int rows = sheet.getLastRowNum();
	for(int r=1;r<=rows;r++) {
	XSSFRow row = sheet.getRow(r);	
	String fruit=row.getCell(0).getStringCellValue();
	String juice=row.getCell(1).getStringCellValue();
	double sno=row.getCell(2).getNumericCellValue();
	sql="insert into shop9 values('"+fruit+"', '"+juice+"','"+sno+"')";
	stmt.execute(sql);
	stmt.execute("COMMIT");	
	}
	workbook.close();
	inputstream.close();
	con.close();
	System.out.println("Done");

}
}
