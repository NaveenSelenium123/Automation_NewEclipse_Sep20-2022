package practiceExternal;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\SeleniumDayOne\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/download");
		WebElement downloadLink = driver.findElement(By.xpath("//a[text()='flower.jpeg']"));
		downloadLink.click();
		
		//Downloads
		File f =new File("D:\\JAVA --FILE HANDLING");
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			if(file.getName().equals("flower.jpeg")) {
				System.out.println("File is downloaded");
				break;
			}
		}
	}

	}


