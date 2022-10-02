package org.com;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClickLink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	//WebElement lnk = driver.findElement(By.id("monday"));
	//lnk.click();
	//select all check boxes
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'  and contains(@id,'day')]"));
	System.out.println("total no of checkbox:"+checkboxes.size());
//	for(int i=0;i<checkboxes.size();i++) {
//		checkboxes.get(i).click();
//		//for each method
//		for (WebElement chbx : checkboxes) {
//			chbx.click();
//		}
//	}
//	for (WebElement chbx1 : checkboxes) {
//		chbx1.click();
//	}
	//select monday and sunday
//	for (WebElement chbx2 : checkboxes) {
//		String checkboxname = chbx2.getAttribute("id");
//		if(checkboxname.equals("monday") ||checkboxname.equals("sunday")) {
//			chbx2 .click();
//	}
//}   // to select the last two checkboxes
	int totalCheckbox = checkboxes.size();	
	
	for(int i=totalCheckbox-2;i<totalCheckbox;i++) {
		checkboxes .get(i).click();
	}	
}
}