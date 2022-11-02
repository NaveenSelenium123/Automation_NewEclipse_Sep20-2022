package dataDriven;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class DataDrivenExe10 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		BaseClassAdactin b =new BaseClassAdactin();
		b.browserConfigChrome();
		b.openApplication("https://my.naukri.com/account/register/basicdetails");
		b.maximizeWindow();
		Thread.sleep(3000);
		//full name
		WebElement txtUser = b.locateById("name");
		b.inputText(txtUser,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1, 7));
		//email id
		WebElement txtEmail = b.locateById("email");
		b.inputText(txtEmail,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1, 7));
		//password
		WebElement txtPassword= b.locateById("password");
		b.inputText(txtPassword,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1, 7));
		//mobile
		WebElement txtMobile = b.locateById("mobile");
		b.inputText(txtMobile,b.excelRead("E:\\Windows_Old Eclipse Projects\\DataDriven_GreensTask_MavenProject\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 1, 7));
		//work status
		WebElement txtWorkStatus = b.locateByXpath("//div[@data-val='exp']");
		txtWorkStatus.click();
		//register now
		WebElement btnRegisterNow = b.locateByXpath("//button[@type='submit']");
		btnRegisterNow.click();
	}

}


