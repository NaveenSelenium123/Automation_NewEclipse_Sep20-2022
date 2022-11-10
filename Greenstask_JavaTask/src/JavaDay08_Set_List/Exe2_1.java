package JavaDay08_Set_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exe2_1 {
	public static void main(String[] args) {
		
		List<Integer>a =new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		Set <Integer> z =new TreeSet();
		z.addAll(a);
		System.out.println(z);
	}	

}
