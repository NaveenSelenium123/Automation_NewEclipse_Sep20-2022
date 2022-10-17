package checkBox_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExe1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple mobile"+Keys.ENTER);
}
}


/*SELENIUM
---------
DAY 3
---------
1.Locator(xpath)
2.Radio button,checkbox, Button

QUESTIONS(Theory)
-----------------
1.What are the different types of xpath?
2.What is xpath? Why we are going for xpath?
3.What are the Types of xpath?
4.What is the difference between Absolute xpath and Relative xpath?
5.What are the differenece between / and // ?
6.What is the difference between Radio and CheckBox button?
7.What is the method used to perform click?
8.What are the xpath functions?
9.How will you select a female Radio Button and write a code for it ?
10.Write a code for selecting a Radio Button and  CheckBox button click ?
11.What are the methods available in xpath?
 
 
QUESTIONS-(Practical)
--------------------
QUESTION 1
-----------
URL : https://www.amazon.in/

NOTE: Click start here. Enter iphone and search

QUESTION 2
-----------
URL : https://www.facebook.com/

NOTE: Enter email and password and click login(by using xpath locator).

QUESTION 3
-----------
URL : http://demo.automationtesting.in/Register.html

NOTE: Give details and register the form.

QUESTION 4
-----------
URL : http://toolsqa.com/automation-practice-form/

NOTE: Give details and register the form.

QUESTION 5
-----------
URL : http://greenstech.in/selenium-course-content.html

NOTE: Click interview question +.
      Click cts  interview question

QUESTION 6
----------
URL : https://www.redbus.in/

NOTE: Click ^[opposite of this] and  signin/signup 
      Enter Mobilenumber and click Generate OTP

QUESTION 7
----------
URL : https://www.cleartrip.com/trains

NOTE: Enter From ,TO  and click search trains

QUESTION 8
-----------
URL :http://greenstech.in/selenium-course-content.html

NOTE: Click Model Reume + and click Resume Model 1

QUESTION 9
-----------
URL : https://www.flipkart.com/

NOTE: Click Login and Entere Username password 

QUESTION 10
-----------
URL : https://www.amazon.in/

NOTE: Click any  product and click search

QUESTION 11
-----------
URL : https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp

NOTE: Give details and register the form.

QUESTION 12
-----------
URL : https://www.snapdeal.com/

NOTE: Click signin and click new register and enter mobile number abd click continue.

QUESTION 13
-----------
URL : https://www.myntra.com/register?referer=https://www.myntra.com/

NOTE: Enter Mobile number and click continue


QUESTION 14
------------
URL : https://www.swiggy.com/

NOTE: Click sign up and Give details and register the form.*/