package JavaDay08_Set_List;

import java.util.Set;
import java.util.TreeSet;

public class Exe3_2 {
	public static void main(String[] args) {
	Set<Integer> a =new TreeSet();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	a.add(60);
	a.add(70);
	a.add(80);
	a.add(90);
	a.add(10);
	a.add(20);	
	for (Integer i: a) {
		System.out.println(i);
		
	}

}
}