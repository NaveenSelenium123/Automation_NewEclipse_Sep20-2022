package org.pavanVideo1to15.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDropDownStaticMeyhod {
WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Number of options" +productTypes.size());
		selectOptionFromDropDown(productTypes,"Cards");


	}

	public static void selectOptionFromDropDown(List<WebElement> options,String value) {
		
		for (WebElement option : options) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}	

	}
}
