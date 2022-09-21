package org.emp;
//constructor chaining----super,this keyword
public class Employee {
public Employee() {
	System.out.println("parent default constructor");
}
public Employee(int i) {
	this("Selenium");
	System.out.println("parent int para constructor:" +i);
}
public Employee(String s) {
	this();
	System.out.println("parent string para constructor:" +s);
	
}
}
