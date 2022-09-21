package org.test;

public class B {
	public static void main(String[] args) {
		A a =new A();
		int result = a.add(10, 20);
		if(result == 50) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}

}
