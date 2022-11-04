package dropDown_Day09;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropDownExe12Updated {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\A_Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select s =new Select(fruit);
		List<WebElement> all = s.getOptions();
		int size = all.size();
		System.out.println("The total elements in dropdown"  +size);
		for (int i = 0; i < size; i++) {
			if(i %2 ==1) {
			all.get(i).click();
			}
		}
		List<WebElement> allSelect = s.getAllSelectedOptions();
		int allS = allSelect.size();
System.out.println("The total options selected in the dropdown"  +allS);		
		System.out.println("The total options not selected in the dropdown"+" ");
		System.out.println( size-allS);
		
	}
}
