package org.com;

public class Substring {

	public static void main(String[] args) {
		String s="Welcome to java lanagagae";
		String substring = s.substring(3);
		System.out.println(substring);
		int indexOf = s.indexOf('c');
		System.out.println(indexOf);
		
		String substring2 = s.substring(4, 7);
		System.out.println(substring2);
	}

}
