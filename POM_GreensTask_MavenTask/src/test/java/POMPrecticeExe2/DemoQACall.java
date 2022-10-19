package POMPrecticeExe2;

import POMPrecticeExe1.BaseClass;

public class DemoQACall extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		browserConChrome();
		openApplication("http://demo.automationtesting.in/Register.html");
		maximizeWindow();
		DemoQA1 a =new DemoQA1();
		inputText(a.getFirstName(),"Naveen");
		inputText(a.getLastName(),"Kumar");
		inputText(a.getAddress(),"96 north street,chennai-600044");
		inputText(a.getEmailAddress(),"naveen@gmail.com");
		inputText(a.getPhoneNumber(),"9978787867");
		inputText(a.getPassword(),"12345678");
		inputText(a.getConfirmPassword(),"12345678");
		
		DemoQA2 b =new DemoQA2();
		click(b.getRadio());
		click(b.getHobbiesCricket());
		click(b.getHobbiesHockey());
		click(b.getHobbiesMovies());
		
		Thread.sleep(5000);
		DemoQA3 c =new DemoQA3();
		//dropValue(c.getTextYear(),"1916");
		//dropValue(c.getTextLanguage(),"Australia");
		dropDown(c.getTextLanguage(),3);
		//dropdown(c.getTextSkill(),3);
		//dropdown(c.getTextSelectCountry(),3);
		//dropdown(c.getTextYear(),10);
		//dropdown(c.getTextMonth(),12);
		//dropdown(c.getTextDay(),10);
		
	}

}
