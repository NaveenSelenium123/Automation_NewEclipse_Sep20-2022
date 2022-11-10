package JavaDay08_Set_List;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exe3_1 {
	public static void main(String[] args) {
		Set<Integer> a =new LinkedHashSet();
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
		for (Integer i: a) {
			System.out.println(i);
			
		}

}
}