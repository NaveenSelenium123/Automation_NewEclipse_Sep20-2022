package Day07_Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exe9_3 {
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
			a.add(30);
			
			//int length=a.size();
			//System.out.println(length);
			
			boolean replaceAll = Collections.replaceAll(a, 10, 100);
			//System.out.println(replaceAll);
			System.out.println(a);
		}

}
