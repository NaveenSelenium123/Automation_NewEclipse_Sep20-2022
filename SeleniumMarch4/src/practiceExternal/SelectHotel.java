package practiceExternal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectHotel {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");		
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	WebElement txtUserName = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
	 txtUserName.sendKeys("user@phptravels.com");
	 WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
	 txtPassword.sendKeys("demouser");
	 WebElement txtCheck = driver.findElement(By.xpath("(//label[@for='rememberchb'])[1]"));
	 txtCheck.click();
	 WebElement btnLogin = driver.findElement(By.xpath("(//span[@class='ladda-label'])[1]"));
	 btnLogin.click();
	 WebElement selectHotel = driver.findElement(By.xpath("(//a[@title='home'])[2]"));
	 selectHotel.click();
	 Thread.sleep(3000);
	//WebElement selectPlace = driver.findElement(By.id("select2-hotels_city-container"));
	// WebElement  selectPlace= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	 //WebElement  selectPlace= driver.findElement(By.xpath("//span[@title=' Search by City']"));
	 WebElement selectPlace = driver.findElement(By.xpath("//*[@id=\"fadein\"]/span/span/span[1]/input"));
	selectPlace.sendKeys("Chennai,India");
	// WebElement selectPerson = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	// Select s =new Select(selectPerson);
	// s.selectByIndex(1);
	 //WebElement selectCountry = driver.findElement(By.id("nationality"));
	 //Select s1=new Select(selectCountry);
	 //s1.selectByVisibleText("India"); 
	 WebElement btnSearch = driver.findElement(By.xpath("//span[@class='ladda-label']"));
	 btnSearch.click();
}
}