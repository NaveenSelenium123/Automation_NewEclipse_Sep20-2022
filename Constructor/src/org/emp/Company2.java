package org.emp;
//constructor chaining----super,this keyword
public class Company2 extends Employee {
public Company2()  {
	super(200);
	System.out.println("default constructor");
}
public Company2(int id) {
	this();
	System.out.println("int para constructor:"+id);
}
public Company2(String s) {
	this(100);
	System.out.println("string para constructor"+s);
	
}
public static void main(String[] args) {
	Company2 c =new Company2("Java");
}
}
