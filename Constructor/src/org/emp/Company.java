package org.emp;
//class non para /para constructor
public class Company {
 public Company() {
	System.out.println("default constructor");
}
 
 public Company(int id) {
	 this();
	 System.out.println("Int para constructor:" +id);
	 
 }
 public Company(String s)
 {
	 this(100);
	 System.out.println("string para constructor:" +s);
 }
 public static void main(String[] args) {
	Company c = new Company("Java");
 }
 
}
