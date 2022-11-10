package JavaDay08_Set_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exe2_2 {
	public static void main(String[] args) {
		
		List<Integer>a =new ArrayList();
		a.add(105);
		a.add(205);
		a.add(305);
		a.add(405);
		a.add(505);
		a.add(605);
		a.add(705);
		a.add(805);
		a.add(505);
		a.add(605);
		
		Set <Integer> z =new TreeSet();
		z.addAll(a);
		System.out.println(z);
	}

}
