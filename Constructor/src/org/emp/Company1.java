package org.emp;
//constructor chaining
public class Company1 {
public Company1() {
	System.out.println("default constructor");
}
public Company1(int id) {
	this();
	System.out.println("Int para constructor:" +id);
}
public Company1(String s) {
	this(100);
	System.out.println("string para constructor:" +s);
}
public static void main(String[] args) {
	Company c =new Company("Java");
}


}
