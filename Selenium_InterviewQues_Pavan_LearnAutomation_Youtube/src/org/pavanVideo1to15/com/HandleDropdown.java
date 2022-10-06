package org.pavanVideo1to15.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement ddnCountry = driver.findElement(By.id("input-country"));
Select s =new Select(ddnCountry);
//s.selectByValue("10");
//s.selectByVisibleText("Antigua and Barbuda");
//s.selectByIndex(10);
List<WebElement> Alloptions = s.getOptions();
for (WebElement x : Alloptions) {
	if(x.getText().equals("Cuba")) {
		x.click();
		//break;
	}
}
	}

}
