package JavaDay08_Set_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exe2_3 {
	public static void main(String[] args) {
		
		List<Integer>a =new ArrayList();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		a.add(100);
		a.add(300);
		a.add(500);
		
		Set <Integer> z =new TreeSet();
		z.addAll(a);
		System.out.println(z);
	}	

}
