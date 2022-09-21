package org.java;

import java.util.Enumeration;
import java.util.Vector;

public class New {
public static void main(String[] args) {
	Vector<Integer> v =new Vector<>();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	Enumeration<Integer> elements = v.elements();
	while(elements.hasMoreElements()) {
		Integer integer = elements.nextElement();
		System.out.println(integer);
	}
}
}
