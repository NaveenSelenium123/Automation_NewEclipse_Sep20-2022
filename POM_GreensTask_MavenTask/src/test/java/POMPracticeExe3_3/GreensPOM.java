package POMPracticeExe3_3;

import POMPracticeExe3_1.BaseClassPOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPOM extends BaseClassPOM {
	public GreensPOM() {
		PageFactory.initElements(driver,this);
	
	}
	@FindBy(xpath="//a[text()='COURSES']")
private WebElement clickCourse;
	@FindBy(xpath="//span[text()='Java Training']")
private WebElement javaTraining;
	@FindBy(xpath="//span[text()='Core Java Training']")
private WebElement coreJavaTraining;
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
private WebElement scroll;
	@FindBy(xpath="//p[contains(text(),'I was looking out for institutions to learn Android and Java')]")
private WebElement printParagraph;
public WebElement getClickCourse() {
	return clickCourse;
}
public WebElement getJavaTraining() {
	return javaTraining;
}
public WebElement getCoreJavaTraining() {
	return coreJavaTraining;
}
public WebElement getScroll() {
	return scroll;
}
public WebElement getPrintParagraph() {
	return printParagraph;
}


}
