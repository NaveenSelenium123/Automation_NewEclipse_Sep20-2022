package pavanYoutubeApachePOI_DataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataBaseToExcel {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","system");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from employees");


//Excel
XSSFWorkbook workbook =new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("Employees Data");
XSSFRow row = sheet.createRow(0);
row.createCell(0).setCellValue("EMPLOYEE_ID");
row.createCell(1).setCellValue("FIRST_NAME");
row.createCell(2).setCellValue("LAST_NAME");
row.createCell(3).setCellValue("EMAIL");

int r=1;
while(rs.next())
{
	double id = rs.getDouble("EMPLOYEE_ID");
	String Firstname = rs.getString("FIRST_NAME");
	String Lastname = rs.getString("LAST_NAME");
	String Email = rs.getString("EMAIL");
	
	row = sheet.createRow(r++);
	row.createCell(0).setCellValue(id);
	row.createCell(1).setCellValue(Firstname);
	row.createCell(2).setCellValue(Lastname);
	row.createCell(3).setCellValue(Email);
	}

String filePath=".\\dataFiles\\employeeDB1Orcle.xlsx";
FileOutputStream outputstream=new FileOutputStream(filePath);
workbook.write(outputstream);	
outputstream.close();
System.out.println("File written successfully");
}
}
