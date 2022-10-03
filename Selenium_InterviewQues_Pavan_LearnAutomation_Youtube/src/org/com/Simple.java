package org.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'  and contains(@id,'day')]"));
	System.out.println("total no of checkbox:"+checkboxes.size());
	
int totalCheckbox = checkboxes.size();	
//	
//	for(int i=0;i<totalCheckbox;i++) {
//		if( i%2 == 1){
//		checkboxes .get(i).click();
//	}	
//}
// check box click in revese order
for(int i=totalCheckbox-1;i>=0;i--) {
	Thread.sleep(3000);
	checkboxes .get(i).click();
}
}
}