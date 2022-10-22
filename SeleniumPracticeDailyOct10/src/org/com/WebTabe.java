package org.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// //*[@id="customers"]/tbody/tr[2]/td[1]
		// //*[@id="customers"]/tbody/tr[3]/td[1]
		// //*[@id="customers"]/tbody/tr[4]/td[1]
		// //*[@id="customers"]/tbody/tr[7]/td[1]
		
		
		// //*[@id="customers"]/tbody/tr[2]/td[2]
		// //*[@id="customers"]/tbody/tr[3]/td[2]
		// //*[@id="customers"]/tbody/tr[4]/td[2]
		// //*[@id="customers"]/tbody/tr[5]/td[2]
	String	beforeXpath_company="//*[@id=\"customers\"]/tbody/tr[";
	String	afterXpath_company	="]/td[1]";
	
	String	beforeXpath_contact="//*[@id=\"customers\"]/tbody/tr[";
	String	afterXpath_contact	="]/td[2]";
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	System.out.println("total no of rows" +(rows.size()-1));
	int rowCount = rows.size();
	
	//Xls_Reader reader=new Xls_Reader("");
	
	for(int i=2;i<=rowCount;i++) {
		String actualXpath=beforeXpath_company+i+afterXpath_company;
		String companyName= driver.findElement(By.xpath(actualXpath)).getText();
	System.out.println(companyName);
	
	String actualXpath_contact=beforeXpath_contact+i+afterXpath_contact;
	String contactName= driver.findElement(By.xpath(actualXpath_contact)).getText();
System.out.println(contactName);
	}

	}

}
