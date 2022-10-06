package org.pavanVideo1to15.com;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElementAndFindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement searchTerm = driver.findElement(By.id("small-searchterms"));
		searchTerm.sendKeys("Naveen");
		WebElement siteMap = driver.findElement(By.xpath("//body/div[6]/div[4]/div[1]//a"));
		System.out.println(siteMap.getText());
		
		List<WebElement> link = driver.findElements(By.xpath("//body/div[6]/div[4]/div[1]//a"));
		System.out.println("Total no of link available" +link.size());
		for (WebElement x : link) {
			System.out.println(x.getText());
		}
		List<WebElement> wrongXpath = driver.findElements(By.id("sml-searchterms"));
		System.out.println("Total no of link available" +wrongXpath.size());
	}

}
