package waitAndWebTable;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {
	public static void main(String[] args) throws IOException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");		
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "E:\\projects\\automation_testing\\March4\\driver\\msedgedriver.exe");

		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://letcode.in/table");
		//getting the webelement ref for table
		WebElement tab = driver.findElement(By.id("simpletable"));
		// to print the only the header using tagname TH
		List<WebElement> tabH = tab.findElements(By.tagName("th"));
		//getting each element
		for (WebElement w : tabH) {
			//printing the text from  each element
			System.out.println(w.getText());
		}
		//getting all row in table body
		List<WebElement> allRow = driver.findElements(By.xpath("//table[@id='simpletable']//tbody//tr"));
		for (WebElement eachRow : allRow) {
			System.out.println(eachRow.getText());
		}
		// to get the particular column
		for (WebElement eachRow : allRow) {
			List<WebElement> allData = eachRow.findElements(By.tagName("td"));
			WebElement secColumn = allData.get(1);
			String text = secColumn.getText();
			System.out.println(text);
			// to click the dynamic element
			// to get all row
			for (int i = 0; i <allRow.size(); i++) {
				//getting each row
				WebElement wrow = allRow.get(i);
				List<WebElement> cData = wrow.findElements(By.tagName("td"));
				//getting the lastname column date
				WebElement w = cData.get(1);
				String text1= w.getText();
				//Thread.sleep(3000);
				if(text1.equalsIgnoreCase("Chatterjee")) {
					WebElement check = cData.get(3).findElement(By.tagName("input"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", check);
					//check.click();
				}
				
			}
		}
}
}