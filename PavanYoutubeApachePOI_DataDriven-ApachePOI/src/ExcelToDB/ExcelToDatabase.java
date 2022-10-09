package ExcelToDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelToDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//Database connection
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","system");
		Statement stmt=con.createStatement();	
				//create a new table in the database 'places'
				String sql="create table people(LOCATION_ID decimal(4,0), STREET_ADDRESS varchar(40),POSTAL_CODE varchar(12),CITY varchar(30),STATE_PROVINCE varchar(25),COUNTRY_ID varchar(2))";
				stmt.execute(sql);
				//Excel
				FileInputStream fis=new FileInputStream(".\\dataFiles\\locations.xlsx");
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				XSSFSheet sheet=workbook.getSheet("Locations Data");
				
				int rows=sheet.getLastRowNum();
				
				for(int r=1;r<=rows;r++)
				{
					XSSFRow row=sheet.getRow(r);
					double locId=row.getCell(0).getNumericCellValue();
					String streatAdd=row.getCell(1).getStringCellValue();
					String postalCode=row.getCell(2).getStringCellValue();
					String city=row.getCell(3).getStringCellValue();
					String stateProv=row.getCell(4).getStringCellValue();
					String countryId=row.getCell(5).getStringCellValue();
					
					sql="insert into people values('"+locId+"', '"+streatAdd+"', '"+postalCode+"', '"+city+"', '"+stateProv+"', '"+countryId+"')";
					stmt.execute(sql);
					stmt.execute("commit");
				}
				workbook.close();
				fis.close();
				con.close();
				System.out.println("Done!!");
	}

}
