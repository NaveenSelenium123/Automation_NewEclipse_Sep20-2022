package Collection_Day14;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Day15 {
public static void main(String[] args) {
	Set<Integer> s =new TreeSet();
	s.add(10);
	s.add(50);
	s.add(30);
	s.add(20);
	s.add(10);
	System.out.println(s);
	for (Integer x : s) {
		System.out.println(x);
	}
	// To remove duplicate
	
	List<Integer> li =new ArrayList();
	li.add(10);
	li.add(20);
	li.add(20);
	li.add(40);
	System.out.println(li);
	Set<Integer> s1 =new LinkedHashSet();
	s1.addAll(li);
	System.out.println(s1);
	boolean contains = s1.contains(50);
	System.out.println(contains);
	
}
}
