package openQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
//	WebElement firstNmae = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//	firstNmae.sendKeys("Naveen");
//	WebElement firstNmae1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//	firstNmae1.sendKeys("Naveen");
//	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Theni");
//	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
//	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("abc@gmail.com");
//	driver.findElement(By.xpath("//input[@type='radio']")).click();
//	driver.switchTo().frame(0);
//	WebElement language = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
//	driver.switchTo().frame(0);
//	Select s=new Select(language);
//	s.selectByIndex(5);
//	WebElement skl = driver.findElement(By.id("Skills"));
//	Select s=new Select(skl);
//	s.selectByIndex(5);
//	Thread.sleep(3000);
//	driver.switchTo().frame(0);
//	WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
//	//WebElement country = driver.findElement(By.id("countries"));
//	Select s1=new Select(country);
//	s1.selectByIndex(5);
//	WebElement year = driver.findElement(By.id("yearbox"));
//	WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
//	WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
//	dropdwon(year,3);
//	dropdwon(month,3);
//	dropdwon(day,3);
	//WebElement country = driver.findElement(By.xpath("(//li[@class='select2-results__option'])[1]"));
//	Thread.sleep(3000);
//	WebElement country = driver.findElement(By.className("select2-results__option"));
//	dropdwon(country,1);
	driver.get("https://www.dinamalar.com/");
	WebElement tamil = driver.findElement(By.xpath("//*[@id=\"menscroll\"]/div[3]/div/nav/ul/li[4]/a/b"));
	System.out.println(tamil.getText());
	
	
}
public static WebElement  dropdwon( WebElement element,int Value) {
	Select s1=new Select(element);
	s1.selectByIndex(Value);
	return element;	

}
}
