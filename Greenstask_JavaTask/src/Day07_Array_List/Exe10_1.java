package Day07_Array_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;       //10,20,30,90,10,10,40,50

public class Exe10_1 {
	public static void main(String[] args) {
		List <Integer> a =new ArrayList<Integer>();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(90);
			a.add(10);
			a.add(10);
			a.add(40);
			a.add(50);
			
			List<Integer>  a1 =new LinkedList<Integer>();
			a1.add(30);
			a1.add(40);
			a1.add(50);
			a1.add(60);
			a1.add(80);
			a.retainAll(a1);
			System.out.println(a);
			
	}
}
