package org.pavanVideo1to15.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		WebElement country = driver.findElement(By.xpath("(//div[@class='item selected'])[1]"));
        WebElement state = driver.findElement(By.xpath("//div[@class='menu transition visible']"));
        WebElement skills = driver.findElement(By.xpath("//div[@class='menu transition visible']"));
        selectOptionFromDropdown(country,"Afghanistan");
        selectOptionFromDropdown(state,"Alaska");
        selectOptionFromDropdown(skills,"Ember");
	}
public static void selectOptionFromDropdown(WebElement element,String value) {
	Select s =new Select(element);
	List<WebElement> Alloptions = s.getOptions();
	for (WebElement x : Alloptions) {
		if(x.getText().equals(value)) {
			x.click();
			break;
		}
	}

}
}
