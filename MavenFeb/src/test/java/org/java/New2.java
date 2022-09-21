package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class New2 {
public static void main(String[] args) {
	List<Integer> l =new ArrayList<>();
	l.add(100);
	l.add(200);
	l.add(300);
	l.add(400);
	l.add(500);
	ListIterator<Integer> listIterator = l.listIterator();
	System.out.println("Transverse in forward direction");
	while(listIterator.hasNext()) {
		Integer next = listIterator.next();
		System.out.println(next);
		if(next == 300) {
			listIterator.remove();
		}
	}
	System.out.println(l);
	System.out.println("Traverse in backward direction");
	while(listIterator.hasPrevious()) {
		Integer previous = listIterator.previous();
		System.out.println(previous);
	}
}
}
