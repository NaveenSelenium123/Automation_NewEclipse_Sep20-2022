package org.pavanVideo1to15.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JqueryDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	driver.findElement(By.id("justAnInputBox")).click();
	//selectChoiceValues(driver,"choice 1");
	//selectChoiceValues(driver,"choice 1","choice 2 3","choice 6","choice 6 2 1","choice 6 2");
	selectChoiceValues(driver,"all");
	}

public static void selectChoiceValues(WebDriver driver,String... value) {
	
List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
if(!value[0].equalsIgnoreCase("all")) {
	for (WebElement item : choiceList) {
		 String text = item.getText();
		 for(String val:value) {
			 if(text.equals(val)) {
				 item.click();
				 break;
			 }
		 }
	}
}

else
{
	try {
		for(WebElement item:choiceList) {
			item.click();
		}	
	}
	catch(Exception e) {
		
	}
}
}
}
