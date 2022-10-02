package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SizeAndLocationofElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));

		//Location -method1
		System.out.println("Location(x,y)"+logo.getLocation());
		System.out.println("Location(x)"+logo.getLocation().getX());	
		System.out.println("Location(y)"+logo.getLocation().getY());			
	

		//Location -method2
		System.out.println("Location(x)"+logo.getRect().getX());
		System.out.println("Location(y)"+logo.getRect().getY());	

		
		//Size -method1
		System.out.println("Size(Width,Height):" +logo.getSize());
		System.out.println("Size(Width):" +logo.getSize().getWidth());
		System.out.println("Size(Height):" +logo.getSize().getHeight());
	
	//size - method2
	
		System.out.println("Size(Width):" +logo.getRect().getDimension().getWidth());
		System.out.println("Size(Height):" +logo.getRect().getDimension().getHeight());
	}
}
